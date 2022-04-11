package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class bfs와dfs {
	static int[][] arr = {
			{0, 0, 0, 0, 0 },
			{0, 0, 1, 1, 1 },
			{0, 1, 0, 0, 1 },
			{0, 1, 0, 0, 1 },
			{0, 1, 1, 1, 0 }
	};
	
	
	
	static int start = 0; 
	static int n = 0;
	static int m = 0;
	static int v = 0;
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		v = Integer.parseInt(st.nextToken());
		
		arr = new int[n+1][n+1]; 
		
		dvis = new boolean[n+1];
		
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			arr[x][y] = 1;
			arr[y][x] = 1;
			
		}
		
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		start = v;
		
		
		System.out.print(start + " ");
		
		dfs(start);
		
		System.out.println();
		bfs();
		
		
		
	}
	
	static void bfs() {
		Queue<Integer> q = new LinkedList<>();
		boolean[] vis = new boolean[n+1];;
		
		q.add(start);
		vis[start] = true;
		System.out.print(start + " ");
		
		while(!q.isEmpty()) {
			int poll = q.poll();
			
			for(int i=0;i<n+1;i++) {
				if(arr[poll][i] == 1 && vis[i] == false) {
					q.add(i);
					vis[i] = true;
					System.out.print(i + " ");
				}
			}
			
		}
		System.out.println();
	}
	
	
	static boolean[] dvis = null;
	
	static void dfs(int start) {
		Stack<Integer> s = new Stack<>();
		
		s.add(start);
		dvis[start] = true;
		
		for(int i=0;i<arr[start].length;i++) {
			if(arr[start][i] == 1 && dvis[i] == false) {
				System.out.print(i + " ");
				dfs(i);
			}
		}
		
		
		
		
		
	}
	
	
	
	
}
