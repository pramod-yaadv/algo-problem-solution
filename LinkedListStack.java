/**
 * 
 */
package com.sample;

/**
 * @author pramod
 *
 */

class ListNode {
	
	String data;
	ListNode next;
	
	public ListNode(String data) {
		super();
		this.data = data;
		this.next = null;
	}
}


public class LinkedListStack {
	
	ListNode top;
	
	public void push(String data) {
		ListNode newNode = new ListNode(data);
		
		if(top != null) {
			newNode.next = top;
		}
		top = newNode;
	}
	
	public String pop() {
		String data = null;
		if(top == null) {
			throw new RuntimeException("Stack Empty");
		}else {
			ListNode nextTop = top.next;
			data = top.data;
			top = nextTop;
		}
		return data;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListStack stack = new LinkedListStack();
		
		stack.push("B");
		stack.push("F");
		stack.push("T");
		System.out.println("Pushed B F T");
		System.out.println("Popped Data: "+stack.pop());
		stack.push("H");
		stack.push("G");
		System.out.println("Pushed H G");
		System.out.println("Popped Data: "+stack.pop());
		System.out.println("Popped Data: "+stack.pop());
		System.out.println("Popped Data: "+stack.pop());
		System.out.println("Popped Data: "+stack.pop());
		System.out.println("Popped Data: "+stack.pop()); //throw Exception
	}
	
}
