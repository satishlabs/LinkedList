package com.linkedlist;

import java.util.Stack;

public class LiknkedListIsPalindrome {
	static Node head;	

	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
		}
	}
	public static void main(String[] args) {
		LiknkedListIsPalindrome list = new LiknkedListIsPalindrome();
		list.push(1);
		list.push(2);
		list.push(2);
		list.push(1);

		list.printNode(head);
		System.out.println("");
		//boolean condition = list.isPalindrome(head); 
		//System.out.println("isPalidrome :" + condition); 
		 boolean result = list.isPalindromeUsingStack(list.head);
		System.out.println("Result using Stack :" + result);

	}
	 private boolean isPalindromeUsingStack(Node head) {
	        Stack<Integer> stack = new Stack<>();
	 
	        Node temp = head;
	        while(temp != null) {
	            stack.add(temp.data);
	            temp = temp.next;
	        }
	 
	        while(head != null) {
	            if (stack.pop() != head.data) {
	                return false;
	            }
	            head = head.next;
	        }
	        return true;
	    }
	
	public boolean isPalindrome(Node head) {
		Node slow = head;
		boolean isPlain = true;
		Stack<Integer> stack = new Stack<Integer>();

		while(slow != null) {
			stack.push(slow.data);
			slow = slow.next;
		}
		while(head != null) {
			int i = stack.pop();
			if(head.data == i) {
				isPlain = true;
			}else {
				isPlain = false;
				break;
			}
			head = head.next;
		}
		return isPlain;
	}

	private void printNode(Node head) {
		Node temp = head;
		while(temp != null) {
			System.out.print("[ "+temp.data+" ]");
			temp = temp.next;
		}

	}
	private void push(int data) {
		Node temp = new Node(data);
		temp.next = head;
		head = temp;
	}
}
