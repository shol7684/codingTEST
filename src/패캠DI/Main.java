package 패캠DI;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

class Car {
	String color = "red";

	@Override
	public String toString() {
		return "Car [color=" + color + "]";
	}
}

public class Main {
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		ClassLoader classLoader = Car.class.getClassLoader();
		
		System.out.println(classLoader.loadClass("Car").newInstance());
		
	}
}
