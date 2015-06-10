Aufgabe: IRC Bot
================

Das Ziel dieser Aufgabe ist es einen minimalistischen IRC bot zu entwickeln der
auf ein vorgegebenes Kommando antwortet.

 - Zu freenode verbinden
 - Dem Channel #codingchaos beitreten
 - Auf ein "!say" im Channel mit "hello!" antworten
 - Dem Server auf Pings antworten


Tipps
-----

*(bzw. was muss ich tun)*

 - Verbindung zu irc.freenode.net, Port 6667/tcp aufbauen
 - Am Netzwerk registrieren mit
   `USER <username> <hostname> <servername> <realname>`
 - Nickname setzen mit
   `NICK <nick>`
 - Wenn ein PING-Kommando von Server erhalten wird sollte umgehend geantwortet
   werden mit:
   `PONG <daemon>`
 - Kommunikation passiert Zeilenweise. Zeilen werden getrennt durch `<cr><lf>`

Weitere Details zu IRC: [https://tools.ietf.org/html/rfc1459]


Beispieldaten:
--------------

    :cameron.freenode.net 001 bot-lkiesow :Welcome to the freenode Internet Relay Chat Network bot-lkiesow
    :cameron.freenode.net 375 bot-lkiesow :- cameron.freenode.net Message of the Day -
    :cameron.freenode.net 376 bot-lkiesow :End of /MOTD command.
    :bot-lkiesow MODE bot-lkiesow :+i
    :bot-lkiesow!~bot-lkies@ip4d1476f4.dynamic.kabel-deutschland.de JOIN #codingchaos
    :lkiesow!~lkiesow@v22014112490721469.yourvserver.net PRIVMSG #codingchaos :!say

Beispielcode
------------

 - [TCP Communication (Python)
   ](https://wiki.python.org/moin/TcpCommunication)
 - [TCP Communication (Java)
   ](https://systembash.com/a-simple-java-tcp-server-and-tcp-client/)
