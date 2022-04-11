package 자료구조;

class LinkedList3<T> {
	
	class Node {
		T data;
		Node next;
//		@Override
//		public String toString() {
//			return "Node [data=" + data + ", next=" + next + "]";
//		}
	}
	
	
	private Node node;
	private int size = 0;
	
	public LinkedList3() {
		
	}
	
	
	public void add(T obj) {
		
		if(this.node == null) {
			this.node = new Node();
			this.node.data = obj;
			size++;
			return;
		}
		
		Node n = this.node;
		while(n.next != null) {
			n = n.next;
		}
		Node end = new Node();
		end.data = obj;
		
		n.next = end;
		size++;
	}
	
	public void add(int index, T obj) {
		Node prev = this.node;
		
		if(index == 0 ) {
			Node node = new Node();
			node.data = obj;
			node.next = prev;
			this.node = node;
			
			return;
		}
		
		for(int i=0;i<index-1;i++) {
			prev = prev.next;
		}
		
		Node next = prev.next;
		Node add = new Node();
		add.data = obj;
		add.next = next;
		prev.next = add;
		
	}
	
	
	public void remove(int index) {
		if(index == 0 ) {
			this.node = this.node.next;
			return;
		}
		Node prev = this.node;
		for(int i=0;i<index-1;i++) {
			prev = prev.next;
		}
		
		Node remove = prev.next;
		Node next= remove.next;
		
		prev.next = next;
	}
	
	
	
	public T get(int index) {
		Node n = this.node;
		
		for(int i=0;i<index;i++) {
			n = n.next;
		}
		
		return n.data;
	}
	
	public int size() {
		return size;
	}
	
	

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		Node n = this.node;
		
		if(n==null) {
			return null;
		}
		
		sb.append(n.data);
		
		
		while(n.next != null) {
			sb.append(", ").append(n.next.data);
			n = n.next;
		}
		
		return sb.toString();
	}
	
}


public class 링크드리스트3 {

	public static void main(String[] args) {
		LinkedList3<Integer> list = new LinkedList3<>();
		
		System.out.println(list.size());;		
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(5);
		
		System.out.println(list);
//		System.out.println("size : " + list.size());;		
//		
//		System.out.println(list.get(3));
//		
//		list.remove(0);
//		
//		System.out.println(list);
//		
//		int a = list.get(0);
//		
//		System.out.println(a);
//		
//		System.out.println();
//		list.add(0,99);
//		System.out.println(list);

	}

}
