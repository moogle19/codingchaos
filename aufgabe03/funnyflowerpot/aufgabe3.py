import socket
from time import sleep
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect(('irc.freenode.net', 6667))
s.send('NICK space_invader_42\r\n')
s.send('USER funnyflowerpot hertz irc.freenode.net :funnyflowerpot\r\n')
s.send('JOIN #codingchaos\r\n')
while True:
  tokens = s.recv(1024).strip().split()
  if tokens[0].lower()=='ping':
    s.send('PONG %s\r\n' % tokens[1])
  if len(tokens) >= 4 and tokens[3].lower()==':!say':
    s.send('PRIVMSG #codingchaos hello!\r\n')
s.close()

