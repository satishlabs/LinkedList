package com.linkedlist;

public class LengthOfSinglyLinkedList {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		public Node(int data){
			this.data = data;
			next = null;
		}
	}
	public static void main(String[] args) {
		LengthOfSinglyLinkedList sList = new LengthOfSinglyLinkedList();
		//Add nodes to the list    
        sList.addNode(1);    
        sList.addNode(2);    
        sList.addNode(3);    
        sList.addNode(4); 
        sList.addNode(4);
        sList.addNode(4);
        
        sList.display();
        
       System.out.println("Size of Node:   "+sList.ListSize());
	}

	public int ListSize() {
		Node temp = head;
		int count=0;
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
	
		
	}

	public void display() {
		Node temp = head;
		if(head == null) {
			System.out.println("Empty");
			return;
		}
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}
		System.out.println();
	}

	public void addNode(int data) {
		Node new_node = new Node(data);
		new_node.next = head;
		head = new_node;
	}
}
