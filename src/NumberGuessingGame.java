import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		//Declaring variables
		String usersInput;
		String yesOrNo;
		int generatedNumber;
		int numberGuessing;
		int keepOrChange;

		//Initializing Variables
		Scanner keyboard = new Scanner(System.in);

		//Generating random number
		generatedNumber = (int) (Math.random() * 100);

		//Prints out generated number 
		System.out.println(generatedNumber);
		//Temporary until project is fully tested and complete

		//Grabbing users input
		System.out.println("Lets play a guessing game! The rules are that I will pick a number between 0 and 100. Also," +
				"I will tell you \nif you are too hig or too low. However... you only have 5 total attempts!");
		System.out.print("\nNow pick a number between 0-100\n");
		usersInput = keyboard.nextLine();
		numberGuessing = Integer.parseInt(usersInput);
		if(numberGuessing < 0){
			System.out.println("Invalid! Please pick a number between 0-100");
			usersInput = keyboard.nextLine();
			numberGuessing = Integer.parseInt(usersInput);
		}
		if(numberGuessing > 100){
			System.out.println("Invalid! Please pick a number between 0-100");
			usersInput = keyboard.nextLine();
			numberGuessing = Integer.parseInt(usersInput);
		}
		System.out.println("Ok you have chosen the number "+usersInput+". Are you sure this is the number you want?"+
				"\n0 For No\n1 For Yes");
		yesOrNo = keyboard.nextLine();
		keepOrChange = Integer.parseInt(yesOrNo);
		if(keepOrChange == 1){
			System.out.println("Your number is "+numberGuessing+". Goodluck!");
		}
		if(keepOrChange == 0){
			System.out.println("Enter your new number in. This is your last change!");
			usersInput = keyboard.nextLine();
			numberGuessing = Integer.parseInt(usersInput);
			if(numberGuessing < 0){
				System.out.println("Invalid! Please pick a number between 0-100");
				usersInput = keyboard.nextLine();
				numberGuessing = Integer.parseInt(usersInput);
			}
			if(numberGuessing > 100){
				System.out.println("Invalid! Please pick a number between 0-100");
				usersInput = keyboard.nextLine();
				numberGuessing = Integer.parseInt(usersInput);
			}
			System.out.println("Your number is "+numberGuessing+". Goodluck!");
		}

		//If statements of number guessing
		if(numberGuessing == generatedNumber){
			System.out.println("Congrats! You were correct on your first try. "+generatedNumber+" was the random number" +
					" and feel free to play again!");
			System.exit(0);
		}
		if(numberGuessing > generatedNumber){
			System.out.println(numberGuessing+" was too high of a number! You have 4 more attempts at guessing " +
					"the random number.\nTry again.");
		}
		if(numberGuessing < generatedNumber){
			System.out.println(numberGuessing+" was too low of a number! You have 4 more attempts at guessing " +
					"the random number.\nTry again.");
		}
		usersInput = keyboard.nextLine();
		numberGuessing = Integer.parseInt(usersInput);
		if(numberGuessing < 0){
			System.out.println("Invalid! Please pick a number between 0-100");
			usersInput = keyboard.nextLine();
			numberGuessing = Integer.parseInt(usersInput);
		}
		if(numberGuessing > 100){
			System.out.println("Invalid! Please pick a number between 0-100");
			usersInput = keyboard.nextLine();
			numberGuessing = Integer.parseInt(usersInput);
		}
		if(numberGuessing == generatedNumber){
			System.out.println("Congrats! You were correct on your second try. "+generatedNumber+" was the random number" +
					" and feel free to play again!");
			System.exit(0);
		}
		if(numberGuessing > generatedNumber){
			System.out.println(numberGuessing+" was too high of a number! You have 3 more attempts left at guessing " +
					"the random number.\nTry again.");
		}
		if(numberGuessing < generatedNumber){
			System.out.println(numberGuessing+" was too low of a number! You have 3 more attempts left at guessing " +
					"the random number.\nTry again.");
		}
		usersInput = keyboard.nextLine();
		numberGuessing = Integer.parseInt(usersInput);
		if(numberGuessing < 0){
			System.out.println("Invalid! Please pick a number between 0-100");
			usersInput = keyboard.nextLine();
			numberGuessing = Integer.parseInt(usersInput);
		}
		if(numberGuessing > 100){
			System.out.println("Invalid! Please pick a number between 0-100");
			usersInput = keyboard.nextLine();
			numberGuessing = Integer.parseInt(usersInput);
		}
		if(numberGuessing == generatedNumber){
			System.out.println("Congrats! You were correct on your third try. "+generatedNumber+" was the random number" +
					" and feel free to play again!");
			System.exit(0);
		}
		if(numberGuessing > generatedNumber){
			System.out.println(numberGuessing+" was too high of a number! You have 2 more attempts left at guessing " +
					"the random number.\nTry again.");
		}
		if(numberGuessing < generatedNumber){
			System.out.println(numberGuessing+" was too low of a number! You have 2 more attempts left at guessing " +
					"the random number.\nTry again.");
		}
		if(numberGuessing == generatedNumber){
			System.out.println("Congrats! You were correct on your fourth try. "+generatedNumber+" was the random number" +
					" and feel free to play again!");
			System.exit(0);
		}
		if(numberGuessing > generatedNumber){
			System.out.println(numberGuessing+" was too high of a number! You have 1 last attempt left at guessing " +
					"the random number.\nTry again.");
		}
		if(numberGuessing < generatedNumber){
			System.out.println(numberGuessing+" was too low of a number! You have 1 last attempt left at guessing " +
			"the random number.\nTry again.");
		}
		if(numberGuessing > generatedNumber){
			System.out.println(numberGuessing+" was too high of a number! Sorry that was your last attempt. Feel free" +
					" to play again.");
			System.exit(0);
		}
		if(numberGuessing < generatedNumber){
			System.out.println(numberGuessing+" was too low of a number! Sorry that was your last attempt. Feel free" +
					" to play again.");
			System.exit(0);
		}
	}
}
