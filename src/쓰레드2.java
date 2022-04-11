//
//public class 쓰레드2 {
//	public static void main(String[] args) {
//
//		White white = new White();
//		Blue blue = new Blue();
//		
//		Thread t1 = new Thread(white);
//		Thread t2 = new Thread(blue);
//		
//		t1.start();
//		t2.start();
//	
//		
//		
//		
//		}
//		
//	
//}
//
//class White implements Runnable {
//	
//	int count = 0;
//	int count2 = 0;
//	
//	public void run() {
//		
//		while(true) {
//			System.out.println("백기 올려");
//			count++;
//			count2++;
//			if(count == 5) {
//				Thread.yield();
//				count = 0;
//				try {
//					Thread.sleep(2000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//			if(count2 == 10) {
//				Thread.interrupted();
//				break;
//			}
//		}
//	}
//	
//}
//
//class Blue implements Runnable {
//	int count = 0;
//	
//	@Override
//	public void run() {
//		System.out.println("청기 올려");
//		count++;
//		if(count == 5) {
//			Thread.yield();
//			count = 0;
//			try {
//				Thread.sleep(2000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//	
//}