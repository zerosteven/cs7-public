package src;
import java.lang.Math;
import java.util.Random;
import java.text.DecimalFormat;
/* General note 1:
 * To call a HELPER function from a PROBLEM function, you can simply use the name of the
 * function to call it, rather than needing a variable.  Or, if you prefer keeping the
 * tradition of using a variable, use the keyword "this" instead.
 * EX:
 * getStringFromConsole("Yes or no?");
 * OR
 * this.getStringFromConsole("Yes or no?");
 *
 * General note 2:
 * For all PROBLEM functions, you will typically be asked to return the dollar amount that
 * the player wins, unless otherwise specified.
 *
 * General note 3:
 * For all PROBLEM functions, if the user types in an invalid response, the user should be
 * asked again to input a valid repsonse, until the user provides a valid response.
 */
public class Project1
{
	//DO NOT TOUCH---------------------------------
	protected Scanner scan;

	public Project1()
	{
		this.scan = new Scanner(System.in);
	}
	//DO NOT TOUCH---------------------------------

	/* Main Method
	 * Test your code by calling your functions here
	 */
	public static void main(String[] args)
	{
		//DO NOT TOUCH
		Project1 gameShow = new Project1();

		// Test Problem 1
		Random generator = new Random();
		quickieDeal1(generator);



		//To test, use the following template:
		//gameShow.functionName(params);
	}

	/* EXAMPLE PROBLEM FUNCTION
	 * This function serves as an example for the expected usage of the HELPER
	 * functions.
	 * The announcer chooses a number from 1 to 10.
	 * The player is expected to guess the number, and is told the range of numbers.
	 * If the player's number is lower, the announcer will say the guess was low.
	 * If the player's number is higher, the announcer will say the guess was high.
	 * If the player's number was correct, the announcer will congratulate the player.
	 * The player will continue to guess until they get the exact number.
	 * The player will start with 1000 dollars.
	 * For every wrong answer, the player will lose 100 dollars.
	 * Once the player guesses the number, the player will win the remaining amount of
	 * money.
	 * The player cannot lose money, even if another wrong guess would reduce the
	 * potential winnings into a negative value.
	 */
	public double guessTheNumber(Random rand)
	{
		//initialization of useful constants for the game
		final String prompt = "Guess my integer between 1 and 10:";
		final String errMsg = "That's not an integer...";
		final String badRange = "That number isn't in the range!";
		final int lowNum = 1;
		final int highNum = 10;

		//initializing game-playing information
		final int correctNum = getRandomInt(rand, lowNum, highNum);
		int playerNum = -1;
		double winnings = 1100.0;
		System.out.println("I have chosen a random integer between " + lowNum + " and " + highNum + ", inclusive!");

		//keep playing until the player guesses the correct number
		while (playerNum != correctNum)
		{
			winnings -= 100.0;
			playerNum = getIntFromConsole(prompt, errMsg, badRange, lowNum, highNum);
			//display the correct "wrong" message
			if(playerNum < correctNum)
			{
				System.out.println("That's too low!");
			}
			else if(playerNum > correctNum)
			{
				System.out.println("That's too high!");
			}
		}
		
		//player can't win negative amounts of money
		if(winnings < 0.0)
		{
			winnings = 0.0;
		}
		
		System.out.println("Correct!!!  You won $" + winnings + "!!!");
		return winnings;	
	}

	/* HELPER
	 * Checks if a String can be converted into an non-negative integer.
	 * The String must then be composed of only the digits 0 through 9.
	 */
	public boolean isInteger(String str)
	{	try 
		{  
    		Double.parseDouble(str);  
    		return true;
 		} 

 		catch(NumberFormatException e);
 		{ 
			return false;
		}
	}

	/* HELPER
	 * Checks if a String can be converted into a non-negative dollar amount.
	 * The String must be composed of only the digits 0 through 9, and possibly one
	 * decimal point ".".
	 * If a decimal point exists, only up to two digits may come after the decimal point.
	 * Values of less than one dollar may start with a 0 or with a decimal point.
	 */
	public boolean isDollarAmount(String str)
	{
		return false;
	}

