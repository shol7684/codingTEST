package test.실버;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.StringTokenizer;

public class 회사에있는사람 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		Map<String, Boolean> map = new HashMap<>();
		
		for(int i=0;i<n;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String c = st.nextToken();
			
			if(map.containsKey(name)) {
				map.remove(name);
			} else {
				map.put(name, true);
			}
		}
		
		Object[] arr = map.keySet().toArray();
		
		Arrays.sort(arr, Collections.reverseOrder());
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
}
