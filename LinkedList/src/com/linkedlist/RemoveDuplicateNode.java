package com.linkedlist;

public class RemoveDuplicateNode {
	static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int data) {
			this.data = data;
		    next = null;
		}
	}
	public static void main(String[] args) {
		RemoveDuplicateNode list = new RemoveDuplicateNode();
		list.head = new Node(10);
		list.head.next = new Node(12);
		list.head.next.next = new Node(11);
		list.head.next.next.next = new Node(11);
		list.head.next.next.next.next = new Node(12);
		list.head.next.next.next.next.next = new Node(13);
		list.head.next.next.next.next.next.next = new Node(10);
		
		System.out.println("Print all Nodes");
		list.printList(head);
		
		 list.remove_duplicates(); 
	        System.out.println(""); 
	        System.out.println("Linked List after removing duplicates : \n "); 
	        list.printList(head); 
	}
	public void remove_duplicates() {
		Node ptr1= head;
		Node ptr2= null;
		Node dup =null;
		
		while(ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			
			while(ptr2.next != null) {
				if(ptr1.data == ptr2.next.data) {
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				}else {
					ptr2 = ptr2.next;
				}
			}
			ptr1 = ptr1.next;
		}
		
		
	}
	public void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}
		
	}
}
