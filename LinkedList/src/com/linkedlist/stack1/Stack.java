package com.linkedlist.stack1;
class Node{
	int data;
	Node next;
}
public class Stack {
	private Node top;
	
	public Stack() {
		this.top = null;
	}
	
	public void push(int data) {
		Node node = new Node();
		
		if(node == null) {
			System.out.print("\n Heap Overflow");
			return;
		}
		
		node.data = data;
		node.next = top;
		top = node;
	}
	public boolean isEmpty() {
		return top == null;
	}
	
	public int peek() {
		if(!isEmpty()) {
			return top.data;
		}else {
			System.out.println("Stack is empty");
			return -1;
		}
	}
	
	public void pop() {
		if(top == null) {
			System.out.println("Stack is empty");
			return;
		}else {
			top = top.next;
		}
	}
	public void display() {
		if(top == null) {
			System.out.println("Stack is empty");
			return;
		}else {
			Node temp = top;
			while(temp != null) {
				System.out.println("[ "+temp.data+" ]");
				temp = temp.next;
			}
		}
	}
}
