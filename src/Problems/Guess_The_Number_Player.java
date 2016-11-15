package Problems;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Guess_The_Number_Player {

	
	
	public static void main(String[] args) {
		/*
		 * This time its the computers turn to guess your number between 0 and 100!!!
		 */
		 int LOWER = 0, UPPER = 100;

	    final Scanner in= new Scanner(System.in); // we need input from the user. 
		
		boolean correct = false; // Initialise the correctness of the guess. 
		
			System.out.printf("Instructions:\n" +
					  "Think of integer number from %d (inclusive) to %d (exclusive) and\n" +
					  "I will guess it. After each guess, you respond with L, H, or C depending\n" +
					  "on if my guess was too low, too high, or correct.\n\n",
					  LOWER, UPPER);
			
			
			while (!correct) {
				System.out.printf("My guess is: %d. Is it too high, too low, or correct? (H/L/C) ", ((UPPER+LOWER)/2));
				String s = in.nextLine();
				switch (Character.toLowerCase(s.charAt(0))) {
				case 'l':
					LOWER = ((UPPER+LOWER)/2);
					break ;
				case 'h':
					UPPER = ((UPPER+LOWER)/2);
					break ;
				case 'c':
					correct = true;
					System.out.printf("Your number is %d.\n", ((UPPER+LOWER)/2));
					return ;
				}
			}
			in.close();
	}
		


}
