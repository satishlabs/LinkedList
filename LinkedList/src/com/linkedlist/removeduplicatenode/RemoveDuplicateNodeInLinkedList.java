package com.linkedlist.removeduplicatenode;

import java.util.HashSet;

public class RemoveDuplicateNodeInLinkedList {
	 static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			this.data = d;
			next = null;
		}
	}
	public static void main(String[] args) {
		RemoveDuplicateNodeInLinkedList list = new RemoveDuplicateNodeInLinkedList();
		   	list.head = new Node(10); 
	        list.head.next = new Node(12); 
	        list.head.next.next = new Node(11); 
	        list.head.next.next.next = new Node(11); 
	        list.head.next.next.next.next = new Node(12); 
	        list.head.next.next.next.next.next = new Node(11); 
	        list.head.next.next.next.next.next.next = new Node(10); 
	  
	        System.out.println("Linked List before removing duplicates : \n "); 
	        list.printList(head); 
	        
	        list.remove_duplicates(); 
	        System.out.println(""); 
	        System.out.println("Linked List after removing duplicates : \n "); 
	        list.printList(head); 
	}
	public void remove_duplicates() {
		HashSet<Integer> hs = new HashSet<>();
		Node current = head;
		Node prev = null;
		while(current != null){
			int curVal = current.data;
			if(hs.contains(curVal)){
				prev.next = current.next;
			}else{
				hs.add(curVal);
				prev = current;
			}
			current = current.next;
		}
		
	}
	public void printList(Node node) {
		while(node != null){
			System.out.println(node.data+"->");
			node=node.next;
		}
		
	}
}
