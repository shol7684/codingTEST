package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class 섬의개수 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			if(w == 0 && h == 0) {
				break;
			}
			
			int[][] arr= new int[h][w];
			
			boolean[][] vis = new boolean[h][w];
			
			for(int i=0;i<h;i++) {
				st = new StringTokenizer(br.readLine());
				for(int j=0;j<w;j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
//			for(int i=0;i<h;i++) {
//				System.out.println(Arrays.toString(arr[i]));
//			}
			
			Stack<int[]> s = new Stack<>();
			
			int[] vx = {-1, -1, 0, 1, 1,  1,  0, -1};
			int[] vy = { 0,  1, 1, 1, 0, -1, -1, -1};
			
			int count = 0;
			
			for(int i=0;i<h;i++) {
				for(int j=0;j<w;j++) {
					if(arr[i][j] == 1 && vis[i][j] == false) {
						
						s.push(new int[] {i,j});
						vis[i][j] = true;
						
						while(!s.isEmpty()) {
							int[] pop = s.pop();
							
							int px = pop[0];
							int py = pop[1];
							
							for(int k=0;k<vx.length;k++) {
								int x = vx[k] + px;
								int y = vy[k] + py;
								
								
								if(0 <= x && x < h && 0 <= y && y < w) {
									
									if(arr[x][y] == 1 && vis[x][y] == false) {
										s.push(new int[] {x,y});
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
