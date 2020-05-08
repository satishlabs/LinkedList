package com.linkedlist;

public class ReverseLinkedListTest {
	 static Node head;
	static class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		ReverseLinkedListTest list = new ReverseLinkedListTest();
		list.head = new Node(85);
		list.head.next = new Node(15);
		list.head.next.next = new Node(4);
		list.head.next.next.next = new Node(20);
		System.out.println("Given Linked list"); 
        list.printList(head); 
        head = list.reverse(head); 
        System.out.println(""); 
        System.out.println("Reversed linked list "); 
        list.printList(head); 
	}

	public Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next = null;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}

	public void printList(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}
		
	}

}
