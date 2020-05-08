package com.linkedlist.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
	public static void main(String[] args) {
		Queue<Integer> q = new LinkedList<Integer>();
		for(int i=0;i<5;i++) {
			q.add(i);
		}
		
		System.out.println("Elements of Queue: "+q);
		
		int removedelete = q.remove();
		System.out.println("Removed element: "+removedelete);
		System.out.println("Elements of Queue: "+q);
		
		int head = q.peek();
		System.out.println("Peek: "+head);
		
		int size = q.size();
		System.out.println("Size: "+size);
	}
}
