#!/usr/bin/env python
import socket


irc_node = 'irc.freenode.net'
port = 6667
buffer_size = 1024

user = 'jjjbot'
host = 'myhost'
server = 'myserver'
name = 'Jewgeni Kovalev'
nick = 'jjjbot'

messages = [
  'USER {} {} {} {}'.format(user, host, server, name),
  'NICK {}'.format(nick),
  'JOIN #codingchaos'
]

with socket.socket(socket.AF_INET, socket.SOCK_STREAM) as s:
  s.connect((irc_node, port))

  for message in messages:
    s.send(bytes(message + '\r\n', 'UTF-8'))
  
  buff = bytes('', 'UTF-8')

  while True:
    buff = buff + s.recv(buffer_size)
    temp = str(buff[2:-1]).split('\\r\\n')
    line = ''
    while not line:
      line = temp.pop()
    if line:
      if 'PING' in line:
        s.send(bytes('PONG mydaemon\r\n', 'UTF-8'))
        print(fields)
      if line.strip().endswith('!say'):
        s.send(bytes('PRIVMSG #codingchaos hello!\n', 'UTF-8'))