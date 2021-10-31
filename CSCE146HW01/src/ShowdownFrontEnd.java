/*
 * Written by Tyler Beetle
 */
import java.io.IOException;
import java.util.Scanner;
public class ShowdownFrontEnd {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Showdown game = new Showdown();
		
		while(true)
		{
			System.out.println("Welcome To Showcase...SHOWDOWN!!!\nYour prizes are:\n");
			
			
			Prize[] randomPrize = game.randomPrize();//Creates a new instance of the class prize for the instance of the Showdown class called game   
			double prizePrice = 0.0; 
			
			for(int i=0; i<randomPrize.length; i++)
			{
				System.out.println(randomPrize[i].getThing());
				prizePrice = prizePrice + randomPrize[i].getPrice();
			}
			System.out.println("\nNow... You must estimate how much all of your items cost together and you cannot go over.\nYour estimate can be within 2000 of the actual value.\n Hit me with your best guess!");
			double estimate = keyboard.nextDouble();
			
			double range = prizePrice-estimate;//Determines the difference between the inputed guess and the actual sum of prizes
			if(Math.abs(prizePrice-estimate) <= 2000)
				System.out.println("Your guess of "+estimate+" is "+range+" from the actual value of "+prizePrice+" so... YOU WIN!!!" );

			else
				System.out.println("Your guess of "+estimate+" is "+range+" from the actual value of "+prizePrice+" so... YOU LOSE :(" );
			
			System.out.println("Would you like to play again?\n type 'yes' or 'no'");
			
			String restart = keyboard.next();
			if(restart.equalsIgnoreCase("no"))//Determines if the user decided to restart the game or not
			{
				System.out.println("See you next time!");
				break;
			}
		}

	}

}
