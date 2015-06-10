/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codingchaos_01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.ArrayList;

/**
 *
 * @author bottersb
 */
public class CodingChaos_01 {

    static ArrayList a;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        String server = "irc.freenode.net";
        String channel = "#codingchaos";
        int port = 6667;
        String nick = "bottersb";
        String servername = "";
        String realname = "Benny";
        
        Socket socket = new Socket(server, port);
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(socket.getOutputStream( )));
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(socket.getInputStream( )));
        
        writer.write("USER " + nick + " " +server+ " " +channel+ " " +realname+ "\r\n");
        writer.write("NICK " + nick + "\r\n");
        writer.flush( );
        
        String line = null;
        while ((line = reader.readLine( )) != null) {
            System.out.println(line);
            if (line.indexOf("004") >= 0) {
                break;
            }
            else if (line.indexOf("433") >= 0) {
                System.out.println("Nickname is already in use.");
                return;
            }
        }
        
        writer.write("JOIN " + channel + "\r\n");
           writer.write("PRIVMSG " + channel + "moin\r\n");
         
        writer.flush( );
        while ((line = reader.readLine( )) != null) {
            System.out.println(line);
            
            if (line.toLowerCase( ).contains("PING")) {
                writer.write("PONG " + line.substring(5) + "\r\n");
                writer.write("PRIVMSG " + channel + "\r\n");
                writer.flush( );
            }
            
            if (line.toLowerCase( ).contains("!say")) {
                writer.write("PRIVMSG " + channel + " :hello!\r\n");
                writer.flush( );
            }
        }
        
    }
}
