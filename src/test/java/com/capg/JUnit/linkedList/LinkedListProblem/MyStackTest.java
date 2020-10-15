package com.capg.JUnit.linkedList.LinkedListProblem;

import org.junit.Test;
import java.util.*;

import org.junit.Assert;

public class MyStackTest {
	@Test
	public void givenThreeNumbers_whenAddedToStack_shouldHaveLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);

		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		INode peak = myStack.peak();
		myStack.printStack();

		Assert.assertEquals(myThirdNode, peak);
	}

	@Test
	public void givenThreeNumbersInStack_whenPopped_shouldMatchWithLastAddedNode() {
		MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);

		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);

		boolean check = false;
		while (myStack.size() > 0) {
			INode pop = myStack.pop();
			check = myStack.empty();
		}
		Assert.assertEquals(true, check);
	}
}
