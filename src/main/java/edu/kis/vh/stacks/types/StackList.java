package edu.kis.vh.stacks.types;

import edu.kis.vh.stacks.IStack;

public class StackList implements IStack {
	
	//Przydatny w punkcie 3.1.4 jest refactor -> rename
	
	private Node lastNode; //po enkapsulacji modyfikator zmienił się na prywatny i dodano getter i setter
	private static final int EMPTY_STACK_INDICATOR = -1; //final dodany wcześniej

	public void push(int nodeNumber) {
		if (lastNode == null)
			lastNode = new Node(nodeNumber);
		else {
			lastNode.setNextValue(new Node(nodeNumber)); //automatycznie zmienione po enkapsulacji atrybutów z klasy Node
			lastNode.getNextValue().setPreviousValue(lastNode); //automatycznie zmienione po enkapsulacji atrybutów z klasy Node
			lastNode = lastNode.getNextValue();
		}
	}

	public boolean isEmpty() {
		return lastNode == null;
	}

	public boolean isFull() {
		return false;
	}

	public int top() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		return lastNode.getValue();
	}

	public int pop() {
		if (isEmpty())
			return EMPTY_STACK_INDICATOR;
		int topValue = lastNode.getValue();
		lastNode = lastNode.getPreviousValue();
		return topValue;
	}

	Node getLastNode() {
		return lastNode;
	}

	void setLastNode(Node lastNode) {
		this.lastNode = lastNode;
	}

}

class Node {

	private int value;
	private Node previousValue;
	private Node nextValue;
	//po enkapsulacji modyfikatory wszystkich 3 atrybutów zmieniły się na private i dodane zostały ich gettery i settery

	public Node(int i) {
		value = i;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public Node getPreviousValue() {
		return previousValue;
	}

	public void setPreviousValue(Node previousValue) {
		this.previousValue = previousValue;
	}

	public Node getNextValue() {
		return nextValue;
	}

	public void setNextValue(Node nextValue) {
		this.nextValue = nextValue;
	}
	
}
