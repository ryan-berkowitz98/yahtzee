import java.util.Random;
import java.util.Scanner;

public class Yahtzee {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		Random rand = new Random();
		
		//Call a scorecard from scorecard class
		ScoreCards cards = new ScoreCards();
		int[] scores = new int[13];
		int[] totals = new int[4];
		int[] scores2 = new int[13];
		int[] totals2 = new int[4];
		
		// Create the array of booleans to see whether or not each index was played
		// set them all to false to begin
		boolean[] wasIndexPlayed = new boolean[13];
		boolean[] wasIndexPlayed2 = new boolean[13];
		for(int n=0; n<wasIndexPlayed.length; n++)
		{
			wasIndexPlayed[n] = false;
			
		}
		
		//Run the whole game for 25 loops
		for(int turn=1; turn<27; turn++)
		{
			if(turn>1)
				System.out.print("\n \n \n");
			
			System.out.println("Turn: " + turn + " out of 26.");
			
			// Decide whose turn it is
			if(turn%2==1)
			{	
				System.out.println("It is Player 1's Turn!!!!!");
				
				
			
			
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ROLLING THE DICE ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
				while (chooseIndex>=0 || chooseIndex<-1)
					
				{
					// make sure index is within range
					while(chooseIndex>4 || chooseIndex<-1)
					{
						System.out.println("Error: Invalid Index.");
						System.out.println("Please enter an index within the range (0-4).");
						chooseIndex = keyboard.nextInt();
					}	
					
					/*
					 * If the player accidentally entered an index that was too large, they can still enter -1
					 * if they don't want to reroll any of their dice. This will take them to their next dice
					 * roll but return the same dice from last roll + the new dice they rolled before 
					 * choosing an index that was too large*/ 
					if(chooseIndex==-1)
						continue;
					
						
					
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
					
					
					/*
					 * If the player accidentally entered an index that was too large, they can still enter -1
					 * if they don't want to reroll any of their dice. This will take them to their next dice
					 * roll but return the same dice from last roll + the new dice they rolled before 
					 * choosing an index that was too large*/
					if(chooseIndex==-1)
						continue;
					
					
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
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ DONE ROLLING THE DICE ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~ COUNTING THE NUMBERS THAT APPEARED ON THE DICE ~~~~~~~~~~~~~~~~~~~~~~~~~~
		int count1=0; 
		int count2=0;
		int count3=0;
		
		int count4=0;
		int count5=0;
		int count6 =0;
		for(int n=0; n< diceArray.length; n++)
		{
			if(diceArray[n]==1)
				count1++;
			else if(diceArray[n]==2)
				count2++;
			else if(diceArray[n]==3)
				count3++;
			else if(diceArray[n]==4)
				count4++;
			else if(diceArray[n]==5)
				count5++;
			else if(diceArray[n]==6)
				count6++;
		}
		//~~~~~~~~~~~~~~~~~~~~~~~ DONE COUNTING THE NUMBERS THAT APPEARED ON THE DIE ~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~ Print a new scorecard with the updated gameboard ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	cards.printCard1(scores, totals);
		
		
	
	
	//~~~~~~~~~~~~~~~~~~~ User Chooses where to play and making sure their play is valid ~~~~~~~~~~~~~~~~~~~
		
	// Have the user pick where they want to play their roll
	System.out.println("Enter the index of which you want to play your roll"
			+ "\n Please choose an index 0-12:"
			+ "\n If you have no valid moves or wish to forfeit your turn, enter -1:");
	
	int chooseGameBoardIndex = keyboard.nextInt();
	
	// IF user enters -1, the turn is over and no action needs to be performed
	if(chooseGameBoardIndex!=-1)
	{
		//create boolean to make sure index is within range and set it to false
		boolean isIndexWithinRange = false;	
		boolean isIndexValid = false;
		
	while(isIndexWithinRange==false || isIndexValid==false) {
	//if the index is in range set the boolean to true
	if(chooseGameBoardIndex>=-1 && chooseGameBoardIndex<=12)
		isIndexWithinRange=true;
	
	// make sure the user chose an index within the range
	while(isIndexWithinRange==false)
	{
		System.out.print("Sorry, that index is not within the specified range"
				+ "\n Please choose another index:"
				+ "\n If you have no valid moves or wish to forfeit your turn, enter -1:");
		chooseGameBoardIndex = keyboard.nextInt();
		if(chooseGameBoardIndex>=-1 && chooseGameBoardIndex<=12)
			isIndexWithinRange=true;
		
	}
	
	// IF user enters -1, the turn is over and no action needs to be performed
	if(chooseGameBoardIndex!=-1)
	{
	
	// MAKE SURE THAT PLAYER HAS NOT ALREADY USED THE INDEX IN A PREVIOUS TURN
			while(wasIndexPlayed[chooseGameBoardIndex]==true)
			{
				System.out.println("Sorry, you've already played that game board index "
						+ "\n Please choose another index:"
						+ "\n If you have no valid moves or wish to forfeit your turn, enter -1:\"");
				chooseGameBoardIndex = keyboard.nextInt();
			}	
	
	// IF user enters -1, the turn is over and no action needs to be performed
			if(chooseGameBoardIndex!=-1)
			{
						
				// Make sure that the player's index choice is valid for their dice roll
				while(isIndexValid==false)
				{
				
				// Aces
					if(chooseGameBoardIndex==0)
					{
						if(count1>=1)
							isIndexValid=true;
					}
					//Two's
					if(chooseGameBoardIndex==1)
					{
						if(count2>=1)
							isIndexValid=true;
					}
					//Threes
					if(chooseGameBoardIndex==2)
					{
						if(count3>=1)
							isIndexValid=true;
					}
					// Fours
					if(chooseGameBoardIndex==3)
					{
						if(count4>=1)
							isIndexValid=true;
					}
					// Fives
					if(chooseGameBoardIndex==4)
					{
						if(count5>=1)
							isIndexValid=true;
					}
					// Sixes
					if(chooseGameBoardIndex==5)
					{
						if(count6>=1)
							isIndexValid=true;
					}
					//Three of a kind
					if(chooseGameBoardIndex==6)
					{
						if (count1>=3 || count2>=3 || count3>=3 || count4>=3 || count5>=3 || count6>=3)
							isIndexValid=true;
					}
					//Four of a kind
					if(chooseGameBoardIndex==7)
					{
						if (count1>=4 || count2>=4 || count3>=4 || count4>=4 || count5>=4 || count6>=4)
							isIndexValid=true;
					}
					//Full House
					if(chooseGameBoardIndex==8)
					{
						if (((count1>=3 || count2>=3 || count3>=3 || count4>=3 || count5>=3 || count6>=3) &&
								(count1>=2 || count2>=2 || count3>=2 || count4>=2 || count5>=2 || count6>=2)))
							isIndexValid=true;
					}
					//Small Straight
					if(chooseGameBoardIndex==9)
					{
						if((count1>0 && count2>0 && count3>0 && count4>0) || 
						   (count2>0 && count3>0 && count4>0 && count5>0) ||
						   (count3>0 && count4>0 && count5>0 && count6>0))
								isIndexValid=true;
					}
					//Large Straight
					if(chooseGameBoardIndex==10)
					{
						if((count1>0 && count2>0 && count3>0 && count4>0 && count5>0) || 
						   (count2>0 && count3>0 && count4>0 && count5>0 && count6>0))
								isIndexValid=true;
					}
					//Yahtzee
					if(chooseGameBoardIndex==11)
					{
						if (count1==5 || count2==5 || count3==5 || count4==5 || count5==5 || count6==5)
							isIndexValid=true;
					}
					//Chance
					if(chooseGameBoardIndex==12)
						isIndexValid=true;
					
					
					if(isIndexValid)
						break;
					System.out.println("Sorry, based on your dice roll, you cannot play at that index. "
							+ "\nPlease choose another index");
					chooseGameBoardIndex = keyboard.nextInt();
				}
	
	
		

			//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SCORING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
			//Aces
				if (chooseGameBoardIndex==0)
				{
					scores[chooseGameBoardIndex] = 1*count1;
					System.out.println("Ace's score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}	
				
			// Two's
				if (chooseGameBoardIndex==1)
				{
					scores[chooseGameBoardIndex] = 2*count2;
					System.out.println("Two's score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
				
				//Three's
				if (chooseGameBoardIndex==2)
				{
					scores[chooseGameBoardIndex] = 3*count3;
					System.out.println("Three's score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
				
				// Four's
				if (chooseGameBoardIndex==3)
				{
					scores[chooseGameBoardIndex] = 4*count4;
					System.out.println("Fours's score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
			
				// five's
				if (chooseGameBoardIndex==4)
				{
					scores[chooseGameBoardIndex] = 5*count5;
					System.out.println("Five's score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
			
				
				// Six's
				if (chooseGameBoardIndex==5)
				{
					scores[chooseGameBoardIndex] = 6*count6;
					System.out.println("Six's score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
		
				//Three of a kind
				if (chooseGameBoardIndex==6)
				{
					int sum3Kind =0;
					for(int n=0; n< diceArray.length; n++)
					{
					
						sum3Kind = sum3Kind+diceArray[n];
					}
					scores[chooseGameBoardIndex] = sum3Kind;
					System.out.println("Three of a kind score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
		
				// Four of a kind
				if (chooseGameBoardIndex==7)
				{
					int sum4Kind =0;
					for(int n=0; n< diceArray.length; n++)
					{
					
						sum4Kind = sum4Kind+diceArray[n];
					}
					scores[chooseGameBoardIndex] = sum4Kind;
					System.out.println("Four of a kind score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
		
				// Full house
				if (chooseGameBoardIndex==8)
				{
					scores[chooseGameBoardIndex] = 25;
					System.out.println("full house score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
			
				// Small Straight
				if (chooseGameBoardIndex==9)
				{
					scores[chooseGameBoardIndex] = 30;
					System.out.println("small straight score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
				
				// Large Straight
				if (chooseGameBoardIndex==10)
				{
					scores[chooseGameBoardIndex] = 40;
					System.out.println("large straight score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
				
				//Yahtzee
				if (chooseGameBoardIndex==11)
				{
					scores[chooseGameBoardIndex] = 50;
					System.out.println("yahtzee score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
				
				// Chance
				if (chooseGameBoardIndex==12)
				{
					int sumChance =0;
					for(int n=0; n< diceArray.length; n++)
					{
					
						sumChance = sumChance+diceArray[n];
					}
					scores[chooseGameBoardIndex] = sumChance;
					System.out.println("Chance score: "+ scores[chooseGameBoardIndex]);
					wasIndexPlayed[chooseGameBoardIndex]=true;
				}
				
				//Upper Total 
				int sumUpper=0;
				for(int n=0; n<=5; n++)
				{
				
					 sumUpper = sumUpper+scores[n];
				}
				totals[0] = sumUpper; 
				
				// Yahtzee Bonus
				if (wasIndexPlayed[11]==true && (count1==6 || count2==6 || count3==6 || count4==6 || count5==6 || count6==6))
				{
					totals[1] = totals[1]+100;
					System.out.println("!!!!! YAHTZEE BONUS !!!!!");
				}
				
				//Upper Bonus
				if(totals[0]>=63)
					totals[2]=35;
				
				//Scoreboard total
				int sumLower=0;
				for(int f=6; f<=12; f++)
					sumLower = sumLower + scores[f];
				
				totals[3] = sumLower+ totals[0] + totals[1] + totals[2];

	}
	}
	}
	}
	}
		

			
// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ PLAYER 1 TURN OVER ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~			
			// Decide whose turn it is
			
			else if(turn%2==0)
			{
			
				System.out.println("It is PLayer 2's Turn!!!!!");
				
				
			
			
		//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ ROLLING THE DICE ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
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
				while (chooseIndex>=0|| chooseIndex<-1)
					
				{
					// make sure index is within range
					while(chooseIndex>4 || chooseIndex<-1)
					{
						System.out.println("Error: Index too large.");
						System.out.println("Please enter an index within the range (0-4).");
						chooseIndex = keyboard.nextInt();
					}	
					
					/*
					 * If the player accidentally entered an index that was too large, they can still enter -1
					 * if they don't want to reroll any of their dice. This will take them to their next dice
					 * roll but return the same dice from last roll + the new dice they rolled before 
					 * choosing an index that was too large*/ 
					if(chooseIndex==-1)
						continue;
					
						
					
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
					
					
					/*
					 * If the player accidentally entered an index that was too large, they can still enter -1
					 * if they don't want to reroll any of their dice. This will take them to their next dice
					 * roll but return the same dice from last roll + the new dice they rolled before 
					 * choosing an index that was too large*/
					if(chooseIndex==-1)
						continue;
					
					
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
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ DONE ROLLING THE DICE ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

		
		// ~~~~~~~~~~~~~~~~~~~~~~~~~~ COUNTING THE NUMBERS THAT APPEARED ON THE DICE ~~~~~~~~~~~~~~~~~~~~~~~~~~
		int count1=0; 
		int count2=0;
		int count3=0;
		
		int count4=0;
		int count5=0;
		int count6 =0;
		for(int n=0; n< diceArray.length; n++)
		{
			if(diceArray[n]==1)
				count1++;
			else if(diceArray[n]==2)
				count2++;
			else if(diceArray[n]==3)
				count3++;
			else if(diceArray[n]==4)
				count4++;
			else if(diceArray[n]==5)
				count5++;
			else if(diceArray[n]==6)
				count6++;
		}
		//~~~~~~~~~~~~~~~~~~~~~~~ DONE COUNTING THE NUMBERS THAT APPEARED ON THE DIE ~~~~~~~~~~~~~~~~~~~~~~~~~~~
		
		
	//~~~~~~~~~~~~~~~~~~~~~~~~~~ Print a new scorecard with the updated gameboard ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	cards.printCard2(scores2, totals2);
		
		
	
	
	//~~~~~~~~~~~~~~~~~~~ User Chooses where to play and making sure their play is valid ~~~~~~~~~~~~~~~~~~~
		
	// Have the user pick where they want to play their roll
	System.out.println("Enter the index of which you want to play your roll"
			+ "\n Please choose an index 0-12:"
			+ "\n If you have no valid moves or wish to forfeit your turn, enter -1:");
	
	int chooseGameBoardIndex = keyboard.nextInt();
	
	// IF user enters -1, the turn is over and no action needs to be performed
	if(chooseGameBoardIndex!=-1)
	{
		//create boolean to make sure index is within range and set it to false
		boolean isIndexWithinRange = false;	
		boolean isIndexValid = false;
		
	while(isIndexWithinRange==false || isIndexValid==false) {
	//if the index is in range set the boolean to true
	if(chooseGameBoardIndex>=-1 && chooseGameBoardIndex<=12)
		isIndexWithinRange=true;
	
	// make sure the user chose an index within the range
	while(isIndexWithinRange==false)
	{
		System.out.print("Sorry, that index is not within the specified range"
				+ "\n Please choose another index:"
				+ "\n If you have no valid moves or wish to forfeit your turn, enter -1:");
		chooseGameBoardIndex = keyboard.nextInt();
		if(chooseGameBoardIndex>=-1 && chooseGameBoardIndex<=12)
			isIndexWithinRange=true;
		
	}
	
	// IF user enters -1, the turn is over and no action needs to be performed
	if(chooseGameBoardIndex!=-1)
	{
	
	// MAKE SURE THAT PLAYER HAS NOT ALREADY USED THE INDEX IN A PREVIOUS TURN
			while(wasIndexPlayed2[chooseGameBoardIndex]==true)
			{
				System.out.println("Sorry, you've already played that game board index "
						+ "\n Please choose another index:"
						+ "\n If you have no valid moves or wish to forfeit your turn, enter -1:\"");
				chooseGameBoardIndex = keyboard.nextInt();
			}	
	
	// IF user enters -1, the turn is over and no action needs to be performed
			if(chooseGameBoardIndex!=-1)
			{
			
	// Make sure that the player's index choice is valid for their dice roll
	while(isIndexValid==false)
	{
	
	// Aces
		if(chooseGameBoardIndex==0)
		{
			if(count1>=1)
				isIndexValid=true;
		}
		//Two's
		if(chooseGameBoardIndex==1)
		{
			if(count2>=1)
				isIndexValid=true;
		}
		//Threes
		if(chooseGameBoardIndex==2)
		{
			if(count3>=1)
				isIndexValid=true;
		}
		// Fours
		if(chooseGameBoardIndex==3)
		{
			if(count4>=1)
				isIndexValid=true;
		}
		// Fives
		if(chooseGameBoardIndex==4)
		{
			if(count5>=1)
				isIndexValid=true;
		}
		// Sixes
		if(chooseGameBoardIndex==5)
		{
			if(count6>=1)
				isIndexValid=true;
		}
		//Three of a kind
		if(chooseGameBoardIndex==6)
		{
			if (count1>=3 || count2>=3 || count3>=3 || count4>=3 || count5>=3 || count6>=3)
				isIndexValid=true;
		}
		//Four of a kind
		if(chooseGameBoardIndex==7)
		{
			if (count1>=4 || count2>=4 || count3>=4 || count4>=4 || count5>=4 || count6>=4)
				isIndexValid=true;
		}
		//Full House
		if(chooseGameBoardIndex==8)
		{
			if (((count1>=3 || count2>=3 || count3>=3 || count4>=3 || count5>=3 || count6>=3) &&
					(count1>=2 || count2>=2 || count3>=2 || count4>=2 || count5>=2 || count6>=2)))
				isIndexValid=true;
		}
		//Small Straight
		if(chooseGameBoardIndex==9)
		{
			if((count1>0 && count2>0 && count3>0 && count4>0) || 
			   (count2>0 && count3>0 && count4>0 && count5>0) ||
			   (count3>0 && count4>0 && count5>0 && count6>0))
					isIndexValid=true;
		}
		//Large Straight
		if(chooseGameBoardIndex==10)
		{
			if((count1>0 && count2>0 && count3>0 && count4>0 && count5>0) || 
			   (count2>0 && count3>0 && count4>0 && count5>0 && count6>0))
					isIndexValid=true;
		}
		//Yahtzee
		if(chooseGameBoardIndex==11)
		{
			if (count1==5 || count2==5 || count3==5 || count4==5 || count5==5 || count6==5)
				isIndexValid=true;
		}
		//Chance
		if(chooseGameBoardIndex==12)
			isIndexValid=true;
		
		
		if(isIndexValid)
			break;
		System.out.println("Sorry, based on your dice roll, you cannot play at that index. "
				+ "\nPlease choose another index");
		chooseGameBoardIndex = keyboard.nextInt();
	}
	
	
		

	//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ SCORING ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	//Aces
		if (chooseGameBoardIndex==0)
		{
			scores2[chooseGameBoardIndex] = 1*count1;
			System.out.println("Ace's score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}	
		
	// Two's
		if (chooseGameBoardIndex==1)
		{
			scores2[chooseGameBoardIndex] = 2*count2;
			System.out.println("Two's score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
		
		//Three's
		if (chooseGameBoardIndex==2)
		{
			scores2[chooseGameBoardIndex] = 3*count3;
			System.out.println("Three's score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
		
		// Four's
		if (chooseGameBoardIndex==3)
		{
			scores2[chooseGameBoardIndex] = 4*count4;
			System.out.println("Fours's score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
	
		// five's
		if (chooseGameBoardIndex==4)
		{
			scores2[chooseGameBoardIndex] = 5*count5;
			System.out.println("Five's score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
	
		
		// Six's
		if (chooseGameBoardIndex==5)
		{
			scores2[chooseGameBoardIndex] = 6*count6;
			System.out.println("Six's score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}

		//Three of a kind
		if (chooseGameBoardIndex==6)
		{
			int sum3Kind =0;
			for(int n=0; n< diceArray.length; n++)
			{
			
				sum3Kind = sum3Kind+diceArray[n];
			}
			scores2[chooseGameBoardIndex] = sum3Kind;
			System.out.println("Three of a kind score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}

		// Four of a kind
		if (chooseGameBoardIndex==7)
		{
			int sum4Kind =0;
			for(int n=0; n< diceArray.length; n++)
			{
			
				sum4Kind = sum4Kind+diceArray[n];
			}
			scores2[chooseGameBoardIndex] = sum4Kind;
			System.out.println("Four of a kind score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}

		// Full house
		if (chooseGameBoardIndex==8)
		{
			scores2[chooseGameBoardIndex] = 25;
			System.out.println("full house score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
	
		// Small Straight
		if (chooseGameBoardIndex==9)
		{
			scores2[chooseGameBoardIndex] = 30;
			System.out.println("small straight score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
		
		// Large Straight
		if (chooseGameBoardIndex==10)
		{
			scores2[chooseGameBoardIndex] = 40;
			System.out.println("large straight score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
		
		//Yahtzee
		if (chooseGameBoardIndex==11)
		{
			scores2[chooseGameBoardIndex] = 50;
			System.out.println("yahtzee score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
		
		// Chance
		if (chooseGameBoardIndex==12)
		{
			int sumChance =0;
			for(int n=0; n< diceArray.length; n++)
			{
			
				sumChance = sumChance+diceArray[n];
			}
			scores2[chooseGameBoardIndex] = sumChance;
			System.out.println("Chance score: "+ scores2[chooseGameBoardIndex]);
			wasIndexPlayed2[chooseGameBoardIndex]=true;
		}
		
		//Upper Total 
		int sumUpper=0;
		for(int n=0; n<=5; n++)
		{
		
			 sumUpper = sumUpper+scores2[n];
		}
		totals2[0] = sumUpper; 
		
		// Yahtzee Bonus
		if (wasIndexPlayed2[11]==true && (count1==6 || count2==6 || count3==6 || count4==6 || count5==6 || count6==6))
		{
			totals2[1] = totals2[1]+100;
			System.out.println("!!!!! YAHTZEE BONUS !!!!!");
		}
		
		//Upper Bonus
		if(totals2[0]>=63)
			totals2[2]=35;
		
		//Scoreboard total
		int sumLower=0;
		for(int f=6; f<=12; f++)
			sumLower = sumLower + scores2[f];
		
		totals2[3] = sumLower+ totals2[0] + totals2[1] + totals2[2];
		
	
				
		
		
		
	}
	}
	}
	}
	}		
			
	}	
		
//~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ CHECK TO SEE WHO WON ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
	System.out.println("That's the end of the game, thanks for playing!!");
	
	System.out.println("Player 1 Final Score: " + totals[3]);
	System.out.println("Player 2 Final Score: " + totals2[3]);
	
	if(totals[3]>totals2[3])
		System.out.println("PLAYER 1 WINS!!!");
	else if(totals2[3]>totals[3])
		System.out.println("PLAYER 2 WINS!!!");
	else if(totals2[3]==totals[3])
		System.out.println("It's a draw! You guys are evenally matched!");
		
		
	}
	}
