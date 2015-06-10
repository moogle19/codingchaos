import socket

network = 'irc.freenode.net'
port = 6667
irc = socket.socket ( socket.AF_INET, socket.SOCK_STREAM )
irc.connect ( ( network, port ) )
print irc.recv ( 4096 )


irc.send ( 'USER jguese Hostname Servername Justin' )
irc.send ( 'NICK JustinGuese' )
irc.send ( 'JOIN #codingchaos' )
#irc.senc('MSG Peace!')
#irc.send ( 'PRIVMSG #nille :Hello World.\r\n' )

#while True:
#   data = irc.recv ( 4096 )
#   if data.find ( 'PING' ) != -1:
#      irc.send ( 'PONG ' + data.split() [ 1 ] + '\r\n' )
#   print data