	/* HELPER
	 * Prompts the user for input as a String.
	 */
	public String getStringFromConsole(String prompt)
	{	
		System.out.print(prompt);
		return scan.nextLine();
	}

	/* HELPER
	 * Prompts the user for input as a non-negative integer.
	 * It is recommended to convert the String from the console into an integer, rather
	 * than reading an integer directly from the console.
	 * If the user attempts to provide an input that is not an integer, the error message
	 * errorMsg should be displayed, and then re-prompt the user for input.
	 */
	public int getIntFromConsole(String prompt, String errorMsg)
	{
		System.out.print(prompt);
		
		x = scan.nextLine();

		int number = Integer.parseInt(x);
		
		return -1;
	}

	/* HELPER
	 * Prompts the user for input as an integer within the lower bound and upper bound,
	 * inclusive.
	 * It is recommended to convert the String from the console into an integer, rather
	 * than reading an integer directly from the console.
	 * If the user attempts to provide an input that is not an integer, the error message
	 * errorMsg should be displayed, and then re-prompt the user for input.
	 * If the user attempts to provide an input that is not within the range specified,
	 * the error message badRange should be displayed, and then re-prompt the user for
	 * input.
	 * The integer lowerBound should not be less than 0, and upperBound should be greater
	 * than or equal to lowerBound.
	 */
	public int getIntFromConsole(String prompt, String errorMsg, String badRange, int lowerBound, int upperBound)
	{	
		int x;
		x = scan.nextLine();
		if(x)


		return -1;
	}

	/* HELPER
	 * Prompts the user for input as a dollar value.
	 * It is recommended to convert the String from the console into a double, rather
	 * than reading a double directly from the console.
	 * If the user attempts to provide an input that is not a double, the error message
	 * errorMsg should be displayed, and then re-prompt the user for input.
	 */
	public double getDollarValueFromConsole(String prompt, String errorMsg)
	{	
		boolean invalid = (x != 1 && x != 2 && x != 3); //evaluates true if invalid

		while (invalid)
		{
			System.out.print("Please enter your guess again: ");
			x = scan.nextInt();

			if (x == 1 || x == 2 || x == 3)
			{
				invalid = false;
			}
		}

		return -1.0;
	}

	/* HELPER
	 * Prompts the user for input as a dollar value within the lower bound and upper 
	 * bound, inclusive.
	 * It is recommended to convert the String from the console into a double, rather
	 * than reading a double directly from the console.
	 * If the user attempts to provide an input that is not a double, the error message
	 * errorMsg should be displayed, and then re-prompt the user for input.
	 * If the user attempts to provide an input that is not within the range specified,
	 * the error message badRange should be displayed, and then re-prompt the user for
	 * input.
	 * The double lowerBound should not be less than 0.0, and upperBound should be
	 * greater than or equal to lowerBound.
	 */
	public double getDollarValueFromConsole(String prompt, String errorMsg, String badRange, double lowerBound, double upperBound)
	{
		return -1.0;
	}

	/* HELPER
	 * Generate a random integer in the given range, inclusive.
	 */
	public int getRandomInt(Random rand, int lowerBound, int upperBound)
	{
		int randomNum = rand.nextInt((upperBound - lowerBound) + 1) + lowerBound;
		
		return randomNum;
	}

	/* HELPER
	 * Generate a random monetary amount in the given range, inclusive.
	 * Note that this should be able to generate monetary values between whole-dollar
	 * amounts, limited to two decimal places (e.g. 1.23, 4.56, etc.).
	 */
	public double getRandomDollarValue(Random rand, double lowerBound, double upperBound)
	{
		
		double randomNum = rand.nextDouble((upperBound - lowerBound) + 1) + lowerBound;

		DecimalFormat df = new DecimalFormat("0.00");  

		double monetaryAmount = Double.valueOf(df.format(monetaryAmount));

		return monetaryAmount;
	}

	/* HELPER
	 * Generate a random boolean.
	 */
	public boolean getRandomBoolean(Random rand)
	{
		Random random = new Random();
   	
   		return random.nextBoolean();

	
	}

