// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 2
// Filename: KnockKnockServer.java (inside knockknock package)

package mte3.knockknock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class KnockKnockServer {
    public static int PORT = 54322;

    public static void receiveAndSend(Scanner scanner,String message,PrintWriter writer,boolean concat) {
        
        Socket socket = new Socket(PORT);
        BufferedReader in = new BufferedReader(Socket);
        out
        

        System.out.println("Who's there?");

        out.println(message);

        in

        /*
        receive();                // question
        send("Who's there?");    // answer
        String setup = receive();   // setup
        send(setup + " who?");     // response
        receive();                // punchline
        close();
        */

        // 
        // 
        // 

    } // receiveAndSend() method closed
    
    public static void main(String args[]) throws IOException, InterruptedException {

        Scanner scan = new Scanner(System.in);

        OutputStream tets = new OutputStream() {
        };

        Socket socket = new Socket

        PrintWriter writer = new PrintWriter();

        receiveAndSend(scan, "Who's There?", writer, false);
        recieveAndSend(scan, )
        


        
        
        // 
        // 
        // 
    
    } // main() method closed
}