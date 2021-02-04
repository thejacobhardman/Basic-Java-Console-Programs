/*******************************************************************************
 *                      Assignment 1 – Python to Java                          *
 *                      Part 1 - Average Word Calculator                       *
 *                                                                             *
 * PROGRAMMER:        Jacob Hardman - hard7293@bears.unco.edu                  *
 * CLASS:             CS200                                                    *
 * INSTRUCTOR:        Dean Zeller                                              *
 * TERM:              Spring 2021                                              *
 * SUBMISSION DATE:   1/22/2021                                                *
 *                                                                             *
 * DESCRIPTION                                                                 *
 * This program will calculate the average length of words based on user input.*
 *                                                                             *
 * HISTORY                                                                     *
 * This program was originally written in Python by Jacob Hardman, and         *
 * submitted as Lab 1 by Jacob Hardman.                                        *
 *                                                                             *
 * COPYRIGHT                                                                   *
 * This program is copyright (c)2021 Jacob Hardman, and Dean Zeller            *
 *                                                                             *
 * ****************************************************************************/

import java.text.MessageFormat;
import java.util.Scanner;

public class Average_Word_Legnth_Calculator {
	
	static float Calculate_Average_Word_Length(String[] wordList) {
		float averageLength = 0;
		
		for (int i = 0; i < wordList.length; i++) {
			averageLength += wordList[i].length();
		}
		
		return averageLength;
	}

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		Boolean isRunning = true;
		while(isRunning) {
			System.out.println("Welcome to the average word length calculator!");
			
			System.out.println("Please enter the text that you would like to calculate the average word length for: ");
			
			String words = input.nextLine();
			
			//Got this code to strip the punctuation from the string from StackOverflow.com: https://stackoverflow.com/a/18831709
			String[] wordsList = words.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");
			
			float averageLength = Calculate_Average_Word_Length(wordsList) / wordsList.length;
			
			System.out.println(MessageFormat.format("You entered {0} words. The average length of those words is {1} letters.", wordsList.length, averageLength));
			
			Boolean userConfirm = false;
			while (!userConfirm) {
				System.out.println("Would you like to run the program again? (Y/N): ");
				String selection = input.nextLine();
				
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
