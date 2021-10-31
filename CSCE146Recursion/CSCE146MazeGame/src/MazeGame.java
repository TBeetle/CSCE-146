/*
 * Tyler Beetle
 */
import java.util.Random;
import java.util.Scanner;
public class MazeGame {
	private char[][] maze; 
	public static final int MAZE_SIZE = 10;
	public final char EMPTY = '_';
	public static final char OBST = 'X';
	public static final char OBST_AMT = (MAZE_SIZE*MAZE_SIZE)/10;
	public static final char PLAYER = '0';
	public static final char PATH = '#';
	private StackI<int[]> locations;
	public static final String NORTH = "Go North";
	public static final String SOUTH = "Go South";
	public static final String WEST = "Go West";
	public static final String EAST = "Go East";
	public static final String BACK = "Go Back";
	private int[] currLoc;//index 0 = y, index 1 = x
	public MazeGame()
	{
		init();
	}
	
	private void init()
	{
		//Create the maze;
		maze = new char[MAZE_SIZE][MAZE_SIZE];
		for(int i=0;i<maze.length;i++)
			for(int j=0;j<maze[i].length;j++)
				maze[i][j] = EMPTY;
		//TODO add obstacles
		this.addObstacles();
		maze[0][0] = PLAYER;
		currLoc = new int[] {0,0};
			
	}
	private void addObstacles()
	{
		Random r = new Random();
		for(int i=0;i<OBST_AMT;i++)
		{
			int x = r.nextInt(MAZE_SIZE);
			int y = r.nextInt(MAZE_SIZE);
			if(maze[y][x] != EMPTY || (x==0 && y==0))
				continue;
			maze[y][x] = OBST;
		}
	}
	public void printMoveOptions()
	{
		int currY = currLoc[0];
		int currX = currLoc[1];
		int[] prevLoc = locations; 
		//North 
		if(isValid(currY-1) && maze[currY-1][currX] != OBST)
		{
			if(prevLoc != null && currY-1 == prevLoc[0] && currX == prevLoc[1])
			System.out.println(NORTH);
		}
		//South 
		if(isValid(currY-1) && maze[currY-1][currX] != OBST)
				{
					if(prevLoc != null && currY-1 == prevLoc[0] && currX == prevLoc[1])
					System.out.println(NORTH);
				}
				
	}
	public void move(String input)
	{
		maze[currLoc[0]][currLoc[1]] = EMPTY;
		int currY = currLoc[0];
		int currX = currLoc[1];
		int[] copyLoc = {currLoc[0],currLoc[1]};
		if(input.equalsIgnoreCase(NORTH))
		{
			//North 
			if(isValid(currY-1) && maze[currY-1][currX] != OBST)
			{
				locations.push(copyLoc);
				currLoc[0]--;
			}
		}
	}
	private boolean isValid(int index)
	{
		return index >= 0 && index < maze.length;
	}
}
