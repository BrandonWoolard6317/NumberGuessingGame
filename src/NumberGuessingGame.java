import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args) {
		//Declaring variables
		String usersInput;
		int yesOrNo;
		int generatedNumber;
		int numberGuessing;

		//Initializing Variables
		Scanner keyboard = new Scanner(System.in);

		//Generating random number
		generatedNumber = (int) (Math.random() * 100);

		//Prints out generated number for testing on Original Code
		//System.out.println(generatedNumber);

		//Start of Original Code
		/*System.out.println("Lets play a guessing game! The rules are that I will pick a number between 0 to 100. Also," +
				"I will tell you \nif you are too high or too low. However... you only have 5 total attempts!");
		System.out.print("\nNow pick a number between 0-100 and good luck!\n");
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
		usersInput = keyboard.nextLine();
		yesOrNo = Integer.parseInt(usersInput);
		if(yesOrNo == 1){
			System.out.println("Your number is "+numberGuessing+".");
		}
		if(yesOrNo == 0){
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
			System.out.println("Congrats! You were correct on your fourth try. "+generatedNumber+" was the random number" +
					" and feel free to play again!");
			System.exit(0);
		}
		if(numberGuessing > generatedNumber){
			System.out.println(numberGuessing+" was too high of a number! You have 1 last attempt of guessing " +
					"the random number.\nTry again.");
		}
		if(numberGuessing < generatedNumber){
			System.out.println(numberGuessing+" was too low of a number! You have 1 last attempt of guessing " +
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
			System.out.println("Congrats! You were correct on your last try. "+generatedNumber+" was the random number" +
					" and feel free to play again!");
			System.exit(0);
		}
		if(numberGuessing > generatedNumber){
			System.out.println(numberGuessing+" was too high of a number! Sorry that was your last attempt. The random" +
					" number was "+generatedNumber+". Feel free to play again!");
			System.exit(0);
		}
		if(numberGuessing < generatedNumber){
			System.out.println(numberGuessing+" was too low of a number! Sorry that was your last attempt. The random" +
					" number was "+generatedNumber+". Feel free to play again!");
			System.exit(0);
		}*/
		//End of Original Code

		//Loop for Number Guessing Game
		System.out.print("Do you want to play my new game called The Number Guessing Game?\n1 Yes\n2 No");
		usersInput = keyboard.nextLine();
		yesOrNo = Integer.parseInt(usersInput);
		if(yesOrNo == 0){
			System.exit(0);
		}
		generatedNumber = (int) (Math.random() * 100);
		System.out.println("Guess a number between 0-100.");
		usersInput = keyboard.nextLine();
		numberGuessing = Integer.parseInt(usersInput);

		//Prints out Generated Number for testing Loop
		//System.out.println(generatedNumber);

		int a = 0;
		int g = 1;
		int fn = Integer.parseInt(usersInput);
		int po;

		boolean Loop = true;
		while(Loop){
			a++;
			if(numberGuessing == generatedNumber){
			    g++;
				if(a == 1){
					System.out.println("Congrats! You won using only 1 attempt!");
				} else{
					System.out.println("Congrats! You won using "+a+" attempts!");
				}
				if(generatedNumber > fn){
				    po = ?;
                }
                System.out.println("Game "+g+" results\nAttempts: "+a+"\nFirst Number: "+fn+"\nGenerated Number: "+generatedNumber+
                        "\nYou were "+po+ " off on your first attempt.");
				System.out.println("\nDo you want to play again?\n1 For Yes\n2 For No");
				usersInput = keyboard.nextLine();
				yesOrNo = Integer.parseInt(usersInput);
				if(yesOrNo == 2) {
					System.exit(0);
				} else if(yesOrNo == 1){
					generatedNumber = (int) (Math.random() * 100);
					System.out.println("Guess a new number between 0-100.");
					usersInput = keyboard.nextLine();
					numberGuessing = Integer.parseInt(usersInput);
					fn = Integer.parseInt(usersInput);
					a = 1;
				}
			}

			if(a > 1){
				System.out.println("You're on attempt "+a+".");
			}

			if(numberGuessing > generatedNumber){
				System.out.println("Your guess was too high. Try again.");
				usersInput = keyboard.nextLine();
				numberGuessing = Integer.parseInt(usersInput);
			} else if(numberGuessing < generatedNumber){
				System.out.println("Your guess was too low. Try again.");
				usersInput = keyboard.nextLine();
				numberGuessing = Integer.parseInt(usersInput);
			}
		}
		//End of Loop
	}
}
