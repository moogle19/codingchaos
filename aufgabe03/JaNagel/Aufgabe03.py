import sys
import socket
import string
import re

s=socket.socket()
s.connect(('irc.freenode.net', 6667))
s.send("NICK JannesBot\r\n")
s.send("USER JannesBot irc.freenode.net bla :JannesNagel\r\n")
s.send("JOIN #CodingChaos\r\n")
buffer = ''
reSay = re.compile('^:.+:\s*![sS]ay\s*$')
while True:
    try:
        buffer=buffer+s.recv(1024)
    except:
        pass
    lines=string.split(buffer, "\n")
    if len(lines) > 1:
        if reSay.search(lines[0]) != None:
            print lines[0]
            s.send("SAY Hello!\r\n")
            s.send("SAY I will leave now!\r\n")
            s.close()
            print 'I saw I spoke I Quit'
            break
        line=string.rstrip(lines[0])
        line=string.split(lines[0])
        if(line[0]=="PING"):
            s.send("PONG %s\r\n" % line[1])
        buffer=lines.pop()