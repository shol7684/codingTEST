package test.실버.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 로프 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int[] arr =new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(br.readLine())	;
		}
		
		Arrays.sort(arr);
		int max = 0;
		int count = 1;
		for(int i=arr.length-1;i>=0;i--) {
			max = Math.max(arr[i] * count, max);
			count++;
			
		}
		
		System.out.println(max);
	}
	
	

}
