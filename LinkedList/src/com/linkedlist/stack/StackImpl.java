package com.linkedlist.stack;

public class StackImpl {
	public static void main(String[] args) {
		StackUsingLinkedlist obj = new StackUsingLinkedlist();
		obj.push(11);
		obj.push(22);
		obj.push(33);
		obj.push(44);
		
		obj.display();
		
		// pritn Top element of Stack 
        System.out.printf("\nTop element is %d\n", obj.peek());
        
        
        // Delete top element of Stack 
        obj.pop(); 
        obj.pop(); 
        
     // pritn Stack elements 
        obj.display();
        
        // print Top element of Stack 
        System.out.printf("\nTop element is %d\n", obj.peek());
	}
}
