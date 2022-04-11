package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 연결요소의개수 {
	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()) + 1;
		int M = Integer.parseInt(st.nextToken());
		
		int[][] arr = new int[N][N];
		
		for(int i=0;i<M;i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			
			arr[a][b] = 1;
			arr[b][a] = 1;
		}
//		for(int i=0;i<arr.length;i++) {
//			System.out.println(Arrays.toString(arr[i]));
//		}
		
		
		boolean[] vis = new boolean[N];
		Queue<Integer> q = new LinkedList<>();
		
		int count = 0;
		
		for(int j=1;j<N;j++) {
			if(vis[j] == false) {
				q.add(j);
				vis[j] = true;
				
				while(!q.isEmpty()) {
					int x = q.poll();
					
					for(int i=0;i<N;i++) {
						
						if(arr[x][i] == 1 && vis[i] == false) {
							vis[i] = true;
							q.add(i);
						}
					}
				}
				count++;
				
			}
			
		}
			

//		System.out.println(Arrays.toString(vis));
		
		System.out.println(count);
		
	}
	

}
