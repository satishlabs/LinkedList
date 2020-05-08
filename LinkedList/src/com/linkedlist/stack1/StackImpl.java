package com.linkedlist.stack1;

public class StackImpl {
	public static void main(String[] args) {
		Stack obj = new Stack();
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
		
		obj.display();
		
		System.out.println("Peek: "+obj.peek());
		
		obj.pop();
		System.out.println("Peek: "+obj.peek());
		
		obj.pop();
		System.out.println("Peek: "+obj.peek());
		obj.display();
		
	}
}
