package edu.kis.vh.stacks;

public class StackArray implements IStack{
	
	private final int EMPTY_STACK_INDICATOR = -1;//final dodany wcześniej
	private final int FULL_STACK_INDICATOR = 11;//final dodany wcześniej

	private int[] ITEMS = new int[12];	

	private int total = EMPTY_STACK_INDICATOR;
	
	public int getTotal() {
		return total;
	}
	
	@Override
	public void push(int i) {
		if (!isFull())
			ITEMS[++total] = i;
	}
	
	@Override
	public boolean isEmpty() {
		return total == EMPTY_STACK_INDICATOR;
	}
	
	@Override
	public boolean isFull() {
		return total == FULL_STACK_INDICATOR;
	}
	
	@Override
	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return ITEMS[total];
	}
	
	@Override
	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return ITEMS[total--];
	}
	
}
