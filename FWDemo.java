package iostreams;
import java.io.*;

public class FWDemo {

	public static void main(String[] args) throws IOException {
		
		File f = new File("abc.txt");
		FileWriter fw = new FileWriter(f); // 
		
		fw.write("Java is OOP language");
		fw.write("\nJava is Secure");
		fw.write("\nJava is Paltform Independent");
		fw.write("\nJava is Robust");
	    fw.close();	
	    
	    System.out.println("File Written successfully....");
	}
	
}
