import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
public class Serveur {

    static final int port = 1200;

    public static boolean premier(int x){
        boolean test=true;
        for(int j=2;j<=x/2;j++){
            if(x % j ==0) {
                test = false;
                break;
            }
        }
        return ok;
    }
    public static void main(String[] args) throws Exception {

        // Listen to a specific port

        ServerSocket s = new ServerSocket(port);
        System.out.println("Waiting for connection");
        Socket socClient = s.accept(); 
        System.out.println("Connexion establi");

        

        BufferedReader inServer = new BufferedReader(new InputStreamReader(socClient.getInputStream()));
        PrintWriter outServer = new PrintWriter(new BufferedWriter(new OutputStreamWriter(socClient.getOutputStream())), true);

        
        String str = inServer.readLine();
       int p =Integer.parseInt(str);
       for(int i=2;i<=p;i++){
           if (premier(i))
           {
               System.out.println(i);
           }

       }
        // Close in / out
        inServer.close();
        outServer.close();

       
        socClient.close();
    }
}
