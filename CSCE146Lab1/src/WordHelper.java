/*
 *Tyler Beetle 
*/
import java.util.*;
public class WordHelper
{
	public static String[] sortByVowels(String[] words)
	{
		String[] wordsVowels = new String[words.length];
		
		for(int i=0; i<words.length; i++)
		{
			wordsVowels[i] = words[i];
		}
		
		boolean hasSwapped = true;//Conducts a bubble sort to check the method 
		while(hasSwapped==true)
		{
			hasSwapped = false;
			
			for(int i=0; i<wordsVowels.length-1; i++)
			{
				if(numVow(wordsVowels[i]) > numVow(wordsVowels[i+1]))//Compares the current string in the array to the next one to see which one has more variables
						{
							String temp = wordsVowels[i];
							wordsVowels[i] = wordsVowels[i+1];
							wordsVowels[i+1] = temp;
							hasSwapped=true;
						}
			}
		}
		return wordsVowels;
	}
	
	public static String[] sortByConsonants(String[] words)//Creates a new method that takes in the parameters of the array type String words
	{
		String[] wordsCon = new String[words.length];
		
		for(int i=0; i<words.length; i++)
		{
			wordsCon[i] = words[i];
		}
		
		boolean hasSwapped = true; 
		while(hasSwapped==true)
		{
			hasSwapped = false;
			
			for(int i=0; i<wordsCon.length-1; i++)
			{
				if(numCon(wordsCon[i]) > numCon(wordsCon[i+1]))
						{
							String temp = wordsCon[i];
							wordsCon[i] = wordsCon[i+1];
							wordsCon[i+1] = temp;
							hasSwapped=true;
						}
			}
		}
		return wordsCon;//Prints back out the new list to the user 
	}
	
	public static String[] sortByLength(String[] words)
	{
		String[] wordsLength = new String[words.length];
		
		for(int i=0; i<words.length; i++)
		{
			wordsLength[i] = words[i];
		}
		
		boolean hasSwapped = true;
		while(hasSwapped==true)
		{
			hasSwapped = false;
			
			for(int i=0; i<wordsLength.length-1; i++)
			{
				if(wordsLength[i].length() > wordsLength[i+1].length())
				{
					String temp = wordsLength[i];
					wordsLength[i] = wordsLength[i+1];
					wordsLength[i+1] = temp;
					hasSwapped=true; 
				}
			}
		}
		return wordsLength; 
	}
	
	public static int numVow(String aWord)
	{
		int vowels = 0;
		for(int i=0; i<aWord.length(); i++)
		{
			if(aWord.charAt(i) == 'a' || aWord.charAt(i) == 'e' || aWord.charAt(i) == 'o'|| aWord.charAt(i) == 'u' || aWord.charAt(i) == 'y')
			{
				vowels++;
			}
		}
		return vowels;
	}
	
	public static int numCon(String aWord)
	{
		int consonants = 0;
		for(int i=0; i<aWord.length(); i++)
		{
			if(aWord.charAt(i) != 'a' || aWord.charAt(i) != 'e' || aWord.charAt(i) != 'o'|| aWord.charAt(i) != 'u' || aWord.charAt(i) != 'y')//Counts every letter in a String if it is not a vowel
			{
				consonants++;
			}
		}
		return consonants;
	}
	
	
}
