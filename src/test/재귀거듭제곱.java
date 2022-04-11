package test;

public class 재귀거듭제곱 {

	public static void main(String[] args) {
		int a = 9;
		int b = 5;
		
		int m = 7;
		
		System.out.println(Math.pow(a, b));
		System.out.println(Math.pow(a, b) % m  );
		
		System.out.println((a % m * b % m)  %m);
		

	}

}
