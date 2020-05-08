package com.linkedlist.lengthLinkedList;

public class FindLengthOfLinkedList {
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void main(String[] args) {
		FindLengthOfLinkedList llist = new FindLengthOfLinkedList();
		 llist.push(1); 
	        llist.push(3); 
	        llist.push(1); 
	        llist.push(2); 
	        llist.push(1); 
	        
	        System.out.println("Count of nodes is " + 
                    llist.getCount()); 
	}
	private int getCount() {
		Node temp = head;
		int count=0;
		while(temp != null){
			count++;
			temp = temp.next;
		}
		return count;
	}
	public void push(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head = new_node;	
	}
}
