/*
 * Tyler Beetle
 */
import java.util.*;
import java.io.*;
public class RobotCommand implements QueueI<String> {
	private char[][] maze;
	public static final int MAZE_SIZE = 10; 
	private LLQueue<String> moves;
	
	public RobotCommand()
	{
		maze = new char[MAZE_SIZE][MAZE_SIZE];//Creates a base board of the size 10 by 10
		moves = new LLQueue<String>();
	}
	
	public void init(String fileName)//
	{
		try 
		{
			Scanner file = new Scanner(new File(fileName));//Takes in the stored input for the board the user wants to use and then pulls that file
			for(int i = 0;i < MAZE_SIZE; i++)
			{
				maze[i] = file.nextLine().toCharArray();
				maze[0][0] = '0';
				System.out.println(maze[i]);
			}
		}
			catch (Exception e)
			{
				System.out.println("That is not a valid file name");
			}
	}
	
	public void print()
	{
		for (int i = 0; i < MAZE_SIZE; i++)
		{
			System.out.println(maze[i]);
		}
	}
	
	public boolean boundariesCheck(int i, int j, char board[][])//Method that makes sure the simulation is not running outside of the bounds of the board and if it does, the program lets the user know
	{
		if( i >= 0 && i < MAZE_SIZE && j < MAZE_SIZE && j >= 0 && maze[i][j] == '_')
			return true;
		else {
			System.out.println("OUT OF BOUNDS");
			return false;
		}
	}
	
	public void move(String control)//Method to account for the four moves that can come out of the Robot Command files 
	{
		int count = 0;
		int currY = 0;
		int currX = 0;
		
		try 
		{
			Scanner command = new Scanner(new File(control));
			while(command.hasNext())
			{
				String movement = command.nextLine();
				moves.enqueue(movement);
				
				//For Moving Up
				if(moves.peek().equals("Move Up"))
				{
					System.out.println("\nCommand"+count);
					if(boundariesCheck(currY - 1, currX, maze))
					maze[currY][currX] = '_';
					maze[currY - 1][currX] = '0';
					currY -= 1;
					print();
					moves.dequeue();
					count++;
				}
				//For Moving Down
				else if(moves.peek().equals("Move Down"))
				{
					System.out.println("\nCommand"+count);
					if(boundariesCheck(currY + 1,currX, maze))
					{
					maze[currY][currX] = '_';
					maze[currY + 1][currX] = '0';
					currY += 1;
					print();
					moves.dequeue();
					count++;
					}
				}
				//For Moving Right
				else if(moves.peek().equals("Move Right"))
				{
					System.out.println("\nCommand"+count);
					if(boundariesCheck(currY,currX + 1, maze))
					{
					maze[currY][currX] = '_';
					maze[currY][currX + 1] = '0';
					currX += 1;
					print();
					moves.dequeue();
					count++;
					}
				}
				//For Moving Left
				else if(moves.peek().equals("Move Left"))
				{
					System.out.println("\nCommand"+count);
					if(boundariesCheck(currY,currX - 1, maze))
					{
					maze[currY][currX] = '_';
					maze[currY][currX - 1] = '0';
					currX -= 1;
					print();
					moves.dequeue();
					count++;
					}
				}
				
			}
		}
		catch (Exception e)
		{
			System.out.println("That is not a valid file name!");
		}
	}
	@Override
	public void enqueue(String aData)//In order to reference the LLQueue method, we had to call to enqueue, dequeue, and peek
	{
		//Void method so it cannot return anything
	}
	public String dequeue()
	{
		return null;
	}
	public String peek()
	{
		return null;
	}

}
