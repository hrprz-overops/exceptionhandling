package com.ExceptionTests;

import java.util.Scanner;

public class ExcMainTest {
	
	public static final Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("\nWelcome!  Please choose an option down below to throw an exception.");
		
		ListExceptions.ListExcs();
		
		System.out.println("\nThanks for playing!");
		
		scan.close();
	}

}