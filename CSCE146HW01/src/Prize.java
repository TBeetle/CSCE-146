/*
 * Written by Tyler Beetle
 */
public class Prize {
	
	//Creating Instance Variables
	private int price;
	private String thing;
	
	//Constructor
	public Prize() 
	{
		
	}
	
	public Prize(int price, String thing)
	{
		this.price = price;
		this.thing = thing;
	}
	
	//Getters
	
	public double getPrice()
	{
		return this.price;
	}
	
	public String getThing()
	{
		return this.thing;
	}
	
	//Setters
	public void setPrice(int price) 
	{
		this.price = price; 
	}
	
	public void setThing(String thing)
	{
		this.thing = thing;
	}
	

}
