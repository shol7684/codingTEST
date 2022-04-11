package test.브론즈;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 거스름돈 {
	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = 1000 - Integer.parseInt(br.readLine());
		
		int count = 0;
		
		int[] arr = {500, 100, 50, 10, 5, 1};
		
		while(n != 0) {
			for(int i=0;i<arr.length;i++) {
				count += n / arr[i];
				n = n % arr[i];
			}
		}
		
		
		System.out.println(count);
	}
	

}
