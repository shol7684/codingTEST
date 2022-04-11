package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 일로만들기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i=1;i<=N;i++) {
			int a = func(i, 0);
			m[i] = a;
		}
		System.out.println(m[N]);
		

	}
	
	static int[] m = new int[1000001];
	
	static int func(int n, int count) {
		
		if(n == 1) {
			return count;
		}

		if(m[n] != 0) {
			return m[n]+1;
		}
		
		count++;
		if(n % 3 == 0 && n % 2 == 0) {
			return Math.min(func(n-1, count), Math.min(func(n/3, count), func(n/2, count)));
		} else if(n % 3 == 0 ) {
			return  Math.min(func(n/3, count), func(n-1, count));
		} else if(n % 2 == 0) {
			return Math.min(func(n/2, count), func(n-1, count));
		} else {
			return func(n-1, count);
		}
	}

}
