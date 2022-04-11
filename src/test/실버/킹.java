package test.실버;

import java.util.Arrays;

public class 킹 {

	public static void main(String[] args) {
//		A1 A2 5
//		B
//		L
//		LB
//		RB
//		LT
		
		String king = "A1";
		String stone = "A2";
		
		int n = 5;
		
		String[] x = {"A", "B", "C", "D", "E", "F", "G", "H" };
		String[] com = {"B", "L", "LB", "RB", "LT" };
		
		
		int[][] arr = new int[8][8];
		
		int kingX = Math.abs(king.charAt(1) - 56);
		int kingY = king.charAt(0) - 65;
		
		int stoneX = Math.abs(stone.charAt(1) - 56);
		int stoneY = stone.charAt(0) - 65;
		
		arr[kingX][kingY] = 1;
		arr[stoneX][stoneY] = 2;
		
		
		for(int i=0;i<8;i++) {
			System.out.println(Arrays.toString(arr[i]));
		}
		
		for(int i=0;i<n;i++) {
			
			String c = com[i];
			
			if(c.equals("R")) {
				if(check(kingX, kingY) == true) {
					kingY++;
				}
			} else if(c.equals("L")) {
				if(check(kingX, kingY) == true) {
					kingY--;
				}
			} else if(c.equals("B")) {
				if(check(kingX, kingY) == true) {
					kingX++;
				}
			} else if(c.equals("T")) {
				if(check(kingX, kingY) == true) {
					kingX--;
				}
			} else if(c.equals("RT")) {
				if(check(kingX, kingY) == true) {
					kingY++;
					kingX--;
				}
			} else if(c.equals("LT")) {
				if(check(kingX, kingY) == true) {
					kingY--;
					kingX--;
				}
			} else if(c.equals("RB")) {
				if(check(kingX, kingY) == true) {
					kingY++;
					kingX++;
				}
			} else if(c.equals("LB" )) {
				if(check(kingX, kingY) == true) {
					kingY--;
					kingX++;
				}
			}
			
		}
		

	}
	
	static boolean check(int x, int y) {
//		if(kingX + 1 < 0 || kingX + 1 > 7) continue;
//		if(kingY + 1 < 0 || kingY + 1 > 7) continue;
		
		if(x + 1 < 0 || x + 1 > 7) return false;
		if(y + 1 < 0 || y + 1 > 7) return false;
		
		return true;
	}

}
