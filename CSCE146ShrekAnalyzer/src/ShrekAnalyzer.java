/*
 * Written by Tyler Beetle
 */
import java.io.*;
import java.util.Scanner; 
public class ShrekAnalyzer {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to Shrek Thing.\nEnter a word and I'll count the letters");
		String word = keyboard.nextLine();
		System.out.println("The word"+word+" appears"+lookForWord(String word));

	}
	public static int lookForWord(String word)
	{
		if (word == null)
			return 0; 
		int ret = 0;
		try {
		
		Scanner fileScanner = new Scanner(new File(Shrek.txt));
		while(fileScanner.hasNext())
		{
			String next = fileScanner.next();
			if(next.equals(word));
				ret++;
		}
			fileScanner.close();//Always close your file Scanner!!!
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return ret; 
		
				
	}
}
