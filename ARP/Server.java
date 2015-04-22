import java.io.*;
import java.net.*;
import java.util.*;
import javax.net.ssl.SSLSocket;

public class Server {
    public static void main(String args[]){
    try{
    ServerSocket obj = new ServerSocket(139);
    Socket obj1 = obj.accept();
    while(true){
    DataInputStream din = new DataInputStream(obj1.getInputStream());
    DataOutputStream dout = new DataOutputStream(obj1.getOutputStream());
    String str = din.readLine();
    String ip[] = {"10.0.3.186","10.0.3.186"};
    String mac[] = {"D4:3D:7E:12:A3:D9","08:00:27:00:AC:E4"};
        for (int i = 0; i < ip.length; i++) {
            if(str.equals(ip[i]))
            {
            dout.writeBytes(mac[i] + '\n');
            break;
            }            
        }
    obj.close();
    }        
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
