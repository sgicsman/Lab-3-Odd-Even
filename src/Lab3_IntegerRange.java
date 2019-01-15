import java.util.Scanner;

public class Lab3_IntegerRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scnr = new Scanner(System.in);
		
		String userName;
		int userInput;
		
		System.out.println("Welcome to Integers on the Range! Please type your name and click enter.");
		userName = scnr.nextLine();
		
		System.out.println("Thank you, " + userName + ". This program will give you some feedback after you enter an integer (no decimals) between 1 and 100. Please enter a number now.");
		userInput = scnr.nextInt();
		
		while (userInput < 1 || userInput >100) {
			System.out.println("I'm sorry, " + userName + ", the number you've entered is invalid. Please enter a number (no decimals) between 1 and 100.");
			userInput = scnr.nextInt();	
		}
		
		if (userInput %2 != 0) {
			if (userInput > 60) {
				System.out.println(userName + ", " + userInput + " is an odd number greater than 60.");
			} else 
				System.out.println(userName + ", " + userInput + " is an odd number. (Not that there's anything wrong with it...)");
			
		
		} else 
			if (userInput > 0 && userInput < 26) {
				System.out.println(userName + ", " + userInput + " is an even number less than 25.");
			} else if (userInput >25 && userInput < 61) {
				System.out.println(userName + ", " + userInput + " is an even number.");
			} else 
				System.out.println(userName + ", " + userInput + " is an even number, greater than 60.");
		
		
		//System.out.println(userInput);
		
	}

}
