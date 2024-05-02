package iostreams;
import java.io.*;
public class RWDemo {

	public static void main(String[] args) throws IOException {
    
           FileReader fr = new FileReader("C://Users/hp/eclipse-workspace1/CoreJavaApp/src/iostreams/RWDemo.java"); 
           BufferedReader br = new BufferedReader(fr);
           BufferedWriter bw = new BufferedWriter(new FileWriter("RWDemo.txt",true)); 
           
           int x;
           while((x=br.read()) != -1) {
        	   bw.write(x); // txt
        	   System.out.print((char)x); // console
           }
           
           br.close();
           bw.close();
	}

}
