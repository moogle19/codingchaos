 
   
import socket
   
   
TCP_IP = 'irc.freenode.net'
TCP_PORT = 6667
BUFFER_SIZE = 1024
  
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((TCP_IP, TCP_PORT))
s.send("NICK kaibot\r\n")
s.send("USER kstandvoss bla bla :kai\r\n")
s.send("JOIN #codingchaos\r\n")
data = s.recv(BUFFER_SIZE)
while data:
  if "!say" in data:
    s.send("PRIVMSG #codingchaos : hello!\r\n")
  if "ping" in data:
    s.send("PONG " + data[5:])
  data = s.recv(BUFFER_SIZE)

s.close()
  
