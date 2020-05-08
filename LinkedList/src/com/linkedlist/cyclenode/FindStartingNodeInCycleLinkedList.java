package com.linkedlist.cyclenode;

public class FindStartingNodeInCycleLinkedList {
	 static Node head;
	static class Node{
		int data;
		Node next;
		
		public Node(int d){
			next = null;
			this.data =d;
		}
	}
	
	public static void main(String[] args) {
		FindStartingNodeInCycleLinkedList llist = new FindStartingNodeInCycleLinkedList();
		 
		  
	        llist.push(20); 
	        llist.push(4); 
	        llist.push(15); 
	        llist.push(10);
	      // llist.push(21);
	  
	        /*Create loop for testing */
	        llist.head.next.next.next.next = llist.head; 
	  
	        System.out.println(llist.detectLoop());
  
	        llist.loopstartpoint();
    
	}
	public static int detectLoop() {
		Node slow = head;
		Node fast = head;
		while(slow != null && fast!= null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast){
				System.out.println("Loop Found!");
				return countNodes(slow);
			}
		}
		return 0;
	}

	public static int countNodes(Node slow) {
			Node temp = slow;
			int count=1;
			while(temp.next != slow) {
				count++;
				temp = temp.next;
			}
			return count;
			
		}

	public void loopstartpoint() {
		 Node slow = head.next;;
		 Node fast = head.next.next;
		while(slow!= null && fast!= null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				System.out.println("Loop Detected stated from");
				break;
			}
		}
		slow = head;
		while(slow != fast) {
			slow = slow.next;
			//fast = fast.next; 
		}
		System.out.println("Starting position of loop is1 "+slow.data);
	}

	
	

	public static Node push(int new_data) {
		
		Node new_node= new Node(new_data);
		new_node.next = head;
		return head = new_node;
	}
}