package iostreams;

import java.io.Serializable;

public class Car implements Serializable {
	
	private String color;
	private String make;
	private String model;
	transient private double price;
	
	public Car(String color, String make, String model, double price) {
		super();
		this.color = color;
		this.make = make;
		this.model = model;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Car [color=" + color + ", make=" + make + ", model=" + model + ", price=" + price + "]";
	}
	
	
	

}
