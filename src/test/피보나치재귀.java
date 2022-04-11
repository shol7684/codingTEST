package test;

public class 피보나치재귀 {

	public static void main(String[] args) {
		
		
		System.out.println(fi(1));
		System.out.println(fi(2));
		System.out.println(fi(3));
		System.out.println(fi(4));
		System.out.println(fi(5));
	}
	
	
	
	public static int fi(int n) {
		if(n == 0) {
			return 0;
		}
		
		if(n == 1) {
			return 1;
		}
		
		return fi(n-1) + fi(n-2);
		
	}
}
