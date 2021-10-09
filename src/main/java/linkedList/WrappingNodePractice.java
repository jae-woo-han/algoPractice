package linkedList;

class LinkedList {
	Node header;
	
	static class Node {
		int data;
		Node next = null;
	}
	
	LinkedList(){
		header = new Node();
	}
	
	void append(int d) {
		Node end = new Node();
		Node n = header;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}
	
	void delete(int d) {
		Node n = header;
		while (n.next != null) {
			if (n.next.data == d) {
				n.next = n.next.next;
			}else {
				n = n.next;
			}
		}
	}
	
	void retrieve() {
		Node n = header.next;
		while(n.next != null) {
			System.out.print(n.data + " -> ");
			n = n.next;
		}
		System.out.println(n.data);
	}
}

public class WrappingNodePractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
