//
//public class 쓰레드 {
//	public static void main(String[] args) {
//		
//		for(int i=1;i<10;i++) {
//			Thread t = new Thread(new Horse(i));
//			t.start();
//		}
//		
//		
//		
//		
//		
//		
//		
//	}
//}
//
//class Horse implements Runnable {
//	private int horseNum;
//	
//	public Horse(int horseNum) {
//		this.horseNum = horseNum;
//	}
//
//	@Override
//	public void run() {
//		long sleepTime = (long)(Math.random() * 500);
//		System.out.println(horseNum + "번 말이 " + sleepTime + "만큼 sleep");
//		
//		try {
//			Thread.sleep(sleepTime);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		
//		for(int i=1; i<=10;i++) {
//			System.out.println(horseNum + "번 말이" + 100*i + "미터 도착");
//		}
//		
//		System.out.println(horseNum +"번 말이 경승선 도착");
//		
//	}
//	
//	
//}