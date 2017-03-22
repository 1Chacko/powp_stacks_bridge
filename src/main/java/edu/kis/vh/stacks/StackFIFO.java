package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

/**
 * Jest to klasa dla stosu FIFO.
 * @author Jakub
 *
 */
public class StackFIFO extends Stack {

	private Stack temp = new Stack(); //po enkapsulacji dodanie gettera i settera po enkapsulacji
	
	public StackFIFO() {
		super();
	}

	public StackFIFO(StackList stackList) {
		super(stackList);
	}

	/**
	 * @return tymczasowa wartość temp
	 */
	public Stack getTemp() {
		return temp;
	}

	/* (non-Javadoc)
	 * @see edu.kis.vh.stacks.Stack#pop()
	 */
	@Override
	public int pop() {
		while (!isEmpty())
			temp.push(super.pop());
		
		int topValue = temp.pop();
		
		while (!temp.isEmpty())
			push(temp.pop());
		
		return topValue;
	}
	
	
}
