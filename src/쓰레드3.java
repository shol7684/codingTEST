
public class 쓰레드3 {
	public static void main(String[] args) {


		Food food = new Food();
		
		Waiter waiter = new Waiter("웨이터" , food);
		
		Chef chef = new Chef("주방장" , food);
		
		waiter.start();
		chef.start();
		
		
	
	
	
	
	}
	}

class Food {
	public void receiveOrder(String Waiter) {
		for(int i=0;i<5;i++) {
			System.out.println(Waiter + " 이 주문을 받았습니다 ");
		}
		System.out.println(Waiter + "가 주문을 주방에 전달합니다");
		System.out.println();
	}
	
	public void makeFood(String Chef) {
		for(int i=0;i<5;i++) {
			System.out.println(Chef + "가 음식을 만듭니다");
		}
		System.out.println(Chef + "가 음식을 다 만들었습니다");
		System.out.println();
	}
}


class Chef extends Thread {
	String Chef;
	Food food;
	
	
	public Chef(String chef, Food food) {
		Chef = chef;
		this.food = food;
	}


	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			food.makeFood(Chef);
		}
	}
	
	
	
}


class Waiter extends Thread {
	String waiter;
	Food food;
	
	public Waiter(String waiter, Food food) {
		this.waiter = waiter;
		this.food = food;
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			food.receiveOrder(waiter);
		}
	}
	
	
}


