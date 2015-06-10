package main

import (
	"bufio"
	"fmt"
	"net"
	"strings"
)

func main() {
	conn, _ := net.Dial("tcp", "irc.freenode.net:6667")
	handleConn(conn)
}

func handleConn(conn net.Conn) {
	//go handleRead(conn)
	_, _ = conn.Write([]byte("USER mooglebotbot foo.uos.de irc.freenode.net iambot\n"))
	_, _ = conn.Write([]byte("NICK mooglebotbot\n"))
	_, _ = conn.Write([]byte("JOIN #codingchaos\n"))
	for {
		read, _ := bufio.NewReader(conn).ReadString('\n')
		fmt.Println(read)
		if read == "PING" {
			fmt.Println("Send PONG")
			fmt.Fprintf(conn, "PONG")
		} else if strings.HasSuffix(strings.TrimSpace(read), "PRIVMSG #codingchaos :!say") {
			fmt.Fprintf(conn, "PRIVMSG #codingchaos hello!\n")
		}
	}
}

func handleRead(conn net.Conn) {
	for {
		read, _ := bufio.NewReader(conn).ReadString('\n')
		fmt.Println(read)
	}
}
