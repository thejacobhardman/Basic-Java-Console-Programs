/*******************************************************************************
 *                      Assignment 1 – Python to Java                          *
 *                      Part 1 - Temp Converter                                *
 *                                                                             *
 * PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu                  *
 * CLASS:             CS200                                                    *
 * INSTRUCTOR:        Dean Zeller                                              *
 * TERM:              Spring 2021                                              *
 * SUBMISSION DATE:   1/22/2021                                                *
 *                                                                             *
 * DESCRIPTION                                                                 *
 * This program takes in a temperature value (either in celsius or fahrenheit) *
 * and converts it to the opposite temperature scale.                          *
 *                                                                             *
 * HISTORY                                                                     *
 * This program was originally written in Python by Jacob Hardman, and         *
 * submitted as Lab 1 by Jacob Hardman.                                        *
 *                                                                             *
 * COPYRIGHT                                                                   *
 * This program is copyright (c)2021 Jacob Hardman, and Dean Zeller            *
 *                                                                             *
 * ****************************************************************************/
import java.util.Scanner;

public class Temp_Converter {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		boolean isRunning = true;
		
		while (isRunning) {
			String conversionType = "";
			
			System.out.println("Welcome to Temperature Converter!");
			
			System.out.println("1: Celsius to Fahrenheit \n2: Fahrenheit to Celsius");
			
			System.out.print("Please select which conversion you would like to perform: ");
			
			boolean userConfirm = false;
			while (!userConfirm) {
				String selection = input.next();
				
				if (selection.equals("1")) {
					conversionType = "celsius";
					userConfirm = true;
				} else if (selection.equals("2")) {
					conversionType = "fahrenheit";
					userConfirm = true;
				} else {
					System.out.println("Please enter a valid selection.");
				}
			}
			
			System.out.print("Please enter the value of the temperature that you'd like to convert as an integer: ");
			int temp = input.nextInt();
			
			if (conversionType == "celsius") {
				int convertedTemp = ((temp * 9/5) + 32);
				System.out.println(temp + " C° is " + convertedTemp + " F°.");
			} else if (conversionType == "fahrenheit") {
				int convertedTemp = ((temp - 32) * 5/9);
				System.out.println(temp + " F° is " + convertedTemp + " C°.");
			}
			
			userConfirm = false;
			while (!userConfirm) {
				System.out.print("Would you like to run the program again? (Y/N): ");
				String selection = input.next();
				
				if (selection.toLowerCase().equals("y")) {
					userConfirm = true;
				} else if (selection.toLowerCase().equals("n")) {
					userConfirm = true;
					isRunning = false;
				} else {
					System.out.println("Please enter a valid selection.");
				}
			}
		
		}
		input.close();
	}
	
}
