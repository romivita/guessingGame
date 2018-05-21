package numberGuessingGame;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Game {

	private static Scanner keyboard;

	public static void main(String[] args) {

		keyboard = new Scanner(System.in);
		int option;
		String newLine = System.getProperty("line.separator");
		System.out.println("Who has to guess the number? Enter an option's number:" + newLine 
				+ "1- The player has to guess it" + newLine
				+ "2- The computer has to guess it");
		try {
			option = keyboard.nextInt();
			switch (option) {
			case 1:
				NumberGuessingGame.search();
				break;
			case 2:
				ReverseGuessingGame.reverse();
				break;
			default:
				System.out.println("Invalid option.");
			}
		} catch (InputMismatchException ime) {
			System.out.println("Invalid option.");
		}
	}
}
