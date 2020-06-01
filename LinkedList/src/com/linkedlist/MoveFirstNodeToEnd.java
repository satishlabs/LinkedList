package com.linkedlist;

/*
 Move first element to end of a given Linked List
Write a C function that moves first element to end in a given Singly Linked List. 
For example, if the given Linked List is 1->2->3->4->5, 
then the function should change the list to 2->3->4->5->1.
  */

public class MoveFirstNodeToEnd {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data = data;
			this.next=null;
		}
		
	}
	public static void main(String[] args) {
		MoveFirstNodeToEnd list = new MoveFirstNodeToEnd();
		list.add(5);
		list.add(4);
		list.add(3);
		list.add(2);
		list.add(1);
		
		System.out.printf("\n Linked list before moving first to end\n"); 
		list.printNode();
		
		System.out.println();
		System.out.printf("\n Linked list after moving first to end\n");
		list.moveFirstNodeToEnd();
		
		list.printNode();
	}
	static Node moveFirstNodeToEnd() {
		if(head == null || (head.next) == null)
			return null;
		 /* Initialize first and last pointers */
		Node first = head;
		Node last = head;
		
		 /*After this loop last contains address  
	    of last node in Linked List */
		while(last.next != null) {
			last = last.next;
		}
		last.next = first;
		/* Change the head pointer to point  
	    to second node now */
		head = first.next;
		
	    /* Set the next of first as null */
		first.next = null;
		
	    /* Set the next of last as first */
		
		return head;
		
		
	}
	private void printNode() {
		Node temp = head;
		while(temp != null) {
			System.out.println("[ "+temp.data+" ]");
			temp = temp.next;
		}
		
	}
	public void add(int data) {
		Node node = new Node(data);
		node.next = head;
		head = node;
		
	}
}
