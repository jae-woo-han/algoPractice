package linkedList;

public class SearchToLastWithRecursiveTest {

	// linked list의 마지막 부터 k번째 값을 가져오기
	// 재귀 호출 활용
	public static void main(String[] args) {
		Node head = new Node(1);
		head.append(2);
		head.append(3);
		head.append(4);
		head.retrieve();
		head.delete(2);
		head.retrieve();
		
		int k = 2;
		SearchToLastWithRecursive(head, k);

	}
	// 내일은 로직 개선 여부 좀 찾아보자
	private static int SearchToLastWithRecursive(Node n, int k) {
		if(n == null) {
			return 0;
		}
		
		int count = SearchToLastWithRecursive(n.next, k) +1;
		if (count == k) {
			System.out.println("마지막에서 "+k+"번 째 값은 : "+n.data);
		}
		return count;
	}
}
