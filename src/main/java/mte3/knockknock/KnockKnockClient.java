// Exam: 2255 GCIS 124, Mid Term Exam #3, Question 2
// Filename: KnockKnockClient.java (inside knockknock package)

package mte3.knockknock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;

//THE PRANKSTER, the one who tells the joke

public class KnockKnockClient {
    public static int PORT = 54322;
    public static String SERVER = "localhost";

    public static void sendAndReceive(PrintWriter writer, String message, Scanner scanner) throws IOException {

        Socket socket1 = new Socket(SERVER, PORT);
        InputStreamReader reader = new InputStreamReader(socket1.getInputStream());
        BufferedReader in = new BufferedReader(socket1);

        in.readLine();
        writer.println(message);
        

        // 
        // 
        // 

    } // sendAndReceive() method closed
    

    public static void joke(String who,String punchLine) throws IOException {

        System.out.println("Knock, knock");

        System.out.println(who);

        System.out.println(punchLine);

        /*
        public Client(Socket socket) throws IOException {    super(socket);    }

    @Override
    public void run() {
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

    } // joke() method closed

    public static void main(String[] args) throws IOException {

        String[][] jokes = {{"Tank","You're welcome!"},
                            {"Nobel","Nobel...that's why I knocked!"},
                            {"Says","Says me!"},
                            {"Hawaii","I'm good. Hawaii you?"},
                            {"Lettuce","Lettuce in, it's cold out here!"},
                            {"Cow says","No, a cow says moooooo!"},
                            {"Otto","Otto know. I forgot."}
                        };

        int i = new Random().nextInt(jokes.length);

        Scanner scan = new Scanner(System.in);
                        
        joke(jokes[i][0],jokes[i][1]);

        Socket socket = new Socket(SERVER, PORT);
                    
        PrintWriter writer = new PrintWriter(socket.getOutputStream());

        sendAndReceive(writer, SERVER, scan);    
        
        socket.close();
        scan.close();

    } // main() method closed

    // hint: please run KnockKnockServer first and then run KnockKnockClient

} // KnockKnockClient { } class closed