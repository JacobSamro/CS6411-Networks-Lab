import java.io.*;
import java.util.*;
/**
 *
 * @author JSAM
 */
public class JavaPing {

    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        JavaPing ping= new JavaPing();
        List <String> Commands = new ArrayList <String>();
        Commands.add("ping");
        Commands.add("-n");
        Commands.add("10");
        Commands.add("10.0.3.0");
        ping.doCommand(Commands);        
    }
    public void doCommand(List <String> Command) throws IOException{
        String s = null;
        ProcessBuilder pb = new ProcessBuilder(Command);
        Process process = pb.start();
        BufferedReader stdInput = new BufferedReader(new InputStreamReader(process.getInputStream()));
        BufferedReader stdError = new BufferedReader(new InputStreamReader(process.getErrorStream()));
        
        
       System.out.println("Standard Output:\n");
       while((s=stdInput.readLine())!=null)
       {
       System.out.println(s);
       }
       while((s =stdError.readLine())!=null){
       System.out.println(s);
       }
        
        
    }
}
