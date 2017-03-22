package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {

	private IStack intStack;
	
	public Stack(StackList stackList) {
		super();
		this.intStack = stackList;
	}

	public Stack() {
		this.intStack = new StackList();
	}

	public void push(int i) {
		intStack.push(i);
	}

	public boolean isEmpty() {
		return intStack.isEmpty();
	}

	public boolean isFull() {
		return intStack.isFull();
	}

	public int top() {
		return intStack.top();
	}

	public int pop() {
		return intStack.pop();
	}
				
}
