/*
 * Written By Tyler Beetle
 */
import java.util.Random;
import java.io.*;
public class Showdown {
	
	//Creating Variables
	public Prize prizes[];
	public static final String DELIM = "\t";
	public static final int THINGS = 50;  
	public static final int PRIZEAMOUNT = 5;
	public static final int NAME_PRICE = 2;
	
	//Constructor method
	public Showdown()
	{
		prizes = new Prize[THINGS];
		readFile();
	}
	
	
	@SuppressWarnings("null")
	public void readFile()
		{
			try
			{
				BufferedReader fileScanner = null;
				int count = 0;
				fileScanner = new BufferedReader(new FileReader("prizeList.txt"));//Reads the text file containing all of the different prizes
				String line;
				while((line = fileScanner.readLine()) != null)
				{
					//if(!line.trim().contentEquals(""))
					{
						String[] splitLine = line.split(DELIM);
						if(splitLine.length == NAME_PRICE)
						{ 
						String name = splitLine[0];
						int price = Integer.parseInt(splitLine[1]);
						prizes[count++] = new Prize(price, name);
				
						if(count == THINGS)
							break;
						}
					}
				}
				fileScanner.close();
			}
		catch(Exception e)//Utilized an exception to try to catch before it occurs 
		{
			e.printStackTrace();
		}
	}
	
	public Prize[] randomPrize()
	{
		Random r = new Random();
		Prize chosenPrizes[] = new Prize[PRIZEAMOUNT];
		for(int i = 0; i<PRIZEAMOUNT; i++)
		{
			int random = r.nextInt(THINGS);
			//if(random != chosenPrizes[i])
			{
				//chosenPrizes[i] = prizes[random];
			//}
			
			}
		}
		return chosenPrizes;
	}
}
