package com.reverselinkedlist;

public class ReverseLinkedList {
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
		ReverseLinkedList list = new ReverseLinkedList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		list.printNode();
		
		System.out.println();
		System.out.println("========================== ");
		list.reversedLinkedList();
		list.printNode();
		
		
	}

	private Node reversedLinkedList() {
		Node next = null;
		Node prev = null;
		Node current = head;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
		
	}

	private void printNode() {
		Node temp = head;
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}
	}

	private void add(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
		
	}
}
