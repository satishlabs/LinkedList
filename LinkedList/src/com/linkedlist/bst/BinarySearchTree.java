package com.linkedlist.bst;

public class BinarySearchTree {
	class Node{
		int data;
		Node left,right;

		public Node(int item) {
			this.data = item;
			left = right =null;
		}
	}

	//Root of BST
	Node root;

	public BinarySearchTree() {
		root = null;
	}
	// This method mainly calls insertRec() 
	void insert(int key) {
		root = insertRec(root,key);
	}
	public Node insertRec(Node root, int key) {
		
		 /* If the tree is empty, return a new node */
		if(root == null) {
			root = new Node(key);
			return root;
		}
		 /* Otherwise, recur down the tree */
		if(key<root.data) {
			root.left = insertRec(root.left, key);
		}else if(key>root.data) {
			root.right = insertRec(root.right, key);
		}
		return root;
	}
	
	// This method mainly calls InorderRec() 
	void inorder() {
		inorderRec(root);
	}
	public void inorderRec(Node root) {
		if(root != null) {
			inorderRec(root.left);
			System.out.println(root.data);
			inorderRec(root.right);
		}
		
	}
	public static void main(String[] args) {
		BinarySearchTree bst = new BinarySearchTree();
		bst.insert(50);
		bst.insert(30);
		bst.insert(20);
		bst.insert(40);
		bst.insert(70);
		bst.insert(60);
		bst.insert(80);
		
		bst.inorder();
	}
}
