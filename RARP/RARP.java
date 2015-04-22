import java.io.*;
import java.net.*;
import java.util.*;

public class RARP {
    public static void main(String args[]){
    try{
        DatagramSocket client = new DatagramSocket();
        InetAddress addr = InetAddress.getByName("127.0.0.1");
        byte[] sendByte = new byte[1204];
        byte[] receiveByte = new byte[1024];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the Physical Address ");
        String str = in.readLine();
        sendByte = str.getBytes();
        DatagramPacket sender = new DatagramPacket(sendByte,sendByte.length,addr,1309);
        client.send(sender);
        DatagramPacket receiver = new DatagramPacket(receiveByte,receiveByte.length);
        client.receive(receiver);
        String s = new String(receiver.getData());
        System.out.println("The Logical Address is :" + s.trim());
        client.close();
    }
    catch(Exception e){
    System.out.println(e);
    }
    }
}
