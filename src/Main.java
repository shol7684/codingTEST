import java.io.IOException;
import java.sql.Date;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

public class Main {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		Dog dog = new Dog();
		
		dog.eat();
		
	}	

	
}


class Animal{
	
	public void eat() {
		System.out.println("먹다");
	}
}

class Dog extends Animal {
	
	@Override
	public void eat() {
		super.eat();
		System.out.println("먹다2");
	}
	
}