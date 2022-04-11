package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 수들의합 {

	public static void main(String[] args) throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		long n = Long.parseLong(br.readLine());
		
		long sum = 0;
		int i =0;
		while(sum < n) {
			sum += i;
			
			if(sum == n) {
				System.out.println(i);
				return;
			}
			
			if(sum > n ) {
				System.out.println(i-1);
				return;
			}
			i++;
		}
		
		System.out.println(i);
	}
}
