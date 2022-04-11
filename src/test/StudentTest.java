package test;

import java.lang.reflect.Method;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.Comparator;


public class StudentTest {

	public void test() {
		System.out.println(1);
	}
	
	public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, SecurityException {

		Class c = Class.forName("test.StudentTest");
		
		System.out.println(c);
		
		System.out.println(c.getMethods());
		
		Method[] method = c.getMethods();
		
		System.out.println(method.length);
		
		for(int i=0;i<method.length;i++) {
			System.out.println(method[i]);
			System.out.println(method[i].getName());
			
		}

	
	String[] files = { "img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
	
	File[] file = new File[files.length];
	
	for(int j =0;j<files.length;j++) {
		
		String s = files[j];
		
		String head = "";
		
		String number = "";
		
		String tail = "";
		
		String state = "head";
		
		
		for(int i=0;i<s.length();i++) {
			
			if(state.equals("head")) {
				if(s.charAt(i) < '0' || '9' < s.charAt(i)) {
					head += String.valueOf(s.charAt(i));
				} else {
					state = "number";
				}
			}
			
			if (state.equals("number")) {
				if('0' <= s.charAt(i) && s.charAt(i) <= '9') {
					number += String.valueOf(s.charAt(i));
					
				} else {
					state = "tail";
				}
			}
			
			if(state.equals("tail")) {
				tail += String.valueOf(s.charAt(i));
			}
			
		}
	
		
		file[j] = new File(head, number, tail);
		
		
		
	}
	
	
	Comparator<File> comp = new Comparator<File>() {
		
		public int compare(File a, File b ) {
			
			if(a.head.compareToIgnoreCase(b.head) == 0) {
				if(Integer.parseInt(a.number) < Integer.parseInt(b.number)) {
					return -1;
				} else if(Integer.parseInt(a.number) > Integer.parseInt(b.number)) {
					return 1;
				} else {
					return 0;
				}
			}
			
			return a.head.compareToIgnoreCase(b.head);
		}
		
	};
	
	Arrays.sort(file,comp);
	
//	for(int i=0;i<files.length;i++) {
//		System.out.println(file[i].toString());
//	}
	
	StringBuilder sb =new StringBuilder();
	String[] answer = new String[files.length];
	
	for(int i=0;i<files.length;i++) {
		answer[i] = file[i].head + file[i].number + file[i].tail;
//		System.out.println(answer[i]);
	}
	
	
	
	}
}

class File {
	String head;
	String number;
	String tail;
	
	public File(String head, String number, String tail) {
		this.head = head;
		this.number = number;
		this.tail = tail;
	}

	@Override
	public String toString() {
		return "file [head=" + head + ", number=" + number + ", tail=" + tail + "]";
	}
	
	
}