	/* PROBLEM 0
	 * From "Let's Make a Deal": Quickie Deals #0
	 * The player (user) is asked to guess a number between 0 to 9, inclusive.
	 * Given a serial number, which consists of 8 characters, the player wins 100
	 * dollars for every time the serial number contains the selected digit.
	 * Return -1.0 if the serial number does not contain 8 characters.
	 */
	public double quickieDeal0(String serialNumber)
	{
		if(String.length(serialNumber) != 8) return -1.0; 
		int playerGuess; 
		System.out.print("Guess a number 0-9: ");

		double winnings = 0;
		for (int i = 0; i<8; i++) { 
			// Add 100 to winnings if character == playerGuess
		}
	}


	/* PROBLEM 1
	 * From "Let's Make a Deal": Quickie Deals #1
	 * The announcer (program) randomly holds one of three amounts of money in their
	 * hand: 100, 200, or 300 dollars.
	 * The player must guess how much money the announcer is holding, by specifying
	 * the number of 100 dollar bills (1, 2, or 3).
	 * If they are correct, the player wins that amount.
	 * If they are wrong, they get nothing.
	 */
	public double quickieDeal1(Random rand)
	{	
		getStringFromConsole("Please enter your guess: ");
		int x = scan.nextInt();
		getRandomInt(rand,1,3);
		boolean invalid = (x != 1 && x != 2 && x != 3); //evaluates true if invalid

		while (invalid)
		{
			System.out.print("Please enter your guess again: ");
			x = scan.nextInt();

			if (x == 1 || x == 2 || x == 3)
			{
				invalid = false;
			}
		}

		if (x == 1 && random == 1)
		{
			System.out.println("You're correct and you win 100 dollars!");
			return 100.0;
		}

		else if (x == 2 && rand == 2)
		{
			System.out.println("You're correct and you win 200 dollars!");
			return 200.0;
		}

		else if (x == 3 && rand == 3)
		{
			System.out.println("You're correct and you win 300 dollars!");
			return 300.0;
		}

		else if (x != random)
		{
			System.out.println("You're wrong and you get nothing.");
			return -1.0;
		}
	}

	/* PROBLEM 2
	 * From "Let's Make a Deal": Trading Deal
	 * The announcer gives the player an envelope containing a random amount of money
	 * between 1 to 2,000 dollars.
	 * The player then gets a choice to exchange that envelope for something inside
	 * The Box, by declaring "exchange", or they can keep the envelope by declaring
	 * "keep".
	 * The Box has an equal chance of being a prize, or a ZONK, which means the
	 * player does not win anything.
	 * (To implement the above sentence, use getRandomBoolean, where true == prize
	 * and false == ZONK).
	 * If it is a prize, the prize is typically worth between 2-3 times more than the
	 * envelope's worth.
	 */
	public double tradingDeal(Random rand)
	{
		//Copied these from the example given
		final String opening = "Here is an envelope with a random amount of money between 1 and 2,000 dollars inclusive!";
		final String prompt = "Do you want to exchange or keep?";
		final String errMsg = "That's not 'exchange' or 'keep'...";
		
		final double envelope = getRandomDollarValue(rand, 1, 2000);
		final double lowNum = 2*envelope;
		final double highNum = 3*envelope; 
		final String userResponse= getStringFromConsole();
		final String answer = userResponse.toLowerCase();
		final double prize = getRandomDollarValue(rand, lowNum, highNum);
		
		
		if (answer.equals("keep"))
		{
			System.out.println("Congratulations! You have won " + envelope + " dollars!");			
		}
		else if (answer.equals("exchange"));
		{
			boolean theBox= getRandomBoolean(rand);
			if(theBox==true)
			{
				System.out.println("Congratulations! You have won " + prize + " dollars!");
				return prize;
			}
			else 
			{
				System.out.println("I am sorry, you have gotten ZONK! You don't win anything!");
				return 0;
			}
		}
		else
		{
			System.out.println(errMsg);
			return 0;
		}
		return -1.0;
	}

