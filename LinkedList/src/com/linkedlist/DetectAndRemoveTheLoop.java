package com.linkedlist;

public class DetectAndRemoveTheLoop {
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
		DetectAndRemoveTheLoop list = new DetectAndRemoveTheLoop();
		list.head = new Node(50);
		list.head.next = new Node(20);
		list.head.next.next = new Node(15);
		list.head.next.next.next = new Node(4);
		list.head.next.next.next.next = new Node(10);
		
		 // Creating a loop for testing 
		head.next.next.next.next.next = head.next.next;
	
		 list.detectAndRemoveLoop(head); 
		 System.out.println("Linked List after removing loop : ");
		 list.printNode(head);
	}
	private int detectAndRemoveLoop(Node head) {
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast) {
				removeLoop(slow,head);
				return 1;
				
			}
			
		}
		return 0;
	}
	private void removeLoop(Node loop, Node head) {
		Node ptr1 = head;
		Node ptr2 = null;
	    /* Set a pointer to the beging of the Linked List and 
        move it one by one to find the first node which is 
        part of the Linked List */
		
		while(true) {
			 /* Now start a pointer from loop_node and check if it ever 
            reaches ptr2 */
			ptr2 = loop;
			while(ptr2.next != loop && ptr2.next != ptr1) {
				ptr2 = ptr2.next;
			}
			  /* If ptr2 reahced ptr1 then there is a loop. So break the 
            loop */
			if(ptr2.next == ptr1) {
				break;
			}
			 /* If ptr2 did't reach ptr1 then try the next node after ptr1 */
			ptr1 = ptr1.next;
		}
		 /* After the end of loop ptr2 is the last node of the loop. So 
        make next of ptr2 as NULL */
		ptr2.next = null;
	}
	private void printNode(Node head) {
		while(head != null) {
			System.out.print("[ "+head.data+" ]");
			head = head.next;
		}
		
	}
}
