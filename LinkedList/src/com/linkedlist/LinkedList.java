package com.linkedlist;

public class LinkedList {
	//Find the middle of a given linked list in C and Java
	
	Node head; // head of linked list 
	
	/* Linked list node */
	class Node{
		int data;
		Node next;
		
		Node(int d){
			data = d;
			next = null;
		}
	}
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		for(int i=6;i>0;--i){
			list.push(i);
			list.printList();
			list.printMiddle();
		}
	}

	public void printMiddle() {
		Node slow_ptr = head;
		Node fast_ptr = head;
		if(head != null){
			while(fast_ptr != null && fast_ptr.next != null){
				fast_ptr = fast_ptr.next.next;
				slow_ptr = slow_ptr.next;
			}
			System.out.println("The middle elements is [" +slow_ptr.data+ "]\n");
		}
		
	}

	public void printList() {
		Node tnode = head;
		while(tnode != null){
			System.out.print(tnode.data+" ->");
			tnode = tnode.next;
		}
		System.out.println("NULL");
	}

	public void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
		
	}
}
