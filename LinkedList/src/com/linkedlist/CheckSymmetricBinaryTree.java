package com.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

import javax.management.Query;

public class CheckSymmetricBinaryTree {
	private static Node head;
	static class Node{
		private int data;
		private Node left;
		private Node right;
		
		public Node(int data) {
			this.data = data;
		}

		public int getData() {
			return data;
		}

		public void setData(int data) {
			this.data = data;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}
		
	}
	public static void main(String[] args) {
		addNodeInBinaryTree(head,50);
		addNodeInBinaryTree(head,20);
		addNodeInBinaryTree(head,20);
		addNodeInBinaryTree(head,10);
		addNodeInBinaryTree(head,30);
		addNodeInBinaryTree(head,30);
		addNodeInBinaryTree(head,10);
			
		printTreeLevelOrder(head);
		if(head != null) {
			System.out.println(isSymmetric(head.getLeft(),head.getRight()));
		}
		
		
	}
	public static boolean isSymmetric(Node left, Node right) {
		if(left == null && right == null) {
			return true;
		}
		if(left == null || right == null) {
			return false;
		}
		if(left.getData() != right.getData()) {
			return false;
		}
		
		boolean leftCheck = isSymmetric(left.getLeft(), right.getRight());
		boolean rightCheck = isSymmetric(left.getLeft(), right.getRight());
		
		if(leftCheck && rightCheck) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void printTreeLevelOrder(Node head) {
		if(head == null) {
			return;
		}
		Queue<Node> q = new LinkedList<Node>();
		q.add(head);
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			System.out.println(node.getData()+" ");
			if(node.getLeft() != null) {
				q.add(node.getLeft());
			}
			if(node.getRight()!= null) {
				q.add(node.getRight());
			}
		}
		
	}
	public static void addNodeInBinaryTree(Node root, int data) {
		if(root == null) {
			root = new Node(data);
		}else {
			Queue<Node> q = new LinkedList<Node>();
			q.add(root);
			while(!q.isEmpty()) {
				Node node = q.poll();
				if(node.left != null && node.right!=null) {
					q.add(node.getLeft());
					q.add(node.getRight());
				}else {
					if(node.getLeft() == null) {
						node.setLeft(new Node(data));
					}else {
						node.setRight(new Node(data));
					}
					break;
				}
			}
		}
		
	}
}
