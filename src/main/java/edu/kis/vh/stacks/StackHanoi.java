package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

public class StackHanoi extends Stack {

	private int totalRejected = 0;

	public StackHanoi() {
		super();
	}

	public StackHanoi(StackList stackList) {
		super(stackList);
	}

	public int reportRejected() {
		return totalRejected;
	}

	@Override
	public void push(int enteringValue) {
		if (!isEmpty() && enteringValue > top())
			totalRejected++;
		else
			super.push(enteringValue);
	}
}
