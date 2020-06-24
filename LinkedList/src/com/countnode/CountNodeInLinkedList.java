package com.countnode;

public class CountNodeInLinkedList {
		static Node head;
		static int frequency = 0; 
		class Node{
			int data;
			Node next;
			public Node(int data) {
				this.data = data;
				this.next = null;
			}
		}
		
		public static void main(String[] args) {
			
			CountNodeInLinkedList list = new CountNodeInLinkedList();
			list.add(1);
			list.add(3);
			list.add(5);
			list.add(1);
			list.add(1);
			list.add(2);
			list.add(7);
			list.add(1);
			list.add(8);
			
			list.printNode();
			System.out.println();
			System.out.println("Number of count: ");
			System.out.println(list.count(1));
			
			
		}

		 int count(int data) {
			Node current = head;
			int count=0;
			while(current != null) {
				if(current.data == data)
					count++;
				current  = current.next;
			}
			return count;
		}
		private void printNode() {
			Node temp = head;
			while(temp != null) {
				System.out.print("[ "+temp.data+" ]");
				temp = temp.next;
			}
			
		}

		private void add(int data) {
			Node temp = new Node(data);
			temp.next = head;
			head = temp;
			
		}
}
