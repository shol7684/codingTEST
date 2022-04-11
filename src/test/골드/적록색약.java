package test.골드;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

public class 적록색약 {
	public static void main(String[] args) throws IOException {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		int N = Integer.parseInt(br.readLine());
		

		int[][] no = new int[N][N];
		int[][] yes = new int[N][N];
		
		for(int i=0;i<N;i++) {
			String str = br.readLine();
			
			for(int j=0;j<N;j++) {
				char c = str.charAt(j);
				
				if(c == 'R') {
					no[i][j] = 1;
					yes[i][j] = 1;
				} else if(c == 'G') {
					no[i][j] = 2;
					yes[i][j] = 1;
					
				} else {
					no[i][j] = 3;
					yes[i][j] = 3;
				}
			}
			
		}
		
//		for(int i=0;i<N;i++) {
//			System.out.println(Arrays.toString(no[i]));
//		}
//		System.out.println();
//		for(int i=0;i<N;i++) {
//			System.out.println(Arrays.toString(yes[i]));
//		}
		
			
		System.out.print(dfs(no) + " ");
		System.out.print(dfs(yes));
	}
	
	static int dfs(int[][] arr) {
		int N = arr.length;
		boolean vis[][] = new boolean[N][N];
		
		Stack<int[]> s = new Stack<>();
		
		int[] vx = {-1, 0, 1, 0};
		int[] vy = {0, 1, 0, -1};
		int count = 0;
		
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(vis[i][j] == false) {
					s.push(new int[] {i,j});
					vis[i][j] = true;
					
					while(!s.isEmpty()) {
						int[] pop = s.pop();
						int px = pop[0];
						int py = pop[1];
						
						for(int k=0;k<4;k++) {
							int x = px + vx[k];
							int y = py + vy[k];
							
							if(0 <= x && 0 <= y && x < N && y < N && arr[px][py] == arr[x][y]) {
								if(vis[x][y] == false) {
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
		
		
		
		return count;
	}
}
