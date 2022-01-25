package com.ExceptionTests;

public class ListExceptions {
	
	public static void ListExcs() {
		
		boolean stop = false;
				
		do {
			System.out.println("\nException List");
			System.out.println("--------------");
			
			System.out.println("1. ArithmeticException\n2. NullPointerException\n"
					+ "3. ArrayIndexOutOfBoundsException\n4. StringIndexOutOfBoundsException\n"
					+ "5. IndexOutOfBoundsException\n6. NumberFormatException\n");
			
			ExceptionOptions.ExcOpts();
			
			System.out.print("\nWould you like to try again? (yes or no): ");
			String tryAgain = ExcMainTest.scan.next();
		    
		    if(tryAgain.equals("no")) {
		        stop = true;
		    }
			
		} while (!stop);
	}
}
