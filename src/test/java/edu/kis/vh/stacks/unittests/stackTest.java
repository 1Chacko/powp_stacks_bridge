package edu.kis.vh.stacks.unittests;

import org.junit.Assert;
import org.junit.Test;

import edu.kis.vh.stacks.IStack;
import edu.kis.vh.stacks.Stack;
import edu.kis.vh.stacks.StackHanoi;
import edu.kis.vh.stacks.factory.DefaultStacksFactory;
import edu.kis.vh.stacks.types.StackArray;
import edu.kis.vh.stacks.types.StackList;

public class stackTest {
	
	@Test
	public void testPush() {
		Stack stackObj = new Stack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testIsEmpty() {
		Stack stackObj = new Stack();
		boolean result = stackObj.isEmpty();		
		Assert.assertEquals(true, result);
		
		stackObj.push(888);
		
		result = stackObj.isEmpty();
		Assert.assertEquals(false, result);
	}

	@Test
	public void testIsFullListStack() {
		Stack stackObj = new Stack();
		for (int i = 0; i < StackList.FULL_STACK_INDICATOR; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
		
		//Aby dany test przeszedł pozytywnie dodałem ograniczenie wielkości stosu klasy StackList 
		//poprzez stworzenie atrybutu FULL_STACK_INDICATOR, a następnie przeniosłem go do interfejsu IStack,
		//gdyż korzysta z niego StackArray.
		//Przy tworzeniu obiektu klasy Stack przez konstruktor bezparametrowy korzystamy z klasy StackList, stąd taki pomysł.
	}
	
	@Test
	public void testIsFullArrayStack() {
		
		//Jeśli nie można ustawić z góry wielkości StackList dodaje drugi test,
		//gdzie używam obiektu Stack opartego na StackArray.
		//W tym przypadku zwiększyłem tablicę ITEMS w klasie StackArray na 13.
		//Wydaje się to być naturalne, skoro w punkcie 3.1.11 ustawiliśmy
		//wartość wskaznika pustego stosu z -1 na 0.
		
		Stack stackObj = new Stack(new StackArray());
		for (int i = 0; i < StackArray.FULL_STACK_INDICATOR; i++) {
			boolean result = stackObj.isFull();		
			Assert.assertEquals(false, result);
			stackObj.push(888);
		}
		
		boolean result = stackObj.isFull();
		Assert.assertEquals(true, result);
		
	}

	@Test
	public void testTop() {
		Stack stackObj = new Stack();
		
		int result = stackObj.top();
		Assert.assertEquals(IStack.EMPTY_STACK_INDICATOR, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
		result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}

	@Test
	public void testPop() {
		Stack stackObj = new Stack();
		
		int result = stackObj.pop();
		Assert.assertEquals(IStack.EMPTY_STACK_INDICATOR, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(IStack.EMPTY_STACK_INDICATOR, result);
	}

	@Test
	public void testFIFOPop() {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack stackObj = factory.getFIFOStack();
		
		int result = stackObj.pop();
		Assert.assertEquals(IStack.EMPTY_STACK_INDICATOR, result);
		
		int testValue = 4;
		stackObj.push(testValue);
		
		result = stackObj.pop();
		Assert.assertEquals(testValue, result);
		result = stackObj.pop();
		Assert.assertEquals(IStack.EMPTY_STACK_INDICATOR, result);
	}
	
	@Test
	public void testHanoiPush() {
		DefaultStacksFactory factory = new DefaultStacksFactory();
		Stack stackObj = factory.getHanoiStack();
		int testValue = 4;
		stackObj.push(testValue);
		
		int result = stackObj.top();
		Assert.assertEquals(testValue, result);
	}
	
	@Test
	public void testReportRejected() {
		StackHanoi stackObj = new StackHanoi();
		final int REPORTED_REJECTED = 2;
		
		int testValue1 = 1;
		stackObj.push(testValue1);
		int testValue2 = 2;
		stackObj.push(testValue2);
		int testValue3 = 3;
		stackObj.push(testValue3);
		
		int result = stackObj.reportRejected();
		Assert.assertEquals(REPORTED_REJECTED, result);
	}
}
