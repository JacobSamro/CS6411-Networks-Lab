import java.net.*;
import java.io.*;
/**
 *
 * @author Jacob Samro
 */
public class Client {

    public static void main(String args[]){
        Socket c = null;
        DataInputStream is, is1;
        PrintStream os;
        
        try{
            InetAddress ia = InetAddress.getLocalHost();
            c = new Socket(ia,9000);
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        
        try{
            os = new PrintStream(c.getOutputStream());
            is = new DataInputStream(System.in);
            is1 = new DataInputStream(c.getInputStream());            

            
        FileReader fr = new FileReader("C:\\Users\\user\\Desktop\\hello.txt"); 
        char [] a = new char[50];
        char [] b = new char[50];
        fr.read(a);
             
        fr.close();
        os.println(a);
        System.out.println("File Sent !");
            
        }
        catch(IOException e){
            System.out.println("Socket Closed");
        }
        
    }
}
