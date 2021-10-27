package queue;

import java.util.NoSuchElementException;

class Queue<T> {
	class Node<T> {
		private T data;
		private Node<T> next;

		public Node(T data) {
			this.data = data;
		}
	}

	private Node<T> first;
	private Node<T> last;

	public void add(T item) {
		Node<T> t = new Node<T>(item);

		if (last != null) {
			last.next = t;
		}
		last = t;
		if (first == null) {
			first = last;
		}
	}

	public T remove() {
		if (first == null) {
			throw new NoSuchElementException();
		}
		T data = first.data;
		first = first.next;

		if (first == null) {
			last = null;
		}
		return data;
	}
	
	public T peek() {
		if(first ==null) {
			throw new NoSuchElementException();
		}
		return first.data;
	}
	public boolean isEmpty() {
		return first == null;
	}
}

public class QueueTest {

	public static void main(String[] args) {
		Queue<Integer> que = new Queue<Integer>();
		que.add(1);
		que.add(2);
		que.add(3);
		que.add(4);
		
		System.out.println(que.remove());
		System.out.println(que.remove());
		System.out.println(que.peek());
		System.out.println(que.remove());
		System.out.println(que.isEmpty());
		System.out.println(que.remove());
		System.out.println(que.isEmpty());
	}

}
