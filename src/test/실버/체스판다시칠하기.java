package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class 체스판다시칠하기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		
		char[][] arr = new char[n][m];
		
		for(int i=0;i<arr.length;i++) {
			String str = br.readLine();
			for(int j=0;j<arr[i].length;j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		int count = Integer.MAX_VALUE;
		
		for(int i=0;i<n-7;i++) { 
			for(int j=0;j<m-7;j++) {
				count = Math.min(check(arr, i, j), count);
			}
		}
		System.out.println(count);
			
		
	}
	
	public static int check(char[][] arr, int x , int y) {
		char[][] check1 = new char[8][8];
		char[][] check2 = new char[8][8];
		
		char start1 = 'W';
		
		for(int i=0;i<8;i++) {
			for(int j=0;j<8;j++) {
				if(i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
					check1[i][j] = 'W';
				} else {
					check1[i][j] = 'B';
				}
			
				if(i % 2 == 0 && j % 2 == 0 || i % 2 == 1 && j % 2 == 1) {
					check2[i][j] = 'B';
				} else {
					check2[i][j] = 'W';
				}
			}
		}
		
		
		int count1 = 0;
		int count2 = 0;
		
//		for(int i=0;i<check1.length;i++) {
//			System.out.println(check1[i]);
//		}
//		
//		for(int i=0;i<check2.length;i++) {
//			System.out.println(check2[i]);
//		}
		
		for(int i=0;i<8;i++,x++) {
			for(int j=0,k =y;j<8;j++,k++) {
//				System.out.println("x : +" + x + " y : " + y);
				if(check1[i][j] != arr[x][k]) {					
					count1++;
				}
				
				if(check2[i][j] != arr[x][k]) {
					count2++;
				}
			}
		}
		
		return Math.min(count1, count2);
	}
	

}
