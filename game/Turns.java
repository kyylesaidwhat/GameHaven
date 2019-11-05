import java.util.Scanner;
import java.util.Random;
public class Turns {

	// Constants
	final int NUM_DIF = 6; // Number of difficulties
	
	public int playerTurn() 
	{
		//Variables
		String userIn = "";
		int userInt = 0;
		int spaceMove = 0;
		int questionNum = 0;
		int questionAns = 0;
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		String[] diff1 = {"1Q1", "1", "1Q2", "2", "1Q3", "3"};  
		String[] diff2 = {"2Q1", "1", "2Q2", "2", "2Q3", "3"};
		String[] diff3 = {"3Q1", "1", "3Q2", "2", "3Q3", "3"};
		String[] diff4 = {"4Q1", "1", "4Q2", "2", "4Q3", "3"};
		String[] diff5 = {"5Q1", "1", "5Q2", "2", "5Q3", "3"};
		String[] diff6 = {"6Q1", "1", "6Q2", "2", "6Q3", "3"};
		
		// Get a number between 1 and 6
		do 
		{
		System.out.println("Please select a number between 1 and " + NUM_DIF + ". This will be the amount you move if you get the question correct.");
		userIn = scan.next();
		userIn.trim();
		userInt = Integer.valueOf(userIn);
		
		}
		while (userInt <= 0 || userInt > NUM_DIF);
		spaceMove = userInt;
		
		// Get a question to ask
		switch(userInt)
		{
		case 1:
			questionNum = rand.nextInt(diff1.length);
			if ( (questionNum % 2) == 1)
				questionNum = questionNum - 1;
			questionAns = questionNum +1;
			// Ask question and get answer
			System.out.println("Please answer to following:");
			System.out.println(diff1[questionNum]);
			userIn = scan.next();
			userIn.toLowerCase();
			userIn.trim();
			
			//Check Answer
			if (userIn.equals(diff1[questionAns]))
			{
				System.out.println("You got it correct!");
				return spaceMove;
			}
			else
				System.out.println("You got it wrong.");
			return 0;
			
		case 2:
			questionNum = rand.nextInt(diff2.length);
			if ( (questionNum % 2) == 1)
				questionNum = questionNum - 1;
			questionAns = questionNum +1;
			// Ask question and get answer
			System.out.println("Please answer to following:");
			System.out.println(diff2[questionNum]);
			userIn = scan.next();
			userIn.toLowerCase();
			userIn.trim();
			
			//Check Answer
			if (userIn.equals(diff2[questionAns]))
			{
				System.out.println("You got it correct!");
				return spaceMove;
			}
			else
				System.out.println("You got it wrong.");
			return 0;
			
		case 3:
			questionNum = rand.nextInt(diff3.length);
			if ( (questionNum % 2) == 1)
				questionNum = questionNum - 1;
			questionAns = questionNum +1;
			// Ask question and get answer
			System.out.println("Please answer to following:");
			System.out.println(diff3[questionNum]);
			userIn = scan.next();
			userIn.toLowerCase();
			userIn.trim();
			
			//Check Answer
			if (userIn.equals(diff3[questionAns]))
			{
				System.out.println("You got it correct!");
				return spaceMove;
			}
			else
				System.out.println("You got it wrong.");
			return 0;
			
		case 4:
			questionNum = rand.nextInt(diff4.length);
			if ( (questionNum % 2) == 1)
				questionNum = questionNum - 1;
			questionAns = questionNum +1;
			// Ask question and get answer
			System.out.println("Please answer to following:");
			System.out.println(diff4[questionNum]);
			userIn = scan.next();
			userIn.toLowerCase();
			userIn.trim();
			
			//Check Answer
			if (userIn.equals(diff4[questionAns]))
			{
				System.out.println("You got it correct!");
				return spaceMove;
			}
			else
				System.out.println("You got it wrong.");
			return 0;
			
		case 5:
			questionNum = rand.nextInt(diff5.length);
			if ( (questionNum % 2) == 1)
				questionNum = questionNum - 1;
			questionAns = questionNum +1;
			// Ask question and get answer
			System.out.println("Please answer to following:");
			System.out.println(diff5[questionNum]);
			userIn = scan.next();
			userIn.toLowerCase();
			userIn.trim();
			
			//Check Answer
			if (userIn.equals(diff5[questionAns]))
			{
				System.out.println("You got it correct!");
				return spaceMove;
			}
			else
				System.out.println("You got it wrong.");
			return 0;
			
		case 6:
			questionNum = rand.nextInt(diff6.length);
			if ( (questionNum % 2) == 1)
				questionNum = questionNum - 1;
			questionAns = questionNum +1;
			// Ask question and get answer
			System.out.println("Please answer to following:");
			System.out.println(diff6[questionNum]);
			userIn = scan.next();
			userIn.toLowerCase();
			userIn.trim();
			
			//Check Answer
			if (userIn.equals(diff6[questionAns]))
			{
				System.out.println("You got it correct!");
				return spaceMove;
			}
			else
				System.out.println("You got it wrong.");
			return 0;
			
		}
		
		
		
		
		
		System.out.println("TestEnd");
		return 0;
	}
	
	public int cpuTurn()
	{
		Random rand = new Random();
		
		// Determine how many spaces Cpu might move
		int spaceMove = rand.nextInt(6);
		spaceMove += 1;
		
		//Determine if cpu will move
		int intMove = rand.nextInt();
		
		if ( (intMove % 2) == 1)
		{
			return spaceMove;
		}
				
		return 0;
		
	}

}
