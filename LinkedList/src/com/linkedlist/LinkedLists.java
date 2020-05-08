package com.linkedlist;

public class LinkedLists {
	
	Node head;
	
	class Node{
		int data;
		Node next;
		
		Node(int d){
			this.data = d;
			this.next = null;
		}
	}
	
	public static void main(String[] args) {
		LinkedLists llist = new LinkedLists();
		for(int i=5;i>0;--i){
			llist.push(i);
			llist.print();
		}
		llist.printMiddle();
	}

	public void printMiddle() {
		Node fast = head;
		Node slow = head;
		if(head != null){
			while(fast!= null && fast.next != null){
				slow = slow.next;
				fast = fast.next.next;
			}
			System.out.println("Middle ->"+slow.data);
		}
		
	}

	public void print() {
		Node n = head;
		while(n != null){
			System.out.print("-> "+n.data);
			n = n.next;
		}
		System.out.println("");
		
	}

	public void push(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
	
}
