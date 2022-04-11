
interface 이동{
	void 위();
	void 아래();
}

abstract class 온순한동물 {
	public void 위() {
		System.out.println("위로 이동");
	}
	public void 아래() {
		System.out.println("아래로 이동");
	}
	public void 오른쪽() {
		System.out.println("오른쪽으로 이동");
	}
	public void 왼쪽() {
		System.out.println("인쪽으로 이동");
	}
	
	abstract void 먹기();
}

class 소 extends 온순한동물{

	@Override
	void 먹기() {
		System.out.println("풀 먹기");
	}
}

class 원숭이 extends 온순한동물{

	@Override
	void 먹기() {
		System.out.println("바나나 먹기");
		
	}
	
	
}




class 호랑이 {
	
}



public class 동물 {
	
	static void 움직이기(온순한동물 a1) {
		a1.아래();
		a1.위();
		a1.먹기();
		System.out.println("====================");
	}
	public static void main(String[] args) {
		
		소 a1 = new 소();
		원숭이 a2 = new 원숭이();
		움직이기(a1);
		움직이기(a2);
	}
}
