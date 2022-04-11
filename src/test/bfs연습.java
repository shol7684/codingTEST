package test;

import java.util.Queue;
import java.util.Arrays;
import java.util.LinkedList;

public class bfs연습 {

	static int[][] arr = {
			{1,1,1,0,0},
			{1,1,1,1,0},
			{0,0,0,0,0},
			{1,1,1,1,0},
			{1,1,1,0,0},
	};
	
	
	static boolean[][] vis = new boolean[5][5];
	
	public static void main(String[] args) {
		
		
		
		Queue<int[]> q = new LinkedList<>();
		
		
		int[] vx = {0, 1, 0, -1};
		int[] vy = {1, 0, -1, 0}; 
		
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				boolean start = isStart(i,j);
				
				if(start == true) {
					
					vis[i][j] = true;
					q.add(new int[] {i,j});
					
					
					while(!q.isEmpty()) {
						int[] p = q.poll();
						int a = p[0];
						int b = p[1];
						
						for(int k=0;k<4;k++) {
							
							int x = a + vx[k];
							int y = b + vy[k];
							
							if(0 <= x && x < arr.length && 0 <= y && y < arr[0].length) {
								if(arr[x][y] == 1 && vis[x][y] == false) {
									vis[x][y] = true;
									q.add(new int[] {x,y});
								}
								
							}
						}
					}
					count++;
					
					
				}
				
			}
		}
		
		
		
		
		
		
		for(int i=0;i<vis.length;i++) {
			System.out.println(Arrays.toString(vis[i]));
		}
		
		System.out.println(count);
	}
	
	public static boolean isStart(int x, int y) {
		if(arr[x][y] == 1 && vis[x][y] == false) {
			return true;
		}
		
		return false;
	}
	
}
