import java.util.Random;
import java.util.Scanner;

public class ScoreCards {

	
	



	public void printCard1 (int[] Scores, int[] totals) {


	System.out.println("Player 1 Scorecard");
	System.out.println("___________________");
	System.out.println("one's" + "            | " + Scores[0]+ "   [0]");
	System.out.println("_________________|__");
	System.out.println("two's" + "            | " + Scores[1]+ "   [1]");
	System.out.println("_________________|__");
	System.out.println("three's" + "          | " + Scores[2]+ "   [2]");
	System.out.println("_________________|__");
	System.out.println("four's" + "           | " + Scores[3]+ "   [3]");
	System.out.println("_________________|__");
	System.out.println("five's" + "           | " + Scores[4]+ "   [4]");
	System.out.println("_________________|__");
	System.out.println("six's " + "           | " + Scores[5]+ "   [5]");
	System.out.println("_________________|__");
	System.out.println("Three of a Kind" + "  | " + Scores[6]+ "   [6]");
	System.out.println("_________________|__");
	System.out.println("Four of a Kind" + "   | " + Scores[7]+ "   [7]");
	System.out.println("_________________|__");
	System.out.println("Full House" + "       | " + Scores[8]+ "   [8]");
	System.out.println("_________________|__");
	System.out.println("Small Straight" + "   | " + Scores[9]+ "   [9]");
	System.out.println("_________________|__");
	System.out.println("Large Straight"+ "   | " + Scores[10]+ "   [10]");
	System.out.println("_________________|__");
	System.out.println("Yahtzee" + "          | " + Scores[11]+ "   [11]");
	System.out.println("_________________|__");
	System.out.println("Chance" + "           | " + Scores[12]+ "   [12]");
	System.out.println("_________________|__");
	System.out.println("Upper Total"+ "      | " + totals[0]+ "   [13]");
	System.out.println("_________________|__");
	System.out.println("Yahtzee Bonus" + "    | " + totals[1]+ "   [14]");
	System.out.println("_________________|__");
	System.out.println("Upper Bonus"+ "      | " + totals[2]+ "   [15]");
	System.out.println("_________________|__");
	System.out.println("Scoreboard Total"+ " | " + totals[3]+ "   [16]");
	System.out.println("_________________|__");
	}

	public void printCard2 (int[] Scores2, int[] totals2) {


		System.out.println("Player 2 Scorecard");
		System.out.println("___________________");
		System.out.println("one's" + "            | " + Scores2[0]+ "   [0]");
		System.out.println("_________________|__");
		System.out.println("two's" + "            | " + Scores2[1]+ "   [1]");
		System.out.println("_________________|__");
		System.out.println("three's" + "          | " + Scores2[2]+ "   [2]");
		System.out.println("_________________|__");
		System.out.println("four's" + "           | " + Scores2[3]+ "   [3]");
		System.out.println("_________________|__");
		System.out.println("five's" + "           | " + Scores2[4]+ "   [4]");
		System.out.println("_________________|__");
		System.out.println("six's " + "           | " + Scores2[5]+ "   [5]");
		System.out.println("_________________|__");
		System.out.println("Three of a Kind" + "  | " + Scores2[6]+ "   [6]");
		System.out.println("_________________|__");
		System.out.println("Four of a Kind" + "   | " + Scores2[7]+ "   [7]");
		System.out.println("_________________|__");
		System.out.println("Full House" + "       | " + Scores2[8]+ "   [8]");
		System.out.println("_________________|__");
		System.out.println("Small Straight" + "   | " + Scores2[9]+ "   [9]");
		System.out.println("_________________|__");
		System.out.println("Large Straight"+ "   | " + Scores2[10]+ "   [10]");
		System.out.println("_________________|__");
		System.out.println("Yahtzee" + "          | " + Scores2[11]+ "   [11]");
		System.out.println("_________________|__");
		System.out.println("Chance" + "           | " + Scores2[12]+ "   [12]");
		System.out.println("_________________|__");
		System.out.println("Upper Total"+ "      | " + totals2[0]+ "   [13]");
		System.out.println("_________________|__");
		System.out.println("Yahtzee Bonus" + "    | " + totals2[1]+ "   [14]");
		System.out.println("_________________|__");
		System.out.println("Upper Bonus"+ "      | " + totals2[2]+ "   [15]");
		System.out.println("_________________|__");
		System.out.println("Scoreboard Total"+ " | " + totals2[3]+ "   [16]");
		System.out.println("_________________|__");
		}
	
