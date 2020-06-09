package com.linkedlis.nthNodeFromEnd;

public class NthInLinkedListNodeFromEnd {
	static Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	public static void main(String[] args) {
		NthInLinkedListNodeFromEnd list = new NthInLinkedListNodeFromEnd();
		list.add(3);
		list.add(2);
		list.add(8);
		list.add(5);
		list.add(7);
		list.add(1);
		list.add(12);
		
		list.printNode();
		System.out.println();
		System.out.println("=============================");
		list.NthNodeFromEnd(5);
		
	}
	private void NthNodeFromEnd(int n) {
		int len=0;
		Node temp = head;
		
		while(temp != null) {
			temp = temp.next;
			len++;
		}
		if(len < n)
			return;
		temp = head;
		
		for(int i=1;i<len-n+1;i++)
			temp = temp.next;
		System.out.println("Nth Node is: "+temp.data);
		
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
