package com.linkedlist.cyclenode;

public class CycleLinkedListLengthOfNodes {
	static Node head;
	class Node{
		int data;
		Node next;
		
		public Node(int d){
			next = null;
			this.data =d;
		}
	}
	
	public static void main(String[] args) {
		CycleLinkedListLengthOfNodes llist = new CycleLinkedListLengthOfNodes();
		llist.push(20); 
        llist.push(4); 
        llist.push(15); 
        llist.push(10); 
  
        /*Create loop for testing */
        llist.head.next.next.next.next = llist.head; 
  
        llist.detectLoop(); 
        
        
        System.out.println(llist.detectLoop());
    
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

	public void push(int new_data) {
		
		Node new_node= new Node(new_data);
		new_node.next = head;
		head = new_node;
	}
}
