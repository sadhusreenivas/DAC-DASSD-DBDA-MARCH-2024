package iostreams;
import java.io.*;
public class FRDemo {

	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("abc.txt");
		
		int x;
		int count = 0;
		int lines = 0;
		while((x = fr.read())!= -1) {
			count++;
			System.out.print((char)x);
			if(x == '\n')
				lines++;
		}
		
        fr.close();
        System.out.println("\nNo of chars: "+count);
        System.out.println("No of lines: "+(lines+1));
        }
}
