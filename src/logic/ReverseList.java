package logic;

public class ReverseList {

	public static void main(String[] args) {

	}

	public static int teste(int n) {
		if (head == null || head.next == null) {
			return head;
		}

		ListNode curr = head, prev = null, next = null;
		while (curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
		return head;
	}

}
