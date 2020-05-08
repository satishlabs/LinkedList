package com.linkedlist;

import java.util.HashSet;

public class DeleteAllOccurrencesNode {
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
		DeleteAllOccurrencesNode list = new DeleteAllOccurrencesNode();
		list.push(10);
		list.push(21);
		list.push(10);
		list.push(35);
		list.push(15);
		list.push(21);
		list.push(35);
		
		list.printNode();
		
		//list.remove_duplicates();
		list.remove_duplicates_WithHashSet();
		System.out.println();
		System.out.println("========After deleted all Occurrences=========");
		list.printNode();
		
	}
	private void remove_duplicates_WithHashSet() {
		HashSet<Integer> hs = new HashSet<>();
		Node current = head;
		Node prev= null;
		while(current != null) {
			int curVal = current.data;
			if(hs.contains(curVal)) {
				prev.next = current.next;
			}else {
				hs.add(curVal);
				prev = current;
			}
			current = current.next;
		}
		
	}
	private void remove_duplicates() {
		Node ptr1 = head;
		Node ptr2 = null;
		Node dup;
		
		while(ptr1 != null && ptr1.next != null) {
			ptr2 = ptr1;
			
			while(ptr2.next != null) {
				if(ptr1.data == ptr2.next.data) {
					dup = ptr2.next;
					ptr2.next = ptr2.next.next;
					System.gc();
				}else {
					ptr2 = ptr2.next;
				}
			}
			
			ptr1 = ptr1.next;
		}
		
	}
	private void printNode() {
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
