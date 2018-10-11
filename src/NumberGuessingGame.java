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

		//Loop for Number Guessing Game
		System.out.println("Let's play my Number Guessing Game!");
		System.out.println("\nTitles\nLegend: 1 Attempt\nKing: 2 Attempts\nKnight: 3 Attempts\nPeasant: 4-7 Attempts\nUseless: 8+ Attempts");
		generatedNumber = (int) (Math.random() * 100);
		//Prints out Generated Number for testing Loop
		System.out.println(generatedNumber);
		System.out.println("\nGuess a number between 0-100");
		usersInput = keyboard.nextLine();
		numberGuessing = Integer.parseInt(usersInput);

		//Prints out Generated Number for testing Loop
		System.out.println(generatedNumber);

		int a = 0;
		int g = 0;
		int fn = Integer.parseInt(usersInput);
		int po = 0;
		String Title = "Error";
		String g1 = "Error";
		String g2 = "Error";
		String g3 = "Error";

		boolean Loop = true;
		while (Loop) {
			a++;
			if (numberGuessing == generatedNumber) {
				g++;
				if (a == 1) {
					System.out.println("Congrats! You won using only 1 attempt!");
				} else {
					System.out.println("Congrats! You won using " + a + " attempts!");
				}
				if (generatedNumber > fn) {
					po = (generatedNumber - fn);
				} else if (generatedNumber < fn) {
					po = (fn - generatedNumber);
				}
				System.out.println("\nGame " + g + " Results");
				if (a == 1) {
					Title = "\nTitle: Legend";
					System.out.println(Title);
				} else if (a == 2) {
					Title = "\nTitle: King";
					System.out.println(Title);
				} else if (a == 3) {
					Title = "\nTitle: Knight";
					System.out.println(Title);
				} else if (a == 4 || a == 5 || a == 6 || a == 7) {
					Title = "\nTitle: Peasant";
					System.out.println(Title);
				} else if (a > 7) {
					Title = "\nTitle: Useless";
					System.out.println(Title);
				}
				System.out.println("Attempts: " + a + "\nFirst Number: " + fn + "\nGenerated Number: " + generatedNumber +
						"\nYou were " + po + " off on your first attempt.");
				if (g == 1) {
					g1 = "Game " + g + " Results" + Title + "\nAttempts: " + a + "\nFirst Number: " + fn + "\nGenerated Number: " + generatedNumber + "\nYou were " + po +
							" off on your first attempt.";
				} else if (g == 2) {
					g2 = "Game " + g + " Results" + Title + "\nAttempts: " + a + "\nFirst Number: " + fn + "\nGenerated Number: " + generatedNumber + "\nYou were " + po +
							" off on your first attempt.";
				} else if (g == 3) {
					g3 = "Game " + g + " Results" + Title + "\nAttempts: " + a + "\nFirst Number: " + fn + "\nGenerated Number: " + generatedNumber + "\nYou were " + po +
							" off on your first attempt.";
				}
				if (g == 1) {
					System.out.println("Do you want to play again?\n1 For Yes\n2 For No");
					usersInput = keyboard.nextLine();
					yesOrNo = Integer.parseInt(usersInput);
					if (yesOrNo == 2) {
						System.exit(0);
					} else if (yesOrNo == 1) {
						generatedNumber = (int) (Math.random() * 100);
						System.out.println("Guess a new number between 0-100.");
						usersInput = keyboard.nextLine();
						numberGuessing = Integer.parseInt(usersInput);
						fn = Integer.parseInt(usersInput);
						a = 1;
					}
				} else if (g == 2) {
					System.out.println("Do you want to play again?\n1 For Yes\n2 For No\n3 To Show Game 1 Results");
					usersInput = keyboard.nextLine();
					yesOrNo = Integer.parseInt(usersInput);
					if (yesOrNo == 2) {
						System.exit(0);
					} else if (yesOrNo == 1) {
						generatedNumber = (int) (Math.random() * 100);
						System.out.println("Guess a new number between 0-100.");
						usersInput = keyboard.nextLine();
						numberGuessing = Integer.parseInt(usersInput);
						fn = Integer.parseInt(usersInput);
						a = 1;
					} else if (yesOrNo == 3) {
						System.out.println(g1);
						System.out.println("Do you want to play again?\n1 For Yes\n2 For No");
						usersInput = keyboard.nextLine();
						yesOrNo = Integer.parseInt(usersInput);
						if (yesOrNo == 1) {
							generatedNumber = (int) (Math.random() * 100);
							System.out.println("Guess a new number between 0-100.");
							usersInput = keyboard.nextLine();
							numberGuessing = Integer.parseInt(usersInput);
							fn = Integer.parseInt(usersInput);
							a = 1;
						} else if (yesOrNo == 2) {
							System.exit(0);
						}
					}
				} else if (g == 3) {
					System.out.println("Do you want to play again?\n1 For Yes\n2 For No\n3 Displays Game 1 Results" +
							"\n4 Displays Game 2 Results");
					usersInput = keyboard.nextLine();
					yesOrNo = Integer.parseInt(usersInput);
					if (yesOrNo == 2) {
						System.exit(0);
					} else if (yesOrNo == 1) {
						generatedNumber = (int) (Math.random() * 100);
						System.out.println("Guess a new number between 0-100.");
						usersInput = keyboard.nextLine();
						numberGuessing = Integer.parseInt(usersInput);
						fn = Integer.parseInt(usersInput);
						a = 1;
					} else if (yesOrNo == 3) {
						System.out.println(g1);
						System.out.println("Do you want to play again?\n1 For Yes\n2 For No\n3 Displays Game 2 Results");
						usersInput = keyboard.nextLine();
						yesOrNo = Integer.parseInt(usersInput);
						if (yesOrNo == 1) {
							generatedNumber = (int) (Math.random() * 100);
							System.out.println("Guess a new number between 0-100.");
							usersInput = keyboard.nextLine();
							numberGuessing = Integer.parseInt(usersInput);
							fn = Integer.parseInt(usersInput);
							a = 1;
						} else if (yesOrNo == 2) {
							System.exit(0);
						} else if (yesOrNo == 3) {
							System.out.println(g2);
							System.out.println("Do you want to play again?\n1 For Yes\n2 For No");
							usersInput = keyboard.nextLine();
							yesOrNo = Integer.parseInt(usersInput);
							if (yesOrNo == 1) {
								generatedNumber = (int) (Math.random() * 100);
								System.out.println("Guess a new number between 0-100.");
								usersInput = keyboard.nextLine();
								numberGuessing = Integer.parseInt(usersInput);
								fn = Integer.parseInt(usersInput);
								a = 1;
							} else if (yesOrNo == 2) {
								System.exit(0);
							}
						} else if (yesOrNo == 4) {
							System.out.println(g2);
							System.out.println("Do you want to play again?\n1 For Yes\n2 For No\n3 Displays Game 1 Results");
							usersInput = keyboard.nextLine();
							yesOrNo = Integer.parseInt(usersInput);
							if (yesOrNo == 1) {
								generatedNumber = (int) (Math.random() * 100);
								System.out.println("Guess a new number between 0-100.");
								usersInput = keyboard.nextLine();
								numberGuessing = Integer.parseInt(usersInput);
								fn = Integer.parseInt(usersInput);
								a = 1;
							} else if (yesOrNo == 2) {
								System.exit(0);
							} else if (yesOrNo == 3) {
								System.out.println(g1);
								System.out.println("Do you want to play again?\n1 For Yes\n2 For No");
								usersInput = keyboard.nextLine();
								yesOrNo = Integer.parseInt(usersInput);
								if (yesOrNo == 1) {
									generatedNumber = (int) (Math.random() * 100);
									System.out.println("Guess a new number between 0-100.");
									usersInput = keyboard.nextLine();
									numberGuessing = Integer.parseInt(usersInput);
									fn = Integer.parseInt(usersInput);
									a = 1;
								} else if (yesOrNo == 2) {
									System.exit(0);
								}
							}
						}
					}
				} else if(g == 4){
					System.out.println("Do you want to play again?\n1 For Yes\n2 For No\n3 Displays Game 1 Results" +
							"\n4 Displays Game 2 Results\n5 Displays Game 3 Results");
					usersInput = keyboard.nextLine();
					yesOrNo = Integer.parseInt(usersInput);
					if (yesOrNo == 1) {
						generatedNumber = (int) (Math.random() * 100);
						System.out.println("Guess a new number between 0-100.");
						usersInput = keyboard.nextLine();
						numberGuessing = Integer.parseInt(usersInput);
						fn = Integer.parseInt(usersInput);
						a = 1;
					} else if (yesOrNo == 2) {
						System.exit(0);
					} else if (yesOrNo == 3) {
						System.out.println(g1);
						System.out.println("Do you want to play again?\n1 For Yes\n2 For No\n3 Displays Game 2 Results");
						usersInput = keyboard.nextLine();
						yesOrNo = Integer.parseInt(usersInput);
						if (yesOrNo == 1) {
							generatedNumber = (int) (Math.random() * 100);
							System.out.println("Guess a new number between 0-100.");
							usersInput = keyboard.nextLine();
							numberGuessing = Integer.parseInt(usersInput);
							fn = Integer.parseInt(usersInput);
							a = 1;
						} else if (yesOrNo == 2) {
							System.exit(0);
						} else if (yesOrNo == 3) {
							System.out.println(g2);
							System.out.println("Do you want to play again?\n1 For Yes\n2 For No");
							usersInput = keyboard.nextLine();
							yesOrNo = Integer.parseInt(usersInput);
							if (yesOrNo == 1) {
								generatedNumber = (int) (Math.random() * 100);
								System.out.println("Guess a new number between 0-100.");
								usersInput = keyboard.nextLine();
								numberGuessing = Integer.parseInt(usersInput);
								fn = Integer.parseInt(usersInput);
								a = 1;
							} else if (yesOrNo == 2) {
								System.exit(0);
							}
						} else if (yesOrNo == 4) {
							System.out.println(g2);
							System.out.println("Do you want to play again?\n1 For Yes\n2 For No\n3 Displays Game 1 Results");
							usersInput = keyboard.nextLine();
							yesOrNo = Integer.parseInt(usersInput);
							if (yesOrNo == 1) {
								generatedNumber = (int) (Math.random() * 100);
								System.out.println("Guess a new number between 0-100.");
								usersInput = keyboard.nextLine();
								numberGuessing = Integer.parseInt(usersInput);
								fn = Integer.parseInt(usersInput);
								a = 1;
							} else if (yesOrNo == 2) {
								System.exit(0);
							} else if (yesOrNo == 3) {
								System.out.println(g1);
								System.out.println("Do you want to play again?\n1 For Yes\n2 For No");
								usersInput = keyboard.nextLine();
								yesOrNo = Integer.parseInt(usersInput);
								if (yesOrNo == 1) {
									generatedNumber = (int) (Math.random() * 100);
									System.out.println("Guess a new number between 0-100.");
									usersInput = keyboard.nextLine();
									numberGuessing = Integer.parseInt(usersInput);
									fn = Integer.parseInt(usersInput);
									a = 1;
								} else if (yesOrNo == 2) {
									System.exit(0);
								}
							}
						} else if(yesOrNo == 5){
							System.out.println(g3);
							System.out.println("Do you want to play again?\n1 For Yes\n2 For No\n3 Displays Game 1 Results" +
									"\n4 Displays Game 2 Results");
							usersInput = keyboard.nextLine();
							yesOrNo = Integer.parseInt(usersInput);
							if (yesOrNo == 1) {
								generatedNumber = (int) (Math.random() * 100);
								System.out.println("Guess a new number between 0-100.");
								usersInput = keyboard.nextLine();
								numberGuessing = Integer.parseInt(usersInput);
								fn = Integer.parseInt(usersInput);
								a = 1;
							} else if (yesOrNo == 2) {
								System.exit(0);
							} else if (yesOrNo == 3) {
								System.out.println(g1);
								System.out.println("Do you want to play again?\n1 For Yes\n2 For No");
								usersInput = keyboard.nextLine();
								yesOrNo = Integer.parseInt(usersInput);
								if (yesOrNo == 1) {
									generatedNumber = (int) (Math.random() * 100);
									System.out.println("Guess a new number between 0-100.");
									usersInput = keyboard.nextLine();
									numberGuessing = Integer.parseInt(usersInput);
									fn = Integer.parseInt(usersInput);
									a = 1;
								} else if (yesOrNo == 2) {
									System.exit(0);
								}
							} else if(yesOrNo == 4){
								System.out.println(g2);
								System.out.println("Do you want to play again?\n1 For Yes\n2 For No");
								usersInput = keyboard.nextLine();
								yesOrNo = Integer.parseInt(usersInput);
								if (yesOrNo == 1) {
									generatedNumber = (int) (Math.random() * 100);
									System.out.println("Guess a new number between 0-100.");
									usersInput = keyboard.nextLine();
									numberGuessing = Integer.parseInt(usersInput);
									fn = Integer.parseInt(usersInput);
									a = 1;
								} else if (yesOrNo == 2) {
									System.exit(0);
								}
							}
						}
					}
				}
			}
				if (a > 1) {
					System.out.println("You're on attempt " + a + ".");
				}

				if (numberGuessing > generatedNumber) {
					System.out.println("Your guess was too high. Try again.");
					usersInput = keyboard.nextLine();
					numberGuessing = Integer.parseInt(usersInput);
				} else if (numberGuessing < generatedNumber) {
					System.out.println("Your guess was too low. Try again.");
					usersInput = keyboard.nextLine();
					numberGuessing = Integer.parseInt(usersInput);
				}

			//End of Loop
		}
	}
}
