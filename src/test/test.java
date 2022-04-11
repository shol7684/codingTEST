package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class test {

	
	public static void main(String[] args) throws IOException  {
		
		new Thread(new T1()).start();;
		new Thread(new T2()).start();;
		
		System.out.println("메인끝");
	}

}


class T1 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " : " + 1);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("T1끝");
	}
}

class T2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			try {
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + " : " + 2);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("T2끝");
	}
}

	
	
	
	
	
