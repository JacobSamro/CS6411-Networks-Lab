
package udpclient;
import java.io.*;
import java.net.*;

public class UDPclient {
public static DatagramSocket dis;

public static void main(String[] args)throws Exception {
        
    byte buffer[] = new byte[1024];
   

    BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));

    System.out.println("Server waiting");
    InetAddress ia = InetAddress.getLocalHost();

    while(true)
    {
    System.out.println("client:");
    String str = reader.readLine();
    if(str.equals("end"))
    break;
    buffer = str.getBytes();
    
    dis.send(new DatagramPacket(buffer,str.length(),ia,8081));
    
    DatagramPacket p=new DatagramPacket(buffer,buffer.length);
    
    dis.receive(p);
    String psx=new String(p.getData(),0,p.getLength());
    System.out.println("Server:"+psx);

 
    }
  }
}
