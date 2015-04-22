import java.io.*;
import java.net.*;
import java.lang.*;

public class Traceroute {


    public static void main(String[] args) {
        BufferedReader in;
        try{
         Runtime r = Runtime.getRuntime();
         Process p = r.exec("tracert www.aroliant.com");
         if(p==null)
             System.out.println("Could not Connect");
         in = new BufferedReader(new InputStreamReader(p.getInputStream()));
         String line;
         while((line = in.readLine())!=null){
             System.out.println(line);
         }
        System.out.println(in.readLine());
        in.close();
        }
        catch(IOException e){
            System.out.println(e.toString());
        }
    }
}
