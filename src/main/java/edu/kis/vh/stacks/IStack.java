package edu.kis.vh.stacks;

public interface IStack {

	public final int EMPTY_STACK_INDICATOR = 0;//final dodany wcześniej
	public final int FULL_STACK_INDICATOR = 12;

	void push(int i);

	boolean isEmpty();

	boolean isFull();

	int top();

	int pop();
	
	//Pomogła mi w tym realizacja zadania 10,
	//ponieważ musiałem zmienić wartośc z -1 na 0 jedynie w jednym miejscu, a nie szukać tej wartośći po kilku klasach. 
}