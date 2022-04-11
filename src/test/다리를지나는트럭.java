package test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.text.Position;

public class 다리를지나는트럭 {

	public static void main(String[] args) {
		
		
		Solution2 s = new Solution2();

//		long bridge_length = 100;
//		long weight = 100;
//		long[] truck_weights = {10};
		int bridge_length = 1;
		int weight = 100;
		int[] truck_weights = {10,100};
//		long bridge_length = 2;
//		long weight = 10;
//		long[] truck_weights = {7,4,5,6};
		
		System.out.println(s.solution(bridge_length, weight, truck_weights));;
		
		
		
		
	}
	
}
class Solution2 {
    public long solution(int bridge_length, int weight, int[] truck_weights) {
        long answer = 0;
		Queue<Truck> q = new LinkedList<>();
		List<Truck> list = new ArrayList<>();
		long count = truck_weights.length;
		
		int i=0;
		long current_weight = 0;
		
		LOOP:
        while(count > 0) {
        	
        	if(i < truck_weights.length && current_weight + truck_weights[i] <= weight) {
        		Truck t = new Truck(truck_weights[i], 0);
	        	q.add(t);
	        	list.add(t);
	        	
	        	current_weight += truck_weights[i];
	        	i++;
        	}
        	
        	
        	
        	for(int j=0;j<list.size();j++) {
        		
        		if(list.get(j).pass ==false) {
        			long position = list.get(j).run();
        			
        			if(position > bridge_length) {
        				count--;
        				q.poll();
        				list.get(j).pass = true;
        				current_weight -= list.get(j).weight;
        				continue LOOP;
        			}
        			
        		}
        		
        	}
        	answer++;
//        	System.out.prlongln("횟수 : " + answer);
//        	System.out.prlongln("현재 무게 : " + current_weight);
//        	System.out.prlongln();
        }
        
        
//        System.out.prlongln("answer : " + answer);
        return answer + 1;
    }
}

class Truck {
	long weight;
	long position;
	boolean pass;
	
	public long run() {
		position++;
		return position;
	}
	
	
	public Truck(long weight, long position) {
		this.weight = weight;
		this.position = position;
		pass = false;
	}



	@Override
	public String toString() {
		return "Truck [weight=" + weight + ", position=" + position + "]";
	}
	
	
}