	Scanner keyboard = new Scanner(System.in);
	Random rand = new Random();
	public int[] diceRoll () {
		//ROLLING THE DICE
				// set an empty array where we can store die rolls
				int[] diceArray = new int[5];
				
				// Let user know that this is their first roll
				System.out.println("Your first dice roll:");
				
				//generate 5 random numbers (1-6) and store them inside the empty array
				for(int i=0; i<=4; i++)
				{
					
					int diceRoll = rand.nextInt(6)+1;
					diceArray[i] = diceRoll;
					
					
				// print out a board that will show the indexes of the die
					System.out.print("[" + i + "] ");
					
				}
				
				// print on a new line the actual die that were rolled
				System.out.print("\n");
				
				for(int i=0; i<=4; i++)
				{
					System.out.print(" "+ diceArray[i] + "  ");
				}
				
				
				// have user choose which die indexes they want to re-roll
						System.out.println("\n\nEnter die index(es) to re-roll: \n"
								+ "Enter -1 when you are finished choosing which dice you want to re-roll: \n"
								+ "If you do not wish to re-roll any of your die, enter -1: ");
						int chooseIndex = keyboard.nextInt();
						
				if (chooseIndex==-1)
				{
					System.out.println("You have chosen to forgoe your optional remaining 2 rolls");
				}
				
				
				else {		
						// run loop that lets user choose more indexes
						while (chooseIndex>=0)
							
						{
							// make sure index is within range
							while(chooseIndex>4)
							{
								System.out.println("Error: Index too large.");
								System.out.println("Please enter an index within the range (0-4).");
								chooseIndex = keyboard.nextInt();
							}	
							
							// re-roll the die for the chosen index
							diceArray[chooseIndex] = rand.nextInt(6) +1;
							
							
							// user can choose another index if they desire
							chooseIndex = keyboard.nextInt();
						
						}	
						
						//Let user know this was their second roll
						System.out.println("Your second dice roll:");
						
						// re-print out a board that will show the indexes of the die
						for(int i=0; i<=4; i++)
						{
							System.out.print("[" + i + "] ");
						}
						
						// print on a new line the actual die that were rolled
						System.out.print("\n");
						
						for(int i=0; i<=4; i++)
						{
							System.out.print(" "+ diceArray[i] + "  ");
						}
						
						
						// have user choose which die indexes they want to re-roll
						System.out.println("\n\nEnter die index(es) to re-roll: \n"
								+ "Enter -1 when you are finished choosing which dice you want to re-roll: \n"
								+ "If you do not wish to re-roll any of your die, enter -1: ");
						chooseIndex = keyboard.nextInt();
						
						if(chooseIndex==-1)
						{
							System.out.println("You have chosen to forgoe your optional remaining roll");
						}
						
						else {
						// run loop that lets user choose more indexes
						while (chooseIndex>=0)
							
						{
							// make sure index is within range
							while(chooseIndex>4)
							{
								System.out.println("Error: Index too large.");
								System.out.println("Please enter an index within the range (0-4).");
								chooseIndex = keyboard.nextInt();
							}	
							
							// re-roll the die for the chose index
							diceArray[chooseIndex] = rand.nextInt(6) +1;
							
							
							// user can choose another index if they desire
							chooseIndex = keyboard.nextInt();
						
						}
						
						
						//Let user know this was their third roll
						System.out.println("Your third dice roll:");
						
						// re-print out a board that will show the indexes of the die
						for(int i=0; i<=4; i++)
						{
							System.out.print("[" + i + "] ");
						}
						
						// print on a new line the actual die that were rolled
						System.out.print("\n");
						
						for(int i=0; i<=4; i++)
						{
							System.out.print(" "+ diceArray[i] + "  ");
						}	
						//let the user know that they have used all of their dice rolls
						System.out.println("\nThat was you third roll of this turn, you are out of rolls for this turn.");
						
					}	
						
				}
				return diceArray;
	}
	}  
