/*
 * Written by Tyler Beetle
 */
	import java.lang.reflect.Array;//imported two libraries in order for the program to run 
	import java.util.*;
	public class SumAllCombos {
	
		public static final int RANGE = 100;
		public static final int AMOUNT = 5;
	
		public static void main(String[] args) 
		{
			System.out.println("Welcome to the sum of all combinations program!");
			int[] x = new int[AMOUNT];//Populated an array that would account for the 5 random numbers from 0 to 99 chosen
			chooseRandomNumbers(x);
			addAndPrint(x);
		}
		
		public static void chooseRandomNumbers(int[] x)
		{
			Random r = new Random();
			System.out.print("Given the array = {");
			for(int i=0; i<x.length; i++)//Picks out 5 values and then stores them in an array and outputs them to the user
				{
					x[i] = r.nextInt(RANGE);
					System.out.print(x[i]+" ");
				}
			System.out.println("}, All the summed combinations are: ");
		}
			
		public static void addAndPrint(int [] x)
		{
			addAndPrint(x, new int[1], 0, 1);
		}
		
		public static void addAndPrint(int[]x, int[]runningList, int currentI, int currentD)
		{
			if(currentI >= x.length|| currentD > x.length)
				return;
			int [] copy = new int[currentD];
			for(int i=0; i<runningList.length; i++)
				{
				copy[i] = runningList[i];
				}
			copy[copy.length-1] = x[currentI];
			print(copy);
			addAndPrint(x,copy,currentI+1,currentD+1);//2 lines of recursion that work like a for loop and call back to the start of the method
			addAndPrint(x,copy,currentI+1,currentD);
		}
		
		public static void print(int[] x)//Method that returns each instance of adding the variable integers together.
		{
			System.out.print(x[0]);
			for(int i=1; i<x.length; i++)
				{
				System.out.print(" + "+x[i]);
				}
			System.out.println(" = "+add(x));
		}
		
		public static int add(int[] x)//Adds the contents of the specific instance of the array and then returns it back out to the user in the print method
		{
			int output = 0;
			for(int i=0; i<x.length; i++)
				{
				output += x[i];
				}
			return output;
			}
	}
