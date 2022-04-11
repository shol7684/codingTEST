package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class 숨바꼭질 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		if(N == K) { 
			System.out.println(0);
			return;
		}
		
		Queue<Integer> q = new LinkedList<>();
		int[] arr = new int[100001];
		
		arr[K] = -1;
		
		q.add(N);
		
		int c= -1;
		
		while(!q.isEmpty()) {
			int px = q.poll(); // 5 ,/ 4, 6, 10, /  
			
			if(0<=px-1 && px-1 <= 100000 ) {
				if(arr[px-1] == -1) {
					System.out.println(arr[px] +1);
					return;
				}
				
				if(arr[px-1] == 0) {
					q.add(px-1);
					arr[px-1] = arr[px] + 1;
				}
			}
			
			if(0<=px+1 && px+1 <= 100000 ) {
				if(arr[px+1] == -1) {
					System.out.println(arr[px] +1);
					return;
				}
				
				if(arr[px+1] == 0) {
					q.add(px+1);
					arr[px+1] = arr[px] +1;
				}
			}
			
			if(0<=px*2 && px*2 <= 100000 ) {
				if(arr[px*2] == -1) {
					System.out.println(arr[px] +1);
					return;
				}

				if(arr[px*2] == 0) {
					
					q.add(px*2);
					arr[px*2] = arr[px] +1;
				}
			}
			
				
//				for(int i=0;i<30;i++) {
//					System.out.print(arr[i] + " ");
//				}
//				System.out.println();
			
		}
		
		
		
		
		
		
		
		
		
		
	}
}
