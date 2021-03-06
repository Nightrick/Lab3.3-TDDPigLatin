import java.util.InputMismatchException;
import java.util.Scanner;

public class PigLatinPrompt {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String userContinues ="y";

		System.out.print("Hello there. ");
		
		do {
		System.out.print("Please enter a word or sentence you would like translated into Pig Latin: ");
		String stringToTranslate = scnr.nextLine().toLowerCase();
		System.out.println("You entered: " + stringToTranslate);
		
		System.out.println("Your string in Pig Latin is: " + PigLatin.translate(stringToTranslate));
	
		System.out.print("Would you like to translate another string? (y/n): ");
		userContinues = scnr.next().toLowerCase();
		scnr.nextLine();

		} while(userContinues.equals("y"));
		
		System.out.println("Thank you! Enjoyway ouryay ayday!");
		
		scnr.close();
	}

}
