/*
 * Tyler Beetle
 */
import java.util.Scanner;
public class HotPotatoGameFE {
	public static Scanner keyboard = new Scanner(System.in);
	public static HotPotatoGame hpg = new HotPotatoGame();
	public static final int MIN_TIME = 1;
	public static final int MAX_TIME = 10; 
	public static void main(String[] args) {
		greeting();
		boolean playGame = true;
		while(playGame)
		{
			hpg.resetTime();
			int numPlayers = getNumberOfPlayers();
			addPlayers(numPlayers);
			boolean gameOver = false;
			while(!gameOver)
			{
				String player = hpg.getCurrentPlayer();
				System.out.println(player+" enter a time to hold the potato from ");
				int time = keyboard.nextInt();
				keyboard.nextLine();
				if(time < MIN_TIME || time > MAX_TIME)
				{
					System.out.println("Thats invalid. I'm going to assume you meant "+MAX_TIME);
					time = MAX_TIME;
				}
				if(hpg.hasLost(time))
				{				
					System.out.println("Player "+player+" has been eliminated!");
					hpg.resetTime();
				}
				else
				{
					hpg.addPlayer(player);
				}
				gameOver = hpg.getWin();
			}
			System.out.println("The winner is "+hpg.getCurrentPlayer());
			System.out.println("Enter yes to player again");
			String input = keyboard.nextLine();
			playGame = input != null && input.equalsIgnoreCase("yes");
		}

	}
	public static void greeting()
	{
		System.out.println("Welcome to the Hot Potato Game");
	}
	public static int getNumberOfPlayers()
	{
		int num = 0;
		while(num <= 1)
		{
			System.out.println("Enter the number of players. Must be greater than 1");
			num = keyboard.nextInt();
		}
		return num;
	}
	public static void addPlayers(int num)
	{
		int i = 0;
		while(i < num)
		{
			System.out.println("Enter your name player"+i);
			String input = keyboard.nextLine();
			if(input == null || input.isEmpty())
			{
				System.out.println("That's invalid");
				continue;
			}
			else
			{
				hpg.addPlayer(input);
			}
			i++;
		}
	}

}
