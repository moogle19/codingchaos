require "socket"

server = "irc.freenode.net"
port = "6667"
nick = "ManoBot"
channel = "#codingchaos"

s = TCPSocket.open(server, port)
print("addr: ", s.addr.join(":"), "\n")
print("peer: ", s.peeraddr.join(":"), "\n")
s.puts "USER testing 0 * Testing"
s.puts "NICK #{nick}"
s.puts "JOIN #{channel}"
#s.puts "PRIVMSG #{channel} :dumdidum"

until s.eof? do
  msg = s.gets
  realmsg = msg.split(':')[2]
  puts realmsg
  if realmsg === "!say"
    s.puts "PRIVMSG #{channel} :hello!"
  end

  puts msg
end
