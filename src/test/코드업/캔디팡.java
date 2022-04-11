package test.코드업;

import java.io.*;
import java.util.*;

public class 캔디팡 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int[][] arr = new int[7][7];
		
		boolean[][] vis = new boolean[7][7];
		
		for(int i=0;i<7;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			for(int j=0;j<7;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		
		Queue<int[]> q = new LinkedList<>();
		
		int[] vx = {0, 1, 0, -1};
		int[] vy = {1, 0, -1, 0};
		
		int result = 0;
		
		for(int a=0;a<7;a++) {
			for(int b=0;b<7;b++) {
				
				if(vis[a][b] == false) {
					
					
					q.add(new int[] {a,b,});
					vis[a][b] = true;
					int start = arr[a][b];
					
					int count = 1;
					
					while(!q.isEmpty()) {
						int[] poll = q.poll();
						int x = poll[0];
						int y = poll[1];
						
						
						for(int i=0;i<4;i++) {
							int xx = x + vx[i];
							int yy = y + vy[i];
							
							if(0 <= xx && xx < 7 && 0 <= yy && yy < 7) {
								if(arr[xx][yy] == start && vis[xx][yy] == false) {
									q.add(new int[] {xx,yy});
									vis[xx][yy] = true;
									count++;
								}
							}
							
							
						}
						
					}
					
					if(count >= 3) {
						result++;
					}
					
					
					
					
				}
				
			}
		}
		
		
		
		
//		for(int i=0;i<7;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
//		for(int i=0;i<7;i++) {
//			System.out.println(Arrays.toString(vis[i]));
//		}
		
		
		System.out.println(result);
		
		
		
	}

}
