package edu.kis.vh.stacks;

public class Stack {
	
	private final int EMPTY_STACK_INDICATOR = -1;//final dodany wcześniej
	private final int FULL_STACK_INDICATOR = 11;//final dodany wcześniej

	private int[] ITEMS = new int[12];	

	private int total = EMPTY_STACK_INDICATOR;
	
	private StackArray stackArray;
	
	public Stack(int[] iTEMS, int total, StackArray stackArray) {
		super();
		ITEMS = iTEMS;
		this.total = total;
		this.stackArray = stackArray;
	}

	public Stack() {
		this.stackArray = new StackArray();
	}

	public int getTotal() {
		return stackArray.getTotal();
	}

	public void push(int i) {
		stackArray.push(i);
	}

	public boolean isEmpty() {
		return stackArray.isEmpty();
	}

	public boolean isFull() {
		return stackArray.isFull();
	}

	public int top() {
		return stackArray.top();
	}

	public int pop() {
		return stackArray.pop();
	}
				
}
