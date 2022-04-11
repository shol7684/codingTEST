package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class 단지번호붙이기 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int n = Integer.parseInt(br.readLine()) + 1;
		
		
		int[][] arr = new int[n][n];
		
		boolean[][] vis = new boolean[n][n];
		
		for(int i=1;i<n;i++) {
			String str = br.readLine();
			
			for(int j=1;j<n;j++) {
				arr[i][j] = str.charAt(j-1) - 48; 
				
			}
		}
		
		
		for(int i=0;i<n;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		Queue<int[]> q = new LinkedList<>();
		
		int[] vx = {0, 1, 0, -1};
		int[] vy = {1, 0, -1, 0};
		int total = 0;
		
		List<Integer> countList = new ArrayList<>();
		
		for(int i=1;i<n;i++) {
			for(int j=1;j<n;j++) {
				
				if(arr[i][j] == 1 && vis[i][j] == false) {
					
					q.add(new int[] {i,j});
					vis[i][j] = true;
					int count = 1;
					
					while(!q.isEmpty()) {
						int[] poll = q.poll();
						
						int px = poll[0];
						int py = poll[1];
						
						for(int k=0;k<4;k++) {
							int x = px + vx[k];
							int y = py + vy[k];
							
							if(0 < x && x < n && 0 < y && y < n) {
								
								if(arr[x][y] == 1 && vis[x][y] == false) {
									q.add(new int[] {x,y});
									vis[x][y] = true;
									count++;
								}
							}
							
						}
					}
					total++;
					countList.add(count);
					
					
				}
				
				
				
				
			}
		}
			
			System.out.println(total);		
			
			
			Collections.sort(countList);
			
			for(int i=0;i<countList.size();i++) {
				System.out.println(countList.get(i));
			}
			
			
	}

}
