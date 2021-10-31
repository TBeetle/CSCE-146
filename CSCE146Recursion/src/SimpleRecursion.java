/*
 * Tyler Beetle
 */
public class SimpleRecursion {

	public static void main(String[] args) {
		countDown(5);
		
		

	}
	public static void countDown(int i)
	{
		if(i<0)//Halting condition
			return;
		System.out.println(i);
		countDown(i-1);
	}
	public static int factorial(int number)
	{
		if(number <= 0)
			return 1;//Halting condtion 
		else
			return number * factorial(number-1);//Recursive call 
	}
	public static int gcd(int a, int b)
	{
		if(b==0)
			return a;
		else 
			return gcd(b,a%b);
	}
	public static int fibo(int number)
	{
		if(number == 1 || number == 2)
			return 1;//Halting
		else 
			return fibo(number-1) + fibo(number-2);
	}

}