	/* PROBLEM 3
	 * From "Let's Make a Deal": Malfunctioning ATM
	 * The announcer showcases an ATM and presents the player with a debit card.
	 * The player can choose to "insert" the debit card to withdraw a random amount of
	 * money, or "stop" withdrawing.
	 * If the player decides to "insert" the card, then the player will randomly receive 
	 * between 0 and 1,000 dollars.
	 * If the player decides to "stop", the player gets to keep all of the money they
	 * withdrew previously.
	 * However, the player cannot "insert" the card forever.
	 * Before the game begins, the ATM is given a randomly chosen limit to the number of
	 * times the player can "insert" the card, between 4 to 10 times.
	 * If the player attempts to "insert" the card after the randomly chosen limit, then
	 * the player has overdrawn, and must forfeit all of their money.
	 */
	public double malfunctioningATM(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 4
	 * From "Let's Make a Deal": Cumulative Dice
	 * The announcer gives the player a dice to throw.
	 * The dice has only three possible values, 0, 1, and 2, each with an equal chance
	 * of being thrown.
	 * The player has 5 rolls to sum to 7.
	 * If the sum of all of the rolls is 7 or more, the player wins a car worth between
	 * 18,000 to 27,000 dollars.
	 * However, after each roll, the player can either "stop" or "continue".
	 * If the player chooses to stop, the player receives money equal to the sum of the
	 * dice at that point multiplied by 100.
	 * As an example, if the player has rolled 1, 0, and 2, in three rolls, and chooses
	 * to "stop", the player will receive 300 dollars.
	 * If the player chooses to "continue", then the player gets to roll the dice again.
	 * If the player reaches the fifth roll, and does not reach the sum of 7, then the
	 * player does not win any money.
	 * If the player reaches the sum 7 before all 5 rolls, then the player automatically
	 * wins the car, and no more dice will be rolled.
	 *
	 * NOTE: For GradeScope to work correctly, generate the value of the car first, even
	 * if the player does not win it.
	 */
	public double cumulativeDice(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 5
	 * From "The Price Is Right": One Bid
	 * The announcer selects four people from the audience, and randomly selects one set
	 * of products.
	 * Each contestant in order, starting from contestant 0, to contestant 3,
	 * guesses the price of the full set, in whole dollar increments only.
	 * If a contestant enters a bid that is exactly the same as a previous contestant,
	 * reject the bid and ask the same contestant to enter a new bid.
	 * The set of products can range from 100 dollars to 5000 dollars, but in whole
	 * dollar increments only.
	 * The contestant who has the closest guess to the actual price WITHOUT exceeding
	 * it wins.
	 * The function returns the name of the winner.
	 * If every contestant's guess exceeded the actual price, then a new set of products
	 * is chosen to repeat the process with the same contestants. 
	 */
	public String oneBid(Random rand, String contestantName0, String contestantName1, String contestantName2, String contestantName3)
	{
		return "";
	}

	/* PROBLEM 6 - BONUS
	 * From "The Price Is Right": Pathfinder
	 * The player stands in the center of a 5x5 board.
	 * Each space in the board has a digit from 0 - 9.
	 * The board will always look like the following:
	 * 9 8 9 7 9
	 * 7 4 3 2 5
	 * 5 2 1 4 7
	 * 6 3 5 6 8
	 * 8 9 7 5 9
	 * The announcer has randomly chosen a series of 5 spaces touching each other on the 
	 * board, starting from the center, which makes up the correct price of a car.
	 * The player must decide in which direction to move, "up", "down", "left", or
	 * "right".
	 * If the player guesses correctly, they move to that space, and must guess where to 
	 * move next.
	 * The player (and the announcer's choice) may not move back on themselves.
	 * As an example, if the player correctly guesses "right" from the start, the player
	 * will not be allowed to move "left".
	 * This also applies to circles.
	 * As another example, if the player from the start correctly guesses "right", then 
	 * "up", then "left", the player may not move "right" or "down".
	 * The player wins a car with the given path value if they correctly guess the five
	 * spaces that the announcer chose.
	 * As an example, if the correct path is "right", "up", "up", "right", then the
	 * player wins a car worth 14,279 dollars.
	 * The player can make up to three mistakes.
	 * If the player guesses incorrectly, they do not move to that space.
	 * They stay at the same place and the incorrect choice is no longer a valid choice.
	 * If the player guesses incorrectly 4 times, they do not win anything.
	 */
	public double pathfinder(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 7
	 * From "The Price Is Right": Check Game
	 * The announcer selects a prize set worth between 1,000 and 7,000 dollars.
	 * The player is presented with a blank check, and asked to write a number.
	 * If the value of the prize set and the value of the check added together is
	 * between 8,000 and 9,000 dollars, the player wins the prize set and the check.
	 * If the value does not sum to a number between the range, then the player does not
	 * win anything.
	 */
	public double checkGame(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 8
	 * From "The Price Is Right": Check-Out
	 * The announcer presents 5 grocery items, each worth between 50 cents (0.50
	 * dollars) and 3 dollars.
	 * The player is asked to guess the value of each of the 5 grocery items, and is
	 * told that the grocery items are valued in the range given above.
	 * The differences between each guess and the grocery item is summed together,
	 * where the sign of the difference is discarded (i.e. it doesn't matter if the
	 * guess is higher or lower than the actual value, but the value is summed). 
	 * If that sum is less than 2 dollars, then they win a prize valued between 100 and
	 * 1,000 dollars.
	 * If the sum is more than 2 dollars, they win all five grocery items.
	 *
	 * NOTE: For GradeScope to work correctly, generate the value of the prize first, 
	 * even if the player does not win it.
	 */
	public double checkOut(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 9
	 * From "The Price Is Right": Flip Flop
	 * The announcer selects a random prize worth between 1,000 and 9,999 dollars.
	 * The announcer then provides two blocks to the player, each with two digits that
	 * can make up the value of the random prize.
	 * Assume the first block is labeled A and the second block is labeled B.
	 * (You should select the assignment of the digits to the blocks by using
	 * getRandomBoolean, where true indicates the first two digits of the number are
	 * assigned to block A, and false indicates the last two digits of the number are
	 * assigned to block A.)
	 * The player can now choose the order of the blocks in an attempt to guess the
	 * value of the prize.
	 * If the player says "flip", then the order of the blocks will be AB.
	 * If the player says "flop", then the order of the blocks will be BA.
	 * If the digits displayed in the order the player chooses is the value of the
	 * prize, then the player wins the prize.
	 * Otherwise, the player wins nothing.
	 * As an example, assume the prize is worth 1,234 dollars.  Assume block A is 12 and
	 * block B is 34.
	 * If the player says "flip", then the player wins.
	 * You may conveniently ignore the fact that there will be obvious winners.
	 * As an example, for a prize worth 9,999, the blocks will both have the digits 99, 
	 * and no matter if the player says "flip" or "flop", the player will win.
	 *
	 * NOTE: For GradeScope to work correctly, generate the value of the prize first, 
	 * before generating block assignment.
	 */
	public double flipFlop(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 10 - BONUS
	 * From "The Price Is Right": Line 'em Up (mini)
	 * The announcer randomly selects three prizes, one car worth 13,000 to 27,000 
	 * dollars, in whole dollar increments, another prize worth 100 to 999 dollars,
	 * also in whole dollar increments, and one last prize worth 1 dollar to 9.99
	 * dollars (obviously not in whole dollar increments).
	 * The player now must guess a digit between 0 and 9.
	 * For every digit that is found in the value of each prize, that digit is shown.
	 * If every digit of an item is shown, the game is over, and the player wins that
	 * prize.
	 * If more than one prize has every digit showing after a guess, then the player
	 * wins the prize with the higher value.
	 */
	public double lineEmUpMini(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 11
	 * From "The Price Is Right": More or Less
	 * The announcer randomly selects three prizes, one prize worth 1 dollar to 9.99
	 * dollars, another prize worth 100 to 999 dollars, and one car worth 10,000 to
	 * 30,000 dollars.
	 * The announcer declares a random dollar value in the range of the cheapest prize, 
	 * and the player must guess if this value is "more" or "less" than the value of the
	 * cheapest prize.
	 * If the player is right, then the announcer declares a new random dollar value in 
	 * the range of the next prize up, repeating the process, and again for the last one.
	 * If the player is wrong, then the game ends, and the player wins all of the prizes
	 * that he or she was correct on.
	 * Note that it is possible that the announcer's value may be exactly the same as the 
	 * value of the prize.
	 * In this case, no matter what the player says, the player should always be
	 * considered to be making the correct choice.
	 * 
	 * NOTE: For GradeScope to work correctly, generate the value of the prizes first, 
	 * in the order provided above, before generating random announcer values.
	 */
	public double moreOrLess(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 12 - BONUS
	 * From "The Price Is Right": One Away
	 * The announcer randomly selects one car worth 10,000 to 50,000 dollars, in whole
	 * dollar increments only.
	 * The announcer declares a value of the car, where each digit is one digit away from
	 * the actual value of the car.
	 * The player must guess for each digit of the announcer's value if it is "higher" or 
	 * "lower" by one.
	 * Once the player has guessed "higher" or "lower" for each digit, then the actual
	 * value of the car is revealed.
	 * The player wins the car only if the resulting new value after changing each digit
	 * is exactly the same as the value of the car.
	 * Note that it is possible that the random value declared by the announcer may only
	 * have an obvious solution (e.g. it only makes sense for the player to declare
	 * "higher" when the digit is 0), but we conveniently ignore these scenarios when
	 * the announcer generates the value.
	 * If the player makes a mistake in this obvious case, the program should provide a
	 * special lose message.
	 */
	public double oneAway(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 13 - BONUS
	 * From "The Price Is Right": Push Over
	 * The announcer randomly selects a prize worth between 1,000 and 9,999 dollars, in
	 * whole dollar increments only.
	 * The announcer places 9 blocks in a line, each block containing a digit.
	 * A window lies on the right side, which can hold four blocks.
	 * The player can choose to push the line of blocks to discard blocks on the right, 
	 * up until only four blocks remain.
	 * If the value of the prize is found in the window, the player wins.
	 * Note that you must guarantee that the value of the prize must be somewhere in the
	 * blocks, so that the player has a chance to win.
	 * The other blocks are then random digits.
	 */
	public double pushOver(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 14
	 * From "The Price Is Right": Shopping Spree
	 * The announcer randomly choose four items, all ranging from 10 to 100 dollars each.
	 * The announcer also randomly selects a threshold value, between 30 and 300 dollars.
	 * The player must select three out of the four items, by declaring the items with
	 * the number representing the order in which they were generated (i.e. 1 -->
	 * select the first item, etc.).
	 * If the total value of the three items exceeds the threshold, then the player wins
	 * all four prizes.
	 * If not, then the player does not win anything.
	 * Note that there may be obvious cases in which the player will always win or always
	 * lose.
	 * You may ignore considering these cases.
	 *
	 * NOTE: For GradeScope to work correctly, generate the value of the prizes first, 
	 * before the threshold.
	 */
	public double shoppingSpree(Random rand)
	{
		return -1.0;
	}

	/* PROBLEM 15
	 * From "The Price Is Right": Showcase Showdown
	 * Three people are selected to play this game.
	 * The first contestant will have up to two chances to spin a large wheel.
	 * The wheel has several faces that contain monetary values, starting at 5 cents
	 * (0.05 dollars), up to 1 dollar, in 5 cent increments.
	 * The goal is to reach exactly 1 dollar, or get as close to it without going over.
	 * After the first spin, the contestant has the option to "spin" again or "keep" what
	 * they already earned.
	 * If the contestant does not exceed 1 dollar, the score is then held.
	 * The next contestant then has the ability to spin twice as well, with the same
	 * rules, and same occurs with the last contestant.
	 * The winner is declared by the following rules:
	 * 1.  The contestant with a score closest to 1 dollar without going over wins.
	 * 2.  If two or more contestants have the same amount of money, priority is given
	 *     to the contestant who spun the fewest number of times to achieve the score.
	 * 3.  If the number of spins is the same, priority is given to the contestant who
	 *     played first.
	 * Note that if the first two contestants both exceed 1 dollar, the third contestant
	 * can automatically be declared the winner without spinning.
	 *
	 * HINT: The easier way to randomly select 5 cent increments is by generating a
	 * random integer, then multiplying by 5 cents.
	 *
	 * NOTE0: For GradeScope to work correctly, do not generate a random value for the
	 * second spin if the player decides not to spin a second time.
	 *
	 * NOTE1: For GradeScope to work correctly, follow the hint.
	 */
	public String showcaseShowdown(Random rand, String contestantName0, String contestantName1, String contestantName2)
	{
		return "";
	}
}


