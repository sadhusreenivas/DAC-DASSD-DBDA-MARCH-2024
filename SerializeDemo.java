package iostreams;
import java.io.*;

public class SerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Car c1 = new Car("White","Tata","Nexon EV", 1400000);
		System.out.println(c1);
		
		// Serialization
		FileOutputStream fos = new FileOutputStream("car.info");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(c1);
        
        //de-serialization
        FileInputStream fis = new FileInputStream("car.info");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Car c2 = (Car) ois.readObject();
        
        System.out.println(c2); // it should be same as C1
	}

}
