package udpclient;
import java.io.*;
import java.net.*;


public class UDPserver {
    public static DatagramSocket ds;
    public static byte buffer[] = new byte[1024];
         /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        
        DatagramSocket dis = new DatagramSocket(8081);
        
        System.out.println("Pres Ctrl+c to quit the program");
        
              
        //buffer = new BufferedReader(new InputStreamReader(System.in));
        
        while(true)
        {
            DatagramPacket p = new DatagramPacket(buffer,buffer.length);
            
            dis.receive(p);
            
            String psx=new String(p.getData(),0,p.getLength());
            System.out.println("Client:"+psx);
            System.out.println("Server:");
            
            String str = dis.readLine();
            
            
            if(str.equals("end"))
                break;
           buffer = str.getBytes();
           dis.send(new DatagramPacket(buffer,str.length(),ia,8080));
        }
        
        // TODO code application logic here
    }
}
