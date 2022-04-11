package 자료구조;

import javax.xml.crypto.Data;

class LinkedList {

	class Node {
		private Node next;
		private Object data;

	}
	
	private Node node;
	private int size;
	
	
	public LinkedList() {
		node = new Node();
		size = 0;
	}
	
	public void add(Object obj) {
		next(this.node, obj);
		
		size++;
	}
	
	private void next(Node node, Object obj) {
		System.out.println("데이터가 널인가 ? :" );
		System.out.println(node.data == null);
		
		if(node.data != null) {
			Node nextNode = new Node();
			node.next = nextNode;
			
			System.out.println(123123);
			next(nextNode, obj);
			return;
		} else {
			node.data = obj;
			System.err.println(node);
			
		}
		System.out.println();
		
	}
	
	public int size() {
		
		return size;
	}
	
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		sb.append(node.data);
		
		for(int i=1;i<size;i++) {
			sb.append(", ");
			sb.append(node.next.data);
			
			if(i == size-1) {
				return sb.append("]").toString();
			}
			
		}
		
		sb.append("]");
		
		
		
		return sb.toString();
	}
	
	
}


public class 링크드리스트1 {

	
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		
		list.add(1);
		list.add(2);
		list.add(3);
//		list.add(4);
		
		System.out.println("list : " + list);
		
		
	}
}
