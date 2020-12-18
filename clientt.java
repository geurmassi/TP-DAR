import java.io.*;
import java.net.Socket;
import java.util.Scanner;
public class Client {

    static final int port = 1200;

    public static void main(String[] args) throws Exception {

        System.out.println("connection request");

        
        Socket socket = new Socket("127.0.0.1", port);
        System.out.println("Connection establi");

       
        BufferedReader inC = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        PrintWriter outC = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socket.getOutputStream())), true);

        Scanner sc = new Scanner(System.in);
        int p =sc.nextInt();
        outC.println(p);
        
        inC.close();
        outC.close();

        
        socket.close();
    }
}
