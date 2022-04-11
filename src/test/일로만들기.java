package test;

public class 일로만들기 {

	public static void main(String[] args) {
		
		
		/*
		 * 어떤 수가 2로 나누어지면 2로 나누고 3으로 나누어지면 3으로 나누고 둘다 아니라면 1을 뺀다
		 */
		
		
		int n = 20;
	
		System.out.println(rec(n, 0));;

	}
	
	public static int rec(int n, int count) {
		
		if(n == 1) {
			return count;
		}
		
		if(n % 2 == 0) {
			int a = n;
			a /= 2;
			rec(a, count+1);
		}
		
		if(n % 3 == 0) {
			int a = n;
			a /= 3;
			rec(a, count+1);
		}
		
		int a = n;
		a -=1;
		
		rec(a, count+1);
		
	
		return count;
	}
	
	
}

class tt {
	
	
	public static void a() {
		
		System.out.println(111);
		
		ttt t = new ttt();
		System.out.println(t);
	}
	
}

class ttt {
	
}
