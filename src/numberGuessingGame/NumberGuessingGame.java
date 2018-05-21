package numberGuessingGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberGuessingGame {

	private static Scanner keyboard;

	static void search() {

		keyboard = new Scanner(System.in);
		int secretNumber;
		int guess;

		try {
			secretNumber = (int) (Math.random() * 99 + 1);
			do {
				System.out.print("Enter a guess between 1 and 100.");
				guess = keyboard.nextInt();
				if (guess >= 1 && guess <= 100) {
					if (guess == secretNumber)
						System.out.println("Your guess is correct. Congratulations!");
					else if (guess < secretNumber)
						System.out.println("Your guess is smaller than the secret number.");
					else if (guess > secretNumber)
						System.out.println("Your guess is greater than the secret number.");
				} else {
					System.out.println("Out of range.");
				}
			} while (guess != secretNumber);
		} catch (InputMismatchException e) {
			System.out.println("Invalid number.");
		}

	}
}