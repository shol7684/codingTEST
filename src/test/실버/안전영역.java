package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class 안전영역 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());

		int[][] arr = new int[N][N];
		
		Set<Integer> set = new HashSet<>();
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0;j<N;j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
				set.add(arr[i][j]);
			}
		}
		
		if(set.size() == 1) {
			System.out.println(1);
			return;
		}
		
		Iterator<Integer> it = set.iterator();
		
		int max = 0;
		
		while(it.hasNext()) {
			int a = it.next();
			int result = bfs(arr, a);
			
			if(result > max ) { 
				max = result;
			}
		}
		
		System.out.println(max);
		
		
		
		
		
		
		
		
	}
	
	static int bfs(int[][] arr, int n) {
		int N = arr.length;
		

		boolean[][] vis = new boolean[N][N];

		
		Queue<int[]> q = new LinkedList<>();
		
		int[] vx = {-1, 0, 1, 0};
		int[] vy = {0, 1, 0, -1};
		
		int count = 0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(arr[i][j] > n && vis[i][j] == false) {
					
					q.add(new int[] {i,j});
					vis[i][j] = true;
					
					while(!q.isEmpty()) {
						int[] poll = q.poll();
						
						int px = poll[0];
						int py = poll[1];
						
						for(int k=0;k<4;k++) {
							int x = px + vx[k];
							int y = py + vy[k];
							
							if(0 <= x && 0<=y && x < N && y < N) {
								if(arr[x][y] > n && vis[x][y] == false) {
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
		
//		for(int i=0;i<N;i++) {
//			System.out.println(Arrays.toString(vis[i]));
//		}
		return count;
	}
	
}
