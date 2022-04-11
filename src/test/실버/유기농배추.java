package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 유기농배추 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)) ;
		
		int T = Integer.parseInt(br.readLine());
		
		for(int t=0;t<T;t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int M = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());
			
			int[][] arr = new int[N][M];
			boolean[][] vis = new boolean[N][M];
			
			int[] vx = {0, 1, 0, -1};
			int[] vy = {1, 0, -1, 0};
			
			Queue<int[]> q = new LinkedList<>();
			
			for(int i=0;i<K;i++) {
				st = new StringTokenizer(br.readLine());
				int Y = Integer.parseInt(st.nextToken());
				int X = Integer.parseInt(st.nextToken());
				
				arr[X][Y] = 1;
			}
			
//			for(int i=0;i<arr.length;i++) {
//				System.out.println(Arrays.toString(arr[i]));
//			}
			
			int count = 0;
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<M;j++) {
					if(arr[i][j] == 1 && vis[i][j] == false) {
						
						q.add(new int[] {i,j});
						vis[i][j] = true;
						
						
						while(!q.isEmpty()) {
							int[] poll = q.poll();
							int px = poll[0];
							int py = poll[1];
							
							for(int k=0;k<4;k++) {
								int x = px + vx[k];
								int y = py + vy[k];
								
								if(0 <= x && x < N && 0 <= y && y < M) {
									if(arr[x][y] == 1 && vis[x][y] == false) {
										q.add(new int[] {x,y});
										vis[x][y] = true;
									}
								}
							}
						}
						count++;
					}
					
				}
			}
			
			System.out.println(count);
			
			
			
			
			
			
			
		}
		
		
	}

}
