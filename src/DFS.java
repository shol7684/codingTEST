
public class DFS {
	
	static int n;
	static int m;
	
//	static int[][] graph = new int[n][m];
	
	static int[][] graph = {
			{0, 0, 1, 1, 0},
			{0, 0, 0, 1, 1},
			{1, 1, 1, 1, 1},
			{0, 0, 0, 0, 0}
	};
	public static void main(String[] args) throws Exception {

	
		
		n = 4;
		m = 5;
		
		int result = 0;
		
		for(int i=0;i<n;i++) {
			
			for(int j=0;j<m;j++) {
				// 현재 위치에서 dfs 수행
				if(dfs(i,j)) {
					result += 1;
				}
				
			}
		}
		
		System.out.println(result);
	
	}
	public static boolean dfs(int x, int y) {
		
		// 주어진 범위를 벗어나는 경우에는 즉시 종료
		
		if(x <= -1 || x >=n || y <= -1 || y >= m) {
			return false;
		}
//		System.out.println("x = " + x);
//		System.out.println("y = " + y); 
//		System.out.println();
		
		// 현재 노드를 아직 방문하지 않았다면
		if(graph[x][y] == 0) {
//			for(int k=0;k<graph.length;k++) {
//				System.out.println(Arrays.toString(graph[k]));
//			}
//			System.out.println();
			// 해당 노드 방문 처리
			
			graph[x][y] = 1;
			//상, 하, 좌, 우의 위치들도 모두 재귀적으로 호출
			
			dfs(x-1, y);
			dfs(x, y -1);
			dfs(x+1, y);
			dfs(x, y+1);
			
			return true;
		}
		return false;
		
	}
	
	
}
