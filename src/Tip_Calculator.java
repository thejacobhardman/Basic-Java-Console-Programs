/*******************************************************************************
 *                      Assignment 1 – Python to Java                          *
 *                      Part 1 - Tip Calculator                                *
 *                                                                             *
 * PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu                  *
 * CLASS:             CS200                                                    *
 * INSTRUCTOR:        Dean Zeller                                              *
 * TERM:              Spring 2021                                              *
 * SUBMISSION DATE:   1/22/2021                                                *
 *                                                                             *
 * DESCRIPTION                                                                 *
 * This program calculates a user will tip based on their check amount and     *
 * what percentage they would like to tip.                                     *
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

public class Tip_Calculator {
	
	public static float Calculate_Tip(float moneyPaid, float tipPercent) {
		return (float) (moneyPaid * (tipPercent * 0.01));
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		boolean isRunning = true;
		while (isRunning) {
			float moneyPaid, tipPercent;
			
			System.out.println("Welcome to Tip Calculator!");
			
			System.out.print("Please enter the amount of money that you paid as a decimal: ");
			moneyPaid = input.nextFloat();
			
			System.out.print("Please enter the amount that you would like to tip as an integer: ");
			tipPercent = input.nextFloat();
			
			float tipAmount = Calculate_Tip(moneyPaid, tipPercent);
			
			tipAmount = (float) (Math.round(tipAmount * Math.pow(10, 2)) / Math.pow(10, 2));
			
			System.out.println("You've tipped $" + tipAmount + ".");
			
			boolean userConfirm = false;
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
