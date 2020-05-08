package com.linkedlist;

public class AddNodeInStart {
	
	Node head;
	class Node{
		int data;
		Node next;
		Node(int d){
			data = d;
			next = null;
		}
		
		public void displayNode(){
			System.out.print("["+ data +"]");
		}
	}
	
	public static void main(String[] args) {
		AddNodeInStart list = new AddNodeInStart();
		list.add(3);
		list.add(6);
		list.add(1);
		
	}
	public void add(int i) {
		Node last= new Node(i);
		if(head ==null){
			System.out.println("Empty List");
			
		}
		Node temp = head;
		if(temp.next != null){
			temp = temp.next;
		}
		temp.next = last.next;
	}
}
