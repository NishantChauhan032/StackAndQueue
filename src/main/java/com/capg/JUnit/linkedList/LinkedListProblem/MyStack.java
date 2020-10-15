package com.capg.JUnit.linkedList.LinkedListProblem;

public class MyStack {
	private final MyLinkedList myLinkedList;

	public MyStack() {

		this.myLinkedList = new MyLinkedList();
	}

	public void push(INode myNode) {
		myLinkedList.add(myNode);
	}

	public void printStack() {
		myLinkedList.printMyNodes();
		
	}

	public INode peak() {
		return myLinkedList.head;
		
	}

	public INode pop() {
		return myLinkedList.pop();
	}

	public int size() {
		return myLinkedList.sizeOfList();
		
	}

	public boolean empty() {
		return myLinkedList.isEmpty();
	}
}
