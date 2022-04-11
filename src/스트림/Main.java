package 스트림;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {

		Test test = new Test();
		
		
		test.print2(new Imp1());
	}

}

class Test  {
	
	public void print2(Service service) {
		service.print();
	}
	
}

interface Service {
	void print();
}

class Imp1 implements Service {
	
	private int age;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	
	@Override
	public void print() {
		System.out.println("imp1");
	};
}
