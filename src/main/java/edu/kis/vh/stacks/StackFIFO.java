package edu.kis.vh.stacks;

import edu.kis.vh.stacks.types.StackList;

/**
 * Jest to klasa dla stosu FIFO.
 * @author Jakub
 *
 */
public class StackFIFO extends Stack {

	private Stack temp = new Stack(new StackList()); //po enkapsulacji dodanie gettera i settera po enkapsulacji
	
	public StackFIFO() {
		super();
	}

	public StackFIFO(IStack istack) {
		super(istack);
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
	
	//Lepszym wyborem wydaje mi się być StackList.
	//Wydaje się bardziej naturalnym wyborem do FIFO,
	//gdyż niepotrzebne są dodatkowe przesunięcia po ewentualnym usunięcie pierwszego elementu.
}
