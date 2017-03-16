package edu.kis.vh.stacks;

import edu.kis.vh.stacks.list.StackList;

public class Stack {

	private StackList stackList;
	
	public Stack(StackList stackList) {
		super();
		this.stackList = stackList;
	}

	public Stack() {
		this.stackList = new StackList();
	}

	public void push(int i) {
		stackList.pushElement(i);
	}

	public boolean isEmpty() {
		return stackList.empty();
	}

	public boolean isFull() {
		return stackList.full();
	}

	public int top() {
		return stackList.peek();
	}

	public int pop() {
		return stackList.pop();
	}
				
}
