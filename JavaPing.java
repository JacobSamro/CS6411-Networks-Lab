import java.io.*;
import java.util.*;
import java.lang.*;
/**
 *
 * @author JSAM
 */
public class JavaPing {

    public static void main(String[] args){
        try{
        Runtime runt    =   Runtime.getRuntime();
        Process proc    =   r.exec("ping 127.0.0.1");
        DataInputStream data    =   new DataInputStream(r.getInputStream());
        String line =   null;
        while((line=data.readLine())!=null)
        {
            System.out.println(line);
        }
        }catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
