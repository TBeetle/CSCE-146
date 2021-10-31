/*
 * Writtten by Tyler Beetle
 */
import java.util.*;

public class ReversePolishCalculator {
	public StackI<Integer> valueStack;
	
	public ReversePolishCalculator()
	{
		valueStack = new LLStack<Integer>();
	}
	
	public int calculate(String input)
	{
		Scanner scan = new Scanner(input);
		
		while(scan.hasNext())
		{
			String str = scan.next();
			if(str.equals("+"))
			{
				if(check())
					return 0;
				int numb1 = valueStack.pop(); 
				int numb2 = valueStack.pop();
				valueStack.push(numb1+numb2);
			}
			else if(str.equals("-"))
			{
				if(check())
					return 0;
				int numb1 = valueStack.pop();
				int numb2 = valueStack.pop();
				valueStack.push(numb1-numb2);
			}
			else if(str.equals("*"))
			{
				if(check())
					return 0;
				int numb2 = valueStack.pop();
				int numb1 = valueStack.pop();
				valueStack.push(numb1*numb2);
			}
			else if(str.equals("/"))
			{
				if(check())
					return 0;
				int numb2 = valueStack.pop();
				int numb1 = valueStack.pop();
				if(numb2 ==0)
				{
					System.out.println("Cannot divide by 0");
					return 0; 
				}
				valueStack.push(numb1/numb2);
			}
			else
			{
				try
				{
					valueStack.push(Integer.parseInt(str));
				}
				catch(Exception e)
				{
					return 0;
				}
			}
		}
		if(valueStack.size() == 1)
			return valueStack.pop();
		System.out.println("That was not properly formatted. There were too many numbers and not enough operators");
		clearStack();
		return 0;
	}
	public boolean check()
	{
		if(valueStack.size()>=2)
			return false; 
		System.out.println("That was not properly formatted. There were too many numbers and not enough operators");
		return true;
	}
	public void clearStack()
	{
		while(valueStack.peek() != null)
		{
			valueStack.pop();
		}
	}
}
