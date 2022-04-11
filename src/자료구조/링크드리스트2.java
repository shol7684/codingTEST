package 자료구조;

class Node {
	int data;
	Node next = null;
	
	public Node(int d) {
		this.data = d;
	}
	
	void append(int d) {
		Node end = new Node(d);
		Node n = this;
		
		while(n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	
	void delete(int d) {
		Node n = this;
		while(n.next != null) {
			if(n.next.data == d) {
				n.next = n.next.next;
			} else {
				n = n.next;
			}
		}
	}
	
	void retrieve() {
		Node n = this;
		while(n.next != null) {
			System.out.println(n.data + "->");
			n=n.next;
		}
		
		System.out.println(n.data);
		
	}
}

public class 링크드리스트2 {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.append(2);
		System.out.println();
		head.retrieve();
		
		
		
	}
	
}
