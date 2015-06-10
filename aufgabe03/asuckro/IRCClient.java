import java.io.*;
import java.lang.System;
import java.net.*;

public class IRCClient {

    public static void main(String[] args) throws Exception {

        // The server to connect to and our details.
        String server = "irc.freenode.net";
        String nick = "AndreaSuckro_Bot";
        String user = "foo foo foo foo";

        // The channel which the bot will join.
        String channel = "#codingchaos";

        // Connect directly to the IRC server.
        Socket socket = new Socket(server, 6667);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream( )));
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream( )));
        System.out.println("HABE SOCKET GEBAUT");

        // Log on to the server.
        writer.write("USER "+user+"\r\n");
        writer.write("NICK " + nick + "\r\n");
        writer.flush( );

        // Read lines from the server until it tells us we have connected.
        String line = null;
        while ((line = reader.readLine( )) != null) {
            System.out.print(line);
            if (line.indexOf("004") >= 0) {
                // We are now logged in.
                break;
            }
            else if (line.indexOf("433") >= 0) {
                System.out.println("Nickname is already in use.");
                return;
            }
        }

        // Join the channel.
        writer.write("JOIN " + channel + "\r\n");
        writer.flush( );

        // Keep reading lines from the server.
        while ((line = reader.readLine( )) != null) {
            String curLine = line.toLowerCase( );
            System.out.print(curLine);
            if (curLine.contains("ping ")) {
                // We must respond to PINGs to avoid being disconnected.
                writer.write("PONG " + line.substring(5) + "\r\n");
                writer.flush( );
            }
            else if (curLine.contains("!say")){
                writer.write("PRIVMSG #codingchaos : hello! CoXi jippi!" + "\r\n");
                writer.flush();
            }
        }
    }

}