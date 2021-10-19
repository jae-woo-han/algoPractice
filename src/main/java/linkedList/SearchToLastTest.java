package linkedList;

public class SearchToLastTest {
	
	// linked list의 마지막 부터 k번째 값을 가져오기
	public static void main(String[] args) {
		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.retrieve();
		head.delete(2);
		head.retrieve();
		
		int k = 2;
		Node kth = SearchingKthToLast(head, k);
		System.out.println("마지막에서 "+k+"번 째 값은 : "+kth.data);

	}
	// 마지막이 몇번째인지 구하고 그 값에서 k+1한 값을 빼서 k번째 값을 구하는 메서드
	private static Node SearchingKthToLast(Node first, int k) {
		Node n = first;
		int total = 1;
		while(n.next !=null) {
			total++;
			n = n.next;
		}
		n = first;
		for(int i = 1; i < total -k+1; i++) {
			n = n.next;
		}
		return n;
	}

}
