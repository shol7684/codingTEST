package pagingExam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		while(true) {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			
			int page = Integer.parseInt(br.readLine());
			
			System.out.println("이동페이지 : " + page);
			
			int view = 10;
			
//			int listStart = page * view  - view + 1; // 오라클
			int listStart = (page - 1) * view;
			int listEnd = page * view;
			
//			System.out.println("목록 시작 : " + listStart + " 목록 끝 : " + listEnd); // 오라클
			System.out.println("목록 시작 : " + listStart + " 부터: " + view + "개"); 
			
			
			int pageBoxSize = 5;
			int pageBoxStart = page - (page - 1) % pageBoxSize;
			
			System.out.println("페이지 박스 :" + pageBoxStart);
			
			 
			
		}

	}

}
