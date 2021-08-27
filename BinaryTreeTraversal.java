/**
 * 
 */
package com.sample;

import java.util.Stack;

/**
 * @author pramod
 *
 */

class Node {
	
	String key;
	Node left;
	Node right;
	
	public Node(String key) {
		this.key = key;
		this.left = this.right = null;
	}
	
}

public class BinaryTreeTraversal {
	
	public BinaryTreeTraversal() {
		super();
	}
	
	private void traverseInorderRecursion(Node node) {
		// Left Root Right
		
		if(node == null) {
			return;	
		}

		traverseInorderRecursion(node.left);
		System.out.print(node.key + "  ");	
		traverseInorderRecursion(node.right);	
	}
	
	private void traversePreorderRecursion(Node node) {
		// Root Left Right
		
		if(node == null) {
			return;	
		}
		System.out.print(node.key + "  ");
		traverseInorderRecursion(node.left);
		traverseInorderRecursion(node.right);	
	}
	
	private void traversePostorderRecursion(Node node) {
		//Left Right Root
		
		if(node == null) {
			return;	
		}
		traverseInorderRecursion(node.left);
		traverseInorderRecursion(node.right);
		System.out.print(node.key + "  ");
	}
	
	public void traverseInOrder(Node root) {
		
		if(root == null) {
			return ;
		}
		
		Node curr = root;
		Stack<Node> stack = new Stack<>(); 
		
		while(curr != null || stack.size() > 0) {
			
			while (curr != null) {
				stack.push(curr);
				curr = curr.left;
			}
			
			curr = stack.pop();
			System.out.print(curr.key+" ");
			
			curr = curr.right;
		}
	}
	
	private void traversePreOrder(Node node) {
		
		
	}
	
	private void traversePostOrder(Node node) {
		
		
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root  = prepareSampleBinaryTree();
		BinaryTreeTraversal tree = new BinaryTreeTraversal();
		
		System.out.print("\n Traverse Inorder: ");
		tree.traverseInorderRecursion(root);
		
		System.out.print("\n Traverse Inorder (Without Recursion): ");
		tree.traverseInOrder(root);
		
		System.out.print("\n Traverse Preorder: ");
		tree.traversePreorderRecursion(root);
		
		System.out.print("\n Traverse Postorder: ");
		tree.traversePostorderRecursion(root);
		
		
		
	}
	
	private static Node prepareSampleBinaryTree() {
		Node root = new Node("M");
		
		root.left = new Node("A");
		root.right = new Node("E");
		
		//A Node
		root.left.left = new Node("F");
		root.left.right = new Node("I");
		
		//E Node
		root.right.left = new Node("O");
		root.right.right = new Node("N");
		
		//F Node
		root.left.left.left = new Node("L");
		root.left.left.right = new Node("G");
		
		return root;
	}
	
}
