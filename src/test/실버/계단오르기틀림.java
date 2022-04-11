package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 계단오르기틀림 {
	
	static int[] arr= null;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine());;
		}
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(func(N-2));
		System.out.println(func(N-1));
		
		
	}
	
	static int func(int n ) {
		
		if(n < 1) {
			return 0;
		}
		
		int a = func(n-1) + func(n-3);
		int b=  func(n-2);
		
		int r = Math.max(a, b) + arr[n] ;
		
		return r;
	}
}
