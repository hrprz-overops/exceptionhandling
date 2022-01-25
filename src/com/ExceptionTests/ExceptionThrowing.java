package com.ExceptionTests;

public class ExceptionThrowing {

	public void ArithmeticEx() {
		try { throw new ArithmeticException("Cannot divide a number by 0");	}
		catch(ArithmeticException e) { System.out.println(e.getMessage()); }
	}
	
	public void NullPointerEx() {
		try { throw new NullPointerException("Cannot reference an array pointing to null");	}
		catch(NullPointerException e) {	System.out.println(e.getMessage());	}
	}
	
	public void ArrayIndexOutOfBoundsEx() {
		try { throw new ArrayIndexOutOfBoundsException("Cannot reference an index of an array that is out of bounds"); }
		catch(ArrayIndexOutOfBoundsException e) { System.out.println(e.getMessage()); }
	}
	
	public void StringIndexOutOfBoundsEx() {
		try { throw new StringIndexOutOfBoundsException("Cannot reference a character that is out of bounds"); }
		catch(StringIndexOutOfBoundsException e) { System.out.println(e.getMessage()); }
	}
	
	public void IndexOutOfBoundsEx() {
		try { throw new IndexOutOfBoundsException("Cannot reference an index that is out of bounds"); }
		catch(IndexOutOfBoundsException e) { System.out.println(e.getMessage()); }
	}
	
	public void NumberFormatEx() {
		try { throw new NumberFormatException("Cannot enter String into an int variable"); }
		catch(NumberFormatException e) { System.out.println(e.getMessage()); }
	}

}
