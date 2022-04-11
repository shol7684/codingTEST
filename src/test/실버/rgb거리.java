package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class rgb거리 {
	static int[][] arr = null;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int N = Integer.parseInt(br.readLine());
		
		arr = new int[N][3];
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
		
			arr[i][0] = Integer.parseInt(st.nextToken());
			arr[i][1] = Integer.parseInt(st.nextToken());
			arr[i][2] = Integer.parseInt(st.nextToken());
			
		}
//		for(int i=0;i<N;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		
		System.out.println(Math.min(fun(0,2), Math.min(fun(0,0), fun(0,1))));
		
		
	}
	
	static int fun(int x, int y) {
		if(x == arr.length-1) {
			return arr[x][y];
		}
		
		int a = 0; 
		if(y == 0) {
			a = Math.min(fun(x+1, 1), fun(x+1, 2));
		} else if (y == 1) {
			a = Math.min(fun(x+1, 0), fun(x+1, 2));
		} else {
			a = Math.min(fun(x+1, 0), fun(x+1, 1));
		}
		
		return arr[x][y] + a;
		
		
		
		
	}
}
