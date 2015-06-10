import java.io.*;
import java.net.*;

public class irc {

    public static void main(String[] args) throws Exception {

        String server = "irc.freenode.net";
        String nick = "cstenkamp";
        String login = "cstenkamp";

        String channel = "#codingchaos";
        
        Socket socket = new Socket(server, 6667);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream( )));
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream( )));
        
        writer.write("NICK " + nick + "\r\n");
        writer.write("USER " + login + " 8 * : cstenkamp Bot\r\n");
        writer.flush( );
        
        String line = null;
        while ((line = reader.readLine( )) != null) {
            if (line.indexOf("004") >= 0) {
                // We are now logged in.
                break;
            }
            else if (line.indexOf("433") >= 0) {
                System.out.println("Nickname is already in use.");
                return;
            }
        }
        
        writer.write("JOIN " + channel + "\r\n");
        writer.flush( );
        
        while ((line = reader.readLine( )) != null) {
            if (line.toLowerCase( ).startsWith("PING ")) {
                writer.write("PONG " + line.substring(5) + "\r\n");
                writer.write("PRIVMSG " + channel + " :I got pinged!\r\n");
                writer.flush( );
            }
            else if (line.contains("say")) {
		System.out.println("-----------------------------------------------------------");
		writer.write("PONG " + line.substring(5) + "\r\n");
                writer.write("PRIVMSG " + channel + " :hello!");
                writer.flush( );
	    }
	    {
                System.out.println(line);
            }
        }

    }

}
