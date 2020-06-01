package com.linkedlist;

public class MoveLastNodeToFirst {
	static Node head;
	
	class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		MoveLastNodeToFirst list = new MoveLastNodeToFirst();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		System.out.println("Linked List before moving last to front "); 
		list.printNode();
		
		System.out.println();
		list.modeLastNodeToFirst();
		 System.out.println("Linked List after moving last to front "); 
		list.printNode();
	}

	private void modeLastNodeToFirst() {
		if(head == null || head.next == null)
			return;
		
		Node secLast =null;
		Node last = head;
		while(last.next != null) {
			secLast = last;
			last = last.next;
		}
		
		secLast.next = null;
		
		last.next = head;
		head = last;
		
	}

	private void printNode() {
		Node temp = head;
		while(temp != null) {
			System.out.println("[ "+temp.data+" ]");
			temp = temp.next;
		}
	}

	private void add(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		
	}
	
}
