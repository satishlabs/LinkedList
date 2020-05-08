package com.linkedlist;

public class NthFromLast {
		static Node head;
		static class Node{
			int data;
			Node next;
			
			public Node(int data) {
				this.data = data;
				next = null;
			}
		}
		public static void main(String[] args) {
			NthFromLast list = new NthFromLast();
			list.push(20);
			list.push(4);
			list.push(15);
			list.push(35);
			
			list.display();
			System.out.println();
			System.out.println("Nth Node from Last: ");
			list.NthNodeFromLast(3);
			
			System.out.printf("Element at index 3 is %d",  
                    GetNth(head, 3));  
		}
		public static int GetNth(Node head, int n) {
			int count=1;
			if(count == n) {
				return head.data;
			}
			else {
			return GetNth(head.next,n-1);
			}
		}
		public void NthNodeFromLast(int n) {
			int len=0;
			Node temp = head;
			
			 // 1) count the number of nodes in Linked List 
			while(temp != null) {
				temp = temp.next;
				len++;
			}
			// check if value of n is not more than length of 
	        // the linked list 
			if(len<n) {
				return;
			}
			temp = head;

	        // 2) get the (len-n+1)th node from the beginning 
			for(int i=1;i<(len-n+1);i++) {
				temp = temp.next;
				System.out.println(temp.data);
			}
			
		}
		public void display() {
			Node temp = head;
			while(temp != null) {
				System.out.print("[ "+temp.data+" ]");
				temp = temp.next;
			}
			
		}
		public void push(int new_data) {
			Node new_node = new Node(new_data);
			new_node.next = head;
			head = new_node;
			
		}
}
