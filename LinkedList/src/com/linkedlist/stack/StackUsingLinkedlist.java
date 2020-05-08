package com.linkedlist.stack;

public class StackUsingLinkedlist {
	class Node{
		int data; // integer data 
		Node link; // reference variavle Node type
	}
	Node top; // create globle top reference variable 
	public StackUsingLinkedlist() {
		this.top = null;
	}
	 // Utility function to add an element x in the stack 
	public void push(int x) {
		Node temp = new Node();
		
		 // check if stack (heap) is full. Then inserting an 
        //  element would lead to stack overflow 
		if(temp == null) {
			System.out.print("\n Heap Overflow");
			return;
		}
		   // initialize data into temp data field 
		temp.data =x;
		
		// put top reference into temp link 
		temp.link = top;
		
	     // update top reference 
		top =temp;
	}
	
	 // Utility function to check if the stack is empty or not 
	public boolean isEmpty() {
		return top == null;
	}
	
	// Utility function to return top element in a stack 
	public int peek() {
		if(!isEmpty()) {
			return top.data;
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	// Utility function to pop top element from the stack 
	public void pop() {
		// check for stack underflow 
		if(top == null) {
			System.out.println("Stack Underflow");
			return;
		}
		// update the top pointer to point to the next node 
		top = top.link;
	}
	public void display() {
		 // check for stack underflow 
		if(top == null) {
			System.out.println("Stack Underflow");
			return;
		}else {
			Node temp = top;
			while(temp != null) {
				System.out.println("[ "+temp.data+" ]");
				temp = temp.link;
			}
		}
	}
}
