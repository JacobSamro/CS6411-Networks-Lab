import java.io.*;
import java.net.*;
import java.util.*;

public class RARPServer{

    public static void main(String args[])    {
    try{
    
    DatagramSocket server = new DatagramSocket(1309);
        while(true){
                byte[] sendByte = new byte[1204];
                byte[] receiveByte = new byte[1204];
                DatagramPacket receiver = new DatagramPacket(receiveByte,receiveByte.length);
                server.receive(receiver);
                String str = new String(receiver.getData());
                String s = str.trim();
                InetAddress addr = receiver.getAddress();
                int port = receiver.getPort();
                String ip[] = {"10.0.3.186"};
                String mac[] = {"D4:3D:7E:12:A3:D9"};
                
                    for (int i = 0; i < ip.length; i++) {
                    if(s.equals(mac[i]))
                    {
                    sendByte = ip[i].getBytes();
                    DatagramPacket sender = new DatagramPacket(sendByte,sendByte.length,addr,port);
                    server.send(sender);
                    break;
                    }            
            }
            break;
        }        
    }catch(Exception e)
    {
        System.out.println(e);
    }
    }
}
