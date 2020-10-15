package com.capg.JUnit.linkedList.LinkedListProblem;

import org.junit.Test;

import org.junit.Assert;


public class MyStackTest 
{
    @Test
    public void givenThreeNumbers_whenAddedToStack_shouldHaveLastAddedNode() {
    	MyNode<Integer> myFirstNode = new MyNode(70);
		MyNode<Integer> mySecondNode = new MyNode(30);
		MyNode<Integer> myThirdNode = new MyNode(56);
		
		MyStack myStack = new MyStack();
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		myStack.printStack();
		myStack.peak();
		INode peak = myStack.peak();
		
		Assert.assertEquals(myThirdNode, peak);
    }
}
