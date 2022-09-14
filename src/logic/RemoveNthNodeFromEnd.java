package logic;

public class RemoveNthNodeFromEnd {

	public static void main(String[] args) {


	}

	int count = 0;
	int reverse = 0;

	public ListNode removeNthFromEnd(ListNode head, int n) {
		// moving forward
		if (head == null)
			return null;
		count++;
		removeNthFromEnd(head.next, n);
		// moving backward
		reverse++;
		if (reverse == n + 1) {
			head.next = head.next.next;
			reverse -= count;
			return head;
		}
		if (reverse == count)
			return head.next;
		return head;
	}
}
