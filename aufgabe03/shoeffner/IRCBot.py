# -*- coding: utf8 -*-
from contextlib import closing
import socket
import time


BUFFER_SIZE = 1024
class IRCBot(object):
	def __init__(self, sock):
		self.sock = sock
	
	def connect(self, host, port):
		self.sock.connect((addr, port))
		return True

	def idle(self):
		while 1:
			request = self.sock.recv(BUFFER_SIZE)
			if '!say' in request:
				print request
				self.sock.send('PRIVMSG #codingchaos :hello!\r\n')
			if 'PING' in request:
				print request
				self.sock.send('PONG {!s}\r\n'.format(request[5:]))
			
	
	def setNick(self, nick):
		msg = 'NICK {!s}\r\n'.format(nick)
		self.sock.send(msg)
		print(self.sock.recv(BUFFER_SIZE))

	def register(self, user, host, server, realname):
		msg = 'USER {!s} {!s} {!s} {!s}\r\n'.format(user, host, server, realname)
		self.sock.send(msg)
		print(self.sock.recv(BUFFER_SIZE))

	def join(self, channel):
		self.sock.send('JOIN ' + str(channel) + '\r\n')
		print(self.sock.recv(BUFFER_SIZE))

if __name__ == '__main__':
	user = 'Faedrivin'
	addr = 'irc.freenode.net'
	port = 6667
	nick = 'Faedrivin Bot'
	server = 'freenode'
	realname = 'Sebastian Hoeffner'
	host = 'uni'
	
	with closing(socket.socket(socket.AF_INET, socket.SOCK_STREAM)) as s:
		bot = IRCBot(s)
		if bot.connect(addr, port):
			bot.register(user, host, server, realname)
			bot.setNick(nick)
			bot.join('#codingchaos')
			bot.idle()
