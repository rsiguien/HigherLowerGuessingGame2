package com.coderscampus;
import java.util.Scanner;

public class HigherLowerGuessing2 {

	public static void main(String[] args) {
		//Generate/set random number
		//Allow user to guess 5 times
		//for each guess;
		//--get user input/guess
		//--validate guess if within valid range 1-100
		//--if not valid, proceed to next loop iteration (not counted as an attempt)
		//--if guess is between valid range, check if correct or equal to the random number
		//  --if matched, show winning message
		//--else (incorrect guess),
		//		check of lower, check if higher, then show hints,
		//		increase incorrect guess counter, (proceed to next loop iteration)
		
		
		NumberChecker2 numberChecker2 = new NumberChecker2();
		Scanner scanner = new Scanner(System.in);
		int guessCounter = 0;
		int randomNumber = numberChecker2.randomizer();
		
		System.out.println("The number to guess was: " + randomNumber);
		int guess = 0;
		while (guessCounter < 5) {
			System.out.println("Pick a number between 1 and 100  ");
			guess = Integer.parseInt(scanner.nextLine());
			
			if (guess <=0 || guess > 100) { //invalid guess
				System.out.println("Your guess is not between 1 and 100. Try again...  ");
				continue; //continue/go to the next iteration of the loop
			}
		
			if (guess == randomNumber) { //correct guess
				System.out.println("You win!!!");
				break;	
			} else { //incorrect guess
			
				if (guess > randomNumber) {
					System.out.println("Please pick a lower number  ");
				} else if (guess < randomNumber) {
					System.out.println("Please pic a higher number  ");
				}
			
				guessCounter++;
			}

		}
	
		if (guess != randomNumber) {
			System.out.println("You lose!!!");
			System.out.println("The number to guess was: " + randomNumber);	
		}
		
		scanner.close();

	}
}
