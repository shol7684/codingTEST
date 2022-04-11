
public class Main2 {
	
	int a = 1;
	int b = 2;
	
	static int c = 3;
	
	static void pt() {
		System.out.println("스테틱 pt");
//		System.out.println(a);
	}
	
	static void pt3() {
		int a = 3;
		
		System.out.println(a);
	}
	
	void pt2() {
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		

		pt();
		
		pt3();
		
//		Main2 m = new Main2();
//		
//		System.out.println(m.a);;
//		m.pt2();
			
			
		
	}

}
