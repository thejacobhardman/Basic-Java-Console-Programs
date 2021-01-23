/*******************************************************************************
 *                      Assignment 1 – Python to Java                          *
 *                      Part 1 - Number Guesser                                *
 *                                                                             *
 * PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu                  *
 * CLASS:             CS200                                                    *
 * INSTRUCTOR:        Dean Zeller                                              *
 * TERM:              Spring 2021                                              *
 * SUBMISSION DATE:   1/22/2021                                                *
 *                                                                             *
 * DESCRIPTION                                                                 *
 * This program prompts the user to guess a number between 1 and 10.           *
 * It also gives the user a hint based on their guess.                         *
 *                                                                             *
 * HISTORY                                                                     *
 * This program was originally written in Python by Jacob Hardman, and         *
 * submitted as Lab 1 by Jacob Hardman.                                        *
 *                                                                             *
 * COPYRIGHT                                                                   *
 * This program is copyright (c)2021 Jacob Hardman, and Dean Zeller            *
 *                                                                             *
 * ****************************************************************************/
import java.util.Random;
import java.util.Scanner;

public class Number_Guesser {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner input = new Scanner(System.in);
		
		boolean isRunning = true;		
		while (isRunning) {
			int num = random.nextInt(10) + 1;
			System.out.println("I'm thinking of a number between 1-10. Can you guess it?");
			
			boolean isNumGuessed = false;
			while(!isNumGuessed) {
				System.out.print("Guess the number: ");
				int guess = input.nextInt();
				
				if (guess == num) {
					System.out.println("Correct!");
					isNumGuessed = true;
				} else if (guess < num) {
					System.out.println("Wrong! The correct number is higher than " + guess + ".");
				} else if (guess > num) {
					System.out.println("Wrong! The correct number is lower than " + guess + ".");
				}
			}
			
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
