/*
 * Written by Tyler Beetle
 */
import java.util.Scanner;
public class VectorMathFrontEnd {
	
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args) {
		
			boolean quit = false;//Used a Boolean to track when to restart the program after an operation and when the user wanted to quit
			while(!quit)
		{
			System.out.print("Welcome to the Vector Math Program! Let's Do some Vector Math!");
			
			Scanner keyboard = new Scanner(System.in);
			System.out.println("\n Enter '1' to Add Vectors\n Enter '2' to Subtract Vectors\n Enter '3' to Find the Magnitude of a Vector\n Enter '4' to quit ");
			int choice = keyboard.nextInt();//Created a variable to track what operation the user picks to conduct
			if(choice == 1)
			{
					System.out.println("Lets Add some Vectors! Enter how big you want your vectors to be");
					int vectorSize = keyboard.nextInt();
					if(vectorSize > 0 )
						{
						double vectorU[] = new double[vectorSize];//Established an empty array to store one of the two vectors 
						double vectorV[] = new double[vectorSize];
						
						System.out.println("Enter the value of the vector u");
						for(int i = 0;i<vectorSize; i++ )
						{
							vectorU[i] = keyboard.nextDouble();
						}
						System.out.println("Enter the value of the vector v");
						for(int i = 0;i<vectorSize; i++ )
						{
							vectorV[i] = keyboard.nextDouble();
						}
						double vectorUandV[] = new double[vectorSize*2];
						for(int i =0;i<vectorSize; i++)
						{
							vectorUandV[i] = vectorU[i] + vectorV[i];  
						}
						for(int i=0; i<vectorSize; i++)
						{	
						System.out.println("Vector u+v: "+vectorU[i]);
						}
						for(int i=0; i<vectorSize; i++)
						{	
						System.out.println("+ "+vectorV[i]);
						}
						for(int i=0; i<vectorSize; i++)
						{	
						System.out.println("= "+vectorUandV[i]);
						}
					
						}
					else
					{
						System.out.println("That is not a valid size!");
						
					}
				}
			if(choice == 2)
			{
					System.out.println("Lets Subtract some Vectors! We will calculate u-v. Enter how big you want your vectors to be");
					int vectorSize = keyboard.nextInt();
				if(vectorSize > 0 )//Created an if statement followed by an else statement in order to check to see if the user inputed size was valid
					{
					double vectorU[] = new double[vectorSize];
					double vectorV[] = new double[vectorSize];
					
					System.out.println("Enter the value of the vector u.");
					for(int i = 0;i<vectorSize; i++ )
					{
						vectorU[i] = keyboard.nextDouble();
					}
					System.out.println("Enter the value of the vector v");
					for(int i = 0;i<vectorSize; i++ )
					{
						vectorV[i] = keyboard.nextDouble();
					}
					double vectorUminusV[] = new double[vectorSize*2];
					for(int i =0;i<vectorSize; i++)
					{
						vectorUminusV[i] = vectorU[i] - vectorV[i];  
					}
					for(int i=0; i<vectorSize; i++)
					{	
					System.out.println("Vector u-v: "+vectorU[i]);
					}
					for(int i=0; i<vectorSize; i++)
					{	
					System.out.println("- "+vectorV[i]);
					}
					for(int i=0; i<vectorSize; i++)
					{	
					System.out.println("= "+vectorUminusV[i]);
					}
				}
				
				else
				{
					System.out.println("That is not a valid size!");
				}
			}
			if(choice == 3)
			{
				System.out.println("Enter the magnitude of the vector");
				int vectorSize = keyboard.nextInt();
				if(vectorSize > 0)
					{
						System.out.println("Enter values for the vector");
					double[]vectorU = new double [vectorSize];
					for(int i =0; i<vectorSize; i++)
					{
						vectorU[i] = keyboard.nextDouble();
					}
					double Magnitude = 0;//Created a new double in order to store the magnitude calculated using the users inputed array 
					for(int i = 0;i<vectorSize; i++)
					{
						Magnitude += Math.pow(vectorU[i], 2);
					}
					System.out.println("The magnitude is: " + Math.sqrt(Magnitude));
					}
				else
					{
						System.out.println("That is not a valid size!");
					}
			}
			
			if(choice == 4)
			{
				System.out.println("See you next time!");
				quit = true;
			}
		}
	}
}