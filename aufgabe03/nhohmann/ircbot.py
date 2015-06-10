import sys
import threading

import socket
import re


termination = '\n\0'


class Message:
	msg_regex = re.compile(r"""^(:(?P<sender>[\S]+)\s)?
			(?P<action>[\S]+)
			(\s\#(?P<channel>[\S]+))?
			(\s(?P<extras>[^:]+))?
			(\s:(?P<message>.+))?$""", re.X)

	def __init__(self, raw):
		m = Message.msg_regex.match(raw)
		if m is None:
			self.valid = False
			return

		self.fullsender = None if m.group('sender') is None else m.group('sender').lower()
		self.sender	 = self.extractNickname(self.fullsender)
		self.action	 = m.group('action')
		self.channel	= m.group('channel')
		self.extras	 = m.group('extras')
		self.message	= m.group('message')

		self.valid = True

	def extractNickname(self, sender):
		if sender is None:
			return None

		return sender.split('!', 1)[0].lower()



class IRCClient(threading.Thread):
	def __init__(self, server, nickname):
		threading.Thread.__init__(self)

		self.socket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)

		self.nickname = nickname
		self.server = server

		self.buffer = ''

	def connect(self):
		success = False

		try:
			print 'Connecting to server %s...'%self.server
			self.socket.connect( (self.server, 6667) )
			success = True

		except Exception as e:
			print 'Could not connect to %s.'%self.server

		return success

	def disconnect(self):
		self.socket.close()
		self.socket = None

	def send(self, msg):
		msg += termination

		totalsent = 0
		while totalsent < len(msg):
			sent = self.socket.send(msg[totalsent:])
			if sent == 0:
				raise RuntimeError("socket connection broken")
			totalsent = totalsent + sent

	def sendMessage(self, msg):
		if not self.silent:
			self.send('PRIVMSG #%s :%s'%(self.channel, msg))

	def login(self):
		self.send(termination.join(['USER %s %s %s %s'%(self.nickname, self.server, self.server, self.nickname),
				'NICK '+ self.nickname]))

	def read(self):
		chunk = self.socket.recv(1024)
		if chunk == '':
			raise RuntimeError("socket connection broken")

		print self.buffer
		self.buffer += chunk

	def start(self):
		try:
			if not self.connect():
				return False

			print "test"
			self.login()
			print "test2"

			threading.Thread.start(self)

			return True

		except Exception as e:
			print e

	def run(self):
		try:
			while not self.socket is None:
				self.read()
				while termination in self.buffer:
					rawMsg, self.buffer = self.buffer.split(termination, 1);
					print "received message: "%rawMsg
					msg = Message(rawMsg)
					if not msg.valid:
						print "Unknown message:", rawMsg
						continue

					try:
						if msg.action == "PRIVMSG" and msg.message == "!say":
							self.sendMessage("hello!")
						elif msg.action == "PING":
							self.send("PONG ")
					except Exception as e:
						print "Could not handle message:", rawMsg
						print e

			print 'IRC-Client finished.'

		except Exception as e:
			print 'Fatal error:'
			print e



client = IRCClient("irc.freenode.net", "sicksheep")
if not client.start():
	print 'Could not start IRC-Client!'
	sys.exit(1)

while True:
	command = raw_input()

	if command == 'quit':
		client.disconnect()
		break

client.join()
sys.exit(0)