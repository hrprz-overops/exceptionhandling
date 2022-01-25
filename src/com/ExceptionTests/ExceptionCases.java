package com.ExceptionTests;

public class ExceptionCases {
	
	public static void ExcCases(int numberOfTimes, int exceptionOption, ExceptionThrowing ExceptThrown) {
		
		for(int x = 1; x <= numberOfTimes; x++)
		{
			System.out.print("===> " + x + ". ");
			switch (exceptionOption) {
			case 1:
				ExceptThrown.ArithmeticEx();
				break;
			case 2:
				ExceptThrown.NullPointerEx();
				break;
			case 3:
				ExceptThrown.ArrayIndexOutOfBoundsEx();
				break;
			case 4:
				ExceptThrown.StringIndexOutOfBoundsEx();
				break;
			case 5:
				ExceptThrown.IndexOutOfBoundsEx();
				break;
			case 6:
				ExceptThrown.NumberFormatEx();
				break;
			default:
				System.out.println("Great success!  No exceptions are thrown!");
				break;
			}
			
	        try{
	            Thread.sleep(1000);
	        } catch(InterruptedException e){
	            e.printStackTrace();
	            System.out.println("Could not set timer properly!");
	        }
	        
		}
		
	}

}
