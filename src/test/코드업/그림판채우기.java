package test.코드업;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 그림판채우기 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		char[][] arr = new char[10][10];
		
		boolean[][] vis = new boolean[10][10];
		
		for(int i=0;i<10;i++) {
			String str = br.readLine();
			for(int j=0;j<10;j++) {
				arr[i][j] = str.charAt(j);
			}
		}
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int clickY = Integer.parseInt(st.nextToken());
		int clickX = Integer.parseInt(st.nextToken());
		
		Queue<int[]> q = new LinkedList<>();
		
		int[] vx = {0, 1, 0, -1};
		int[] vy = {1, 0, -1, 0};
		
		
		if(arr[clickX][clickY] == '*') {
			
			for(int i=0;i<10;i++) {
				System.out.println(arr[i]);
			}
			
			return;
		}
		
		q.add(new int[] {clickX, clickY});
		vis[clickX][clickY] = true;
		arr[clickX][clickY] = '*';
		
		while(!q.isEmpty()) {
			
			int[] poll = q.poll();
			int x = poll[0];
			int y = poll[1];
					
			for(int i=0;i<4;i++) {
				int xx = x + vx[i];
				int yy = y + vy[i];
				
				if(0 <= xx && xx < 10 && 0 <= yy && yy < 10) {
					if(arr[xx][yy] == '_' && vis[xx][yy] == false) {
						q.add(new int[] {xx,yy});
						vis[xx][yy] = true;
						arr[xx][yy] = '*';
					}
				}
			}
			
		}
		for(int i=0;i<10;i++) {
			System.out.println(arr[i]);
		}
		
		
	}

}
