package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

public class Stack {

	private IStack intStack;
	
	public Stack(IStack istack) {
		super();
		this.intStack = istack;
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
	
	//Navigate -> Open Declaration (F3) uzyte na wywolaniu metody przeskakuje do deklaracji tej metody
	
	//Mozemy wyslac do konstruktora klase implementujaca  interfejs IStack
	//dzięki czemu możemy okreslic sposob implementacji stosu
	
	//Używając klawisza (F3) przeskakujemy do deklaracji metody w iterfejsie IStack
	//Używając kombinacji (ctrl + t) wyświetla się okno z interfejsem implementującym daną metodę
	//i klasy tą metodę implementujące
	//Natomiast korzystając z (ctrl + kursor) otwiera sie małe menu z wyborem do przejścia
	//w miejsce deklaracji lub implementacji danej metody
}
