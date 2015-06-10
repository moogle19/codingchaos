import java.io.*;
import java.net.Socket;

public class CCBot {
    private BufferedWriter writer;
    private BufferedReader reader;

    String channel;

    public CCBot(String server, String channel) {
        try {
            Socket socket = new Socket(server, 6667);
            writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
            reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.channel = channel;

        this.login();
    }

    private void login() {
        try {
            writer.write("NICK bot-cswan\r\n");
            writer.write("USER bot-cswan 0 * :bot-cswan\r\n");
            writer.flush();

            String line = null;
            while ((line = reader.readLine( )) != null) {
                System.out.println(line);
                if (line.contains("004"))
                    // We are now logged in.
                    break;
                else if (line.contains("433"))
                    return;
            }

            // Join the channel.
            writer.write("JOIN " + channel + "\r\n");
            writer.flush( );

            while ((line = reader.readLine( )) != null) {
                if (line.toLowerCase().contains("!say")) {
                    writer.write("PRIVMSG " + channel + " hello!\n");
                    writer.flush( );
                }
                else if (line.toLowerCase( ).startsWith("PING ")) {
                    // We must respond to PINGs to avoid being disconnected.
                    writer.write("PONG " + line.substring(5) + "\r\n");
                    writer.flush( );
                }
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
