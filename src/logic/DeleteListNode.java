package logic;

public class DeleteListNode {

	public static void main(String[] args) {

	}

	public void deleteNode(ListNode node) {

		ListNode prev = node;
		while (node.next != null) {
			node.val = node.next.val;
			prev = node;
			node = node.next;
		}
		prev.next = null;
	}

}
