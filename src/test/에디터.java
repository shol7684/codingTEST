package test;

import java.io.*;
import java.util.*;

// 링크드리스트로 풀었다가 시간초과
// 힌트보고 스택으로 변경
public class 에디터 {

	public static void main(String[] args) throws IOException {
		
		Stack<Character> stack1 = new Stack<>();
		Stack<Character> stack2 = new Stack<>();
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = br.readLine();
		
		for(int i=0;i<str.length();i++) {
			stack1.push(str.charAt(i));
		}
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0;i<n;i++) {

			StringTokenizer st = new StringTokenizer(br.readLine());
			
			String cm = st.nextToken();
			
			if(cm.equals("L")) {
				if(!stack1.isEmpty())
					stack2.push(stack1.pop());
			} else if (cm.equals("D")) {
				if(!stack2.isEmpty())
					stack1.push(stack2.pop());
			} else if (cm.equals("B")) {
				if(!stack1.isEmpty())
					stack1.pop();
			} else {
				// p
				stack1.push(st.nextToken().charAt(0));
			}
			
				
			
		}
		
		
		while(!stack2.isEmpty()) {
			stack1.push(stack2.pop());
		}
		
		char[] result = new char[stack1.size()];
		
		for(int i=result.length-1;i>=0;i--) {
			result[i] = stack1.pop();
		}
		System.out.println(result);
	}
}
