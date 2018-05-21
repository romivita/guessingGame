package numberGuessingGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReverseGuessingGame {

	private static Scanner keyboard;

	static void reverse() {

		keyboard = new Scanner(System.in);
		int secretNumber;
		int computerGuess = 0;
		int min = 1;
		int max = 101;

		try {
			System.out.print("Enter a number between 1 and 100.");
			secretNumber = keyboard.nextInt();

			if (secretNumber >= 1 && secretNumber <= 100) {
				computerGuess = (max + min) / 2;
				while (secretNumber != computerGuess) {
					if (computerGuess < secretNumber) {
						min = computerGuess;
						computerGuess = (max + min) / 2;
					} else {
						max = computerGuess;
						computerGuess = (max + min) / 2;
					}
					System.out.println(computerGuess);
				}
				System.out.println("Computer guessed the number: " + computerGuess);
			} else {
				System.out.println("Out of range.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid number.");
		}
	}
}
