/*
 * Tyler Beetle
 */
public class Process {
private String name;
private Double comTime;
public Process()
{
	this.name = "none";//Sets the default value of the name and console to none
	this.comTime = 0.0;
}
public Process(String aName, Double aComTime)
{
	setName(aName);
	setCompletionTime(aComTime);
}
//Accessors
public String getName()
{
	return this.name;
}
public Double getCompletionTime()
{
	return comTime;
}
//Mutators
public void setName(String aName)
{
	if(aName != null)
		this.name = aName;
	else
		this.name = "none";
}
public void setCompletionTime(Double aComTime)
{
	if(aComTime != null)
		this.comTime = aComTime; 
	else 
		this.comTime = 0.0;
}
public String toString()
{
	return "Process Name: "+this.name+" Completion Time: "+this.comTime;
}
public boolean equals(Process aP)
{
	return aP != null &&
			this.name.equals(aP.getName()) &&
			this.comTime.equals(aP.getCompletionTime());
}


}
