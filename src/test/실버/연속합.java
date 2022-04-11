package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 연속합 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		
		arr = new int[N];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i=0;i<N;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		System.out.println(Arrays.toString(arr));
		System.out.println(func(N));
		
	}
	
	static int[] arr = null;
	
	static int func(int n) {
		
		if(n==1) {
			return arr[0];
		}
		
		if(n==2) {
			int sum=0;
			for(int i=0;i<2;i++) {
				sum +=arr[i];
			}
			
			return Math.max(Math.max(arr[0], arr[1]), sum);
		}
		
		return 0;
	}
	
	
	

}
