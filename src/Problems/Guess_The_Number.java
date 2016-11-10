/**
 * 
 */
package Problems;

import java.util.Scanner;

/**
 * The task is to write a program where the program chooses a number between 1 and 10. 
 * A player is then prompted to enter a guess. If the player guess wrong then the prompt 
 * appears again until the guess is correct. When the player has made a successful guess 
 * the computer will give a "Well guessed!" message, and the program will exit.
 * 
 * 
 * Extra Credit - Provide the user with a message after a guess telling them if their guess 
 * was higher than or lower than the target number.
 */
public class Guess_The_Number {
	
	public static void main(String args[]) {
		int rand = (int) (Math.random()*100 + 1);
		
		boolean correct = false;
		
		System.out.println("I'm thinking of a number between 1 and 100... can you guess what it is ?");
		
		Scanner scanner = new Scanner(System.in);
		
		
		while (!correct) {
			int guess = scanner.nextInt();
			if (guess < rand){
				System.out.println("Try again. The number I am thinking of is Higher");
			} else if ( guess > rand){
				System.out.println("Try again. The number I am thinking of is lower");
			} else {
				System.out.println("Well done i was thinking of "+ rand);
				correct = true;
			}
			
		}
		
		
		
		
	}
	
}
