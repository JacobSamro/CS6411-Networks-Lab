import java.net.*;
import java.io.*;
/**
 *
 * @author Jacob Samro
 */
public class Server {
    public static void main(String args[]){
        ServerSocket s = null;
        String line;
        DataInputStream is;
        PrintStream ps;
        Socket c = null;
        try{
            s = new ServerSocket(9000);
        }
        catch(IOException e){
            System.out.println(e);
        }
        
        try{
            c = s.accept();
            
            is = new DataInputStream(c.getInputStream());
            ps = new PrintStream(c.getOutputStream());
            
            while(true){            
            
            line = is.readLine();
            System.out.println("Client : " + line);
            
            System.out.println("Server : ");
            DataInputStream in = new DataInputStream(System.in);
            line = in.readLine();
            ps.println(line);
            
            
            }
        }
        catch(IOException e){
         System.out.println(e);
        }
    }
}
