package test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class test2 {
	
	public static void main(String[] args) {
		
		String[] arr = {"95", "97674223", "11 2"};
		
		int[] ar = {1,2,3,4,5};
		
		System.out.println(arr[1].startsWith(arr[0]));
		
		System.out.println(Arrays.asList(arr).contains("95"));
		
		System.out.println(Arrays.toString(arr));
		
		System.out.println(Arrays.asList(ar));
	
		Set set = new LinkedHashSet<>();
		
		Set set2 = new LinkedHashSet();
		
		
		set.add(1);
		
		set2.add(1);
		
		System.out.println(set);
		System.out.println(set2);
		
		
		System.out.println(set.addAll(set2));
		
		System.err.println(set);
		
		System.out.println(set.contains(3));
		
		
		
		String u = "123" +
					"4556";
		
		System.out.println(u);
		
		String[] tt = null;
		
		System.out.println(tt);

		
		tt = new String[0];
		
		System.out.println(Arrays.toString(tt));
		
		
		Map map = new HashMap();
		
		map.put("tt", 1);
		
		System.out.println(map.get("t"));
		
		
		
		try {
			System.out.println("트라이");
			tt[1] = "123";
			
			System.out.println("tt= " + tt[1]);
		} catch (Exception e) {
			System.out.println("에러");
		}
		
		System.out.println(tt[10] != null);
		
		
		
	}
	
}

