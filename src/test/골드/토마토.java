package test.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 토마토 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int m = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[n][m];
		int[][] arr2 = new int[n][m];
		
		for(int i=0;i<n;i++) {
			st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<m;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
//		for(int i=0;i<n;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		
		
		int[] vx = {0, 1, 0, -1};
		int[] vy = {1, 0, -1, 0};
		
		int count = 0;
		
		Queue<int[]> q = new LinkedList<>();
		
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(arr[i][j] == 1) {
					q.add(new int[] {i,j});
				}
			}
		}
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			int px = poll[0];
			int py = poll[1];
			
			int a = arr2[px][py];
			
			for(int k=0;k<4;k++) {
				int x = px + vx[k];
				int y = py + vy[k];
				
				if(0 <= x && x < n && 0 <= y && y < m) {
					
					if(arr[x][y] == 0) {
						q.add(new int[] {x,y});
						arr[x][y] = 1;
						arr2[x][y] = a+1;
						count = Math.max(count, arr2[x][y]);
					}
					
					//
				}
				
			}
			
			
		}
		
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				if(arr[i][j] == 0) {
					System.out.println(-1);
					return;
				}
			}
		}
		
		
//		System.out.println();
//		for(int i=0;i<n;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
//		System.out.println();
//		for(int i=0;i<n;i++) {
//			System.out.println(Arrays.toString(arr2[i]));
//		}
		System.out.println(count);
		
		
		
		
		
	}
}
