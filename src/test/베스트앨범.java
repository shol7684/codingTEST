package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 베스트앨범 {

	public static void main(String[] args) {

//		String[] genres = {"classic", "pop", "classic", "classic", "pop", "jazz"};
//		int [] plays = {500, 600, 150, 800, 2500, 1700};
		String[] genres = {"classic", "pop", "classic", "classic", "classic"};
		int [] plays = {500, 1000, 400, 300, 200};
		
		Solution s = new Solution();
		
		System.out.println(s.solution(genres, plays));
	}

}
class Solution {
    public List<Integer> solution(String[] genres, int[] plays) {
        Map<String, Integer> map = new HashMap<>();
        
        for(int i=0;i<genres.length;i++) {
        	
        	if(map.containsKey(genres[i])) {
        		int p = map.get(genres[i]);
        		
        		map.put(genres[i], plays[i]+p);
        		
        	} else {
        		map.put(genres[i], plays[i]);
        	}
        }
        
//        Sort[] sort = new Sort[genres.length];
        List<Sort> list = new ArrayList<>();
        
        for(int i=0;i<genres.length;i++) {
        	Sort s = new Sort(i, genres[i], plays[i], map.get(genres[i]));
        	list.add(s);
        }
        
        
        Comparator<Sort> comp = new Comparator<Sort>() {
			@Override
			public int compare(Sort o1, Sort o2) {
				
				if(o2.total == o1.total) {
					
					if(o2.play == o1.play) {
						return o1.num - o2.num;
					}
					
					return o2.play - o1.play;
				}
				
				return  o2.total - o1.total;
			}
		};
		
		Collections.sort(list, comp);
        
		
		
		
		map = new HashMap<>();
		
		List<Integer> result = new ArrayList<>();
		
		for(int i=0;i<list.size();i++) {
			String g = list.get(i).genre;
			
			if(map.containsKey(g)) {
				int p = map.get(g);
				
				if(p == 2) {
//					list.remove(i);
				} else {
					map.put(g, p + 1);
					result.add(list.get(i).num);
				}
			} else {
				map.put(g, 1);
				result.add(list.get(i).num);
			}
		}
		
//		for(int i=0;i<list.size();i++) {
//        	System.out.println(list.get(i));
//        }
		
        return result;
    }
}


class Sort {
	int num;
	String genre;
	int play;
	int total;
	
	public Sort(int num, String genre, int play, int total) {
		this.num = num;
		this.genre = genre;
		this.play= play;
		this.total = total;
	}

	@Override
	public String toString() {
		return "Sort [num=" + num + ", genre=" + genre + ", play=" + play + ", total=" + total + "]";
	}

	
	
	
	
}