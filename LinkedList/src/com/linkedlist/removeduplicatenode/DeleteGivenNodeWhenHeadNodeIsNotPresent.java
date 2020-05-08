package com.linkedlist.removeduplicatenode;

public class DeleteGivenNodeWhenHeadNodeIsNotPresent {
	static Node head;
	static class Node{
		Node next;
		int data;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		DeleteGivenNodeWhenHeadNodeIsNotPresent list = new DeleteGivenNodeWhenHeadNodeIsNotPresent();
		list.head = new Node(1);
		list.head.next = new Node(12);
		list.head.next.next = new Node(1);
		list.head.next.next.next= new Node(4);
		list.head.next.next.next.next = new Node(10);
		
		System.out.println("Before deleting");
		list.printList(head);
		
		list.deleteNode(head);
		System.out.println("====================");
		System.out.println("After deleting");
		list.printList(head);
	}

	private void deleteNode(Node node) {
		Node temp = node.next;
		node.data = temp.data;
		node.next = temp.next;
		System.gc();
		
	}

	public void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}
	}
}
