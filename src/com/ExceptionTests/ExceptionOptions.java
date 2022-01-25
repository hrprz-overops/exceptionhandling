package com.ExceptionTests;

public class ExceptionOptions {
	
	public static void ExcOpts() {
		
		ExceptionThrowing ExcThrow = new ExceptionThrowing();
			
		boolean boolOption = true;
		boolean boolNumOfTimes = true;
		
		int excOption = 0;
		int numOfTimes = 0;
		

		do {
			
			try{
				
				System.out.print("Enter the number to choose your exception option: ");
				excOption = ExcMainTest.scan.nextInt();
				System.out.println("\n" + "You entered option " + excOption + " as your exception to throw.\n");
				
				do {
					
					try{
						
						System.out.print("How many times do you want to throw the exception: ");
						numOfTimes = ExcMainTest.scan.nextInt();
						System.out.println("\n" + "You want to throw your exception " + numOfTimes + " times.\n");
									
						boolNumOfTimes = false;
						// scanNumOfTimes.close();
						
					} catch(Exception e){
						// e.printStackTrace();
						System.out.println("An invalid number was entered.  Please try again.\n");
					}
					
				} while (boolNumOfTimes);
								
				ExceptionCases.ExcCases(numOfTimes, excOption, ExcThrow);
				
				boolOption = false;
				// scanOption.close();
				
			} catch(Exception e){
				// e.printStackTrace();
				System.out.println("An invalid number was entered.  Please try again.\n");
			}
			
		} while (boolOption);
		
	}
	
}