package com.linkedlist;

import java.util.Stack;

public class RearrangeOddEven {
	static Node head;
	
	static class Node{
		int data;
		Node next;
		
		
	}
	
	public static void main(String[] args) {
		Node head = newNode(8);
		head = insertBeg(head, 7);  
	    head = insertBeg(head, 6);  
	    head = insertBeg(head, 5);  
	    head = insertBeg(head, 3);  
	    head = insertBeg(head, 2);  
	    head = insertBeg(head, 1);
	    System.out.println("Linked List: ");
	    printList(head);
	    
	    rearrangeOddEven(head);  
	    
	    System.out.println( "Linked List after "+ 
	                        "Rearranging:" );  
	    printList(head); 
	}
	private static void rearrangeOddEven(Node head) {
	Stack<Node> odd = new Stack<Node>();
	Stack<Node> even = new Stack<Node>();
	int i = 1;
	while(head != null) {
		if(head.data%2 != 0 && i%2 == 0) {
			 // Odd Value in Even Position  
            // Add pointer to current node  
            // in odd stack 
			odd.push(head);
		}else if(head.data%2 == 0 && i%2 != 0){
			 // Even Value in Odd Position  
            // Add pointer to current node  
            // in even stack 
			even.push(head);
		}
		head = head.next;
		i++;
		while(odd.size() > 0 && even.size() > 0) {
			int k = odd.peek().data;
			odd.peek().data = even.peek().data;
			even.peek().data = k;
			odd.pop();
			even.pop();
		}
	}
		
	}
	private static void printList(Node node) {
		while(node != null) {
			System.out.print(node.data+" ");
			node = node.next;
		}
		System.out.println("");
		
	}
	// Function to insert at beginning
	private static Node insertBeg(Node head, int data) {
		Node temp = newNode(data);
		temp.next = head;
		head = temp;
		return head;
	}

	//create a new Node in linkedList
	public static Node newNode(int data) {
		Node temp = new Node();
		temp.data = data;
		temp.next = null;
		return temp;
	}
}
