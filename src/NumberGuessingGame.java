import java.util.Scanner;

public class NumberGuessingGame {
	public static void main(String[] args){
		//Declaring variables
		String usersInput;
		int generatedNumber;
		int numberGuessing
		
		//Initializing Variables
		Scanner keyboard = new Scanner(System.in);
		numberGuessing = Integer.parseInt(usersInput);
		
		//Generating random number
		generatedNumber = (int) (Math.random()*100);
		
		//Prints out generated number 
		System.out.println(generatedNumber);
		//Temporary until project is fully tested and complete
		
		//Grabbing users input
		System.out.println("Lets play a guessing game! Pick a number between 0-100!");
		usersInput = keyboard.nextLine();
	       
		//If statements of number guessing
		if(numberGuessing == generatedNumber){
			System.out.println("Congrats! You've guessed "+generatedNumber+" correct on\nyour "+
					   "first try! Can you do it again?");
			System.exit(0)
		}
		if else(numberGuessing > generatedNumber){
			System.out.println("Your guess is over the number! You have 3 more attempts.\nTry again.");
			usersInput = keyboard.nextLine();
			if(numberGuessing == generatedNumber){
				System.out.println("Congrats! You've guessed "+generatedNumber+" correct on\nyour "+
						   "second try! Can you do it again?");
				System.exit(0)
			}
			if else(numberGuessing > generatedNumber){
		        	System.out.println("Your guess is over the number! You have 2 more attempts.\nTry again.");
		        	usersInput = keyboard.nextLine();
			}
			if else(numberGuessing < generatedNumber){
		        	System.out.println("Your guess is under the number! You have 2 more attempts.\nTry again.");
		        	usersInput = keyboard.nextLine();
				if(numberGuessing == generatedNumber){
				        System.out.println("Congrats! You've guessed "+generatedNumber+" correct on\nyour "+
						   "third try! Can you do it again?");
				        System.exit(0)
				}
				if else(numberGuessing > generatedNumber){
		        	        System.out.println("Your guess is over the number! You only have one attempt left.\nTry again.");
		        	        usersInput = keyboard.nextLine();
				}
				if else(numberGuessing < generatedNumber){
		        	        System.out.println("Your guess is under the number! You only have one attempt left.\nTry again.");
		        	        usersInput = keyboard.nextLine();
					if(numberGuessing == generatedNumber){
						System.out.println("Congrats! You've guessed "+generatedNumber+" correct on\nyour "+
						   "last try! Can you do it again?");
				                System.exit(0)
					}
					if else(numberGuessing > generatedNumber){
		        	                System.out.println("Your guess is over the number! Sorry that was your last\ntry."+
								   "The number was "+generatedNumber+". Feel free to play again!");
		        	                System.exit(0)
					}
					if else(numberGuessing < generatedNumber){
		        	                System.out.println("Your guess is under the number! Sorry that was your last\ntry."+
								   "The number was "+generatedNumber+". Feel free to play again!");
		        	                System.exit(0)
					}
	                   }
		           if else(numberGuessing < generatedNumber){
	                 	        System.out.println("Your guess is under the number! You have 3 more attempts.\nTry again.");
	                 	        usersInput = keyboard.nextLine();
	                		if(numberGuessing == generatedNumber){
	         		        	System.out.println("Congrats! You've guessed "+generatedNumber+" correct on\nyour "+
					         	           "second try! Can you do it again?");
			                 	System.exit(0)
	                 		}
	                 		if else(numberGuessing > generatedNumber){
         		                 	System.out.println("Your guess is over the number! You have 2 more attempts.\nTry again.");
	            	                	usersInput = keyboard.nextLine();
                   	    		}
	                 		if else(numberGuessing < generatedNumber){
	         	                  	System.out.println("Your guess is under the number! You have 2 more attempts.\nTry again.");
		                         	usersInput = keyboard.nextLine();
	         			if(numberGuessing == generatedNumber){
		         		        System.out.println("Congrats! You've guessed "+generatedNumber+" correct on\nyour "+
		          				   "third try! Can you do it again?");
				                System.exit(0)
	         			}
	         			if else(numberGuessing > generatedNumber){
		                 	        System.out.println("Your guess is over the number! You only have one attempt left.\nTry again.");
		                 	        usersInput = keyboard.nextLine();
				}
				if else(numberGuessing < generatedNumber){
		        	        System.out.println("Your guess is under the number! You only have one attempt left.\nTry again.");
		        	        usersInput = keyboard.nextLine();
					if(numberGuessing == generatedNumber){
						System.out.println("Congrats! You've guessed "+generatedNumber+" correct on\nyour "+
						   "last try! Can you do it again?");
				                System.exit(0)
					}
					if else(numberGuessing > generatedNumber){
		        	                System.out.println("Your guess is over the number! Sorry that was your last\ntry."+
								   "The number was "+generatedNumber+". Feel free to play again!");
		        	                System.exit(0)
					}
					if else(numberGuessing < generatedNumber){
		        	                System.out.println("Your guess is under the number! Sorry that was your last\ntry."+
								   "The number was "+generatedNumber+". Feel free to play again!");
		        	                System.exit(0)
					}
				 	
					
					
					
			}
				
				
				
				
				
		}
    }   
}
