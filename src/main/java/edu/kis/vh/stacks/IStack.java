package edu.kis.vh.stacks;

public interface IStack {

	public final int EMPTY_STACK_INDICATOR = -1;//final dodany wcześniej

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();

}