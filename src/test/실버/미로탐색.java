package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 미로탐색 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		StringTokenizer st = new StringTokenizer(br.readLine());

		int n = Integer.parseInt(st.nextToken()) + 1;
		int m = Integer.parseInt(st.nextToken()) + 1;
		
		int[][] arr = new int[n][m];
		boolean[][] vis = new boolean[n][m];
		
		int[][] arr2 = new int[n][m];
		
		for(int i=1;i<arr.length;i++) {
			String str = br.readLine();
			for(int j=1;j<arr[i].length;j++) {
				arr[i][j] = str.charAt(j-1) - 48 ;
			}
		}
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		Queue<int[]> q = new LinkedList<>();
		
		q.add(new int[] {1,1});
		vis[1][1] = true;
		
		int[] vx = {0, 1, 0, -1};
		int[] vy = {1, 0, -1, 0};
		
		int d = 0;
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			int pollx = poll[0];
			int polly = poll[1];
			d = arr2[pollx][polly];
			
			for(int i=0;i<4;i++) {
				int x = pollx + vx[i];
				int y = polly + vy[i];
				
				if(0 < x && x < n && 0 < y && y < m ) {
					
					if(arr[x][y] == 1 && vis[x][y] == false) {
						vis[x][y] = true;
						q.add(new int[] {x,y});
						arr2[x][y] = d+1;		
					}
				}
				
				
			}
		}
		
//		System.out.println();
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(vis[i]));
//		}
//		System.out.println();
//		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr2[i]));
//		}
		
		System.out.println(arr2[n-1][m-1] + 1);
		
		
		
		
	}

}
