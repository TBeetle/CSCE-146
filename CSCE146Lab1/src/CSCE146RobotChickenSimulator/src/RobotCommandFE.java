/*
 * Written by Tyler Beetle
 */
import java.util.Scanner;
public class RobotCommandFE {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		RobotCommand Simulation = new RobotCommand();
		System.out.println("Hello and Welcome to the Robot Command Simulator!");
		boolean check = false;//Establishes a boolean so that the user can quit the program after a complete run through whenever they want to 
		
		while(check == false)
		{
			//Prompts the user to input the board file and robot commands they want to use for the simulation and then stores them 
			System.out.println("Enter the file you would like to use for the Board");
			String fileName = keyboard.nextLine();
			System.out.println("Enter the file you would like to use for the Robot Commands");
		
		String commName = keyboard.nextLine();
		
		System.out.println("Let the Simulation begin!");
		Simulation.init(fileName);
		Simulation.move(commName);
		System.out.println("Simulation End\nQuit? type 'true' to exit or hit enter to go again");
		String decision = keyboard.nextLine();
			if(decision.equalsIgnoreCase("true"))
			{
				System.out.println("See you later!");
				break;
			}
		}
	}

}
