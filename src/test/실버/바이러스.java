package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 바이러스 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int com = Integer.parseInt(br.readLine());
		int n = Integer.parseInt(br.readLine());
		
		
		int[][] arr = new int[com+1][com+1];
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
			
			
			
		}
		
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		
		Queue<int[]> q = new LinkedList<>();
		boolean[] vis = new boolean[com+1];
		
		q.add(new int[] {1,1});
		vis[1] = true;
		int count = 0 ;
		
		while(!q.isEmpty()) {
			int[] poll = q.poll();
			
			int px = poll[0];
			int py = poll[1];
			
			for(int i=0;i<com+1;i++) {
				if(arr[py][i] == 1 && vis[i] == false) {
					
					q.add(new int[] {py,i});
					vis[i] = true;
					count++;
					System.out.println("py : " + py + ", i  : " +i );
				}
			}
			
		}
		
		System.out.println(count);
		
		
	}

}
