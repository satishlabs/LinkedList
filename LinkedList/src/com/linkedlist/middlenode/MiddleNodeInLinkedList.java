package com.linkedlist.middlenode;

public class MiddleNodeInLinkedList {
	
	Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int new_data){
			this.data = new_data;
			next = null;
		}
	}
	public static void main(String[] args) {
		MiddleNodeInLinkedList llist = new MiddleNodeInLinkedList();
		for(int i=6;i>0;--i){
			llist.insert(i);
			llist.displayNode();
			llist.middleNode();
		}
	}
	public void middleNode() {
		Node slow_ptr = head; 
        Node fast_ptr = head; 
        if (head != null) 
        { 
            while (fast_ptr != null && fast_ptr.next != null) 
            { 
                fast_ptr = fast_ptr.next.next; 
                slow_ptr = slow_ptr.next; 
            } 
            System.out.println("The middle element is [" + 
                                slow_ptr.data + "] \n"); 
        } 
	}
	public void displayNode() {
		Node temp = head;
		while(temp.next != null){
			System.out.println(temp.data+"->");
			temp = temp.next;
		}
		System.out.println("NULL");
		
	}
	public void insert(int new_data) {
		Node new_node = new Node(new_data);
		new_node.next = head;
		head  = new_node;
	}
}
