package test;

import java.util.Arrays;

class Solution3 {
    public int solution(int[] citations) {
        int answer = 0;
        
        java.util.Arrays.sort(citations);
        
        System.out.println(Arrays.toString(citations));
        
        return answer;
    }
}

public class H_index {

	
	public static void main(String[] args) {
//		int[] citations = {3, 0, 6, 1, 5};
		int[] citations = {1,2,3,3,3};
		
		Solution3 s = new Solution3(); 
		
		s.solution(citations);
		
	}
	
	

}
