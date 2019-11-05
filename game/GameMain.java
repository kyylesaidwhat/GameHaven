import java.util.Scanner;
public class GameMain {

	// Constants
	final int boardlen = 20;
	
	public static void main(String[] args)
	{

		int playerPos = 0;
		int cpuPos = 0;
		int move = 0;
		
		Turns turn = new Turns();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Welcome to the Theme Park! In this game, you will answer math questions to get to the roller coaster. Your goal is to beat the CPU to the roller coaster!");
		
		do
		{
		move = turn.playerTurn();
		playerPos += move;
		System.out.println("You have moved " + move + " spaces.");
		if (playerPos >= 20)
		{
			System.out.println("You win!");
			break;
		}
		
		move = turn.cpuTurn();
		cpuPos += move;
		System.out.println("CPU has moved " + move + " spaces.");
		
		if(cpuPos >= 20)
		{
			System.out.println("CPU wins!");
			break;
		}
		
		System.out.println("Player: " + playerPos + "     CPU: " + cpuPos);
		
		}
		while (playerPos < 20 && cpuPos < 20);
		
		System.out.println("end");
	

	}
	
	

}
