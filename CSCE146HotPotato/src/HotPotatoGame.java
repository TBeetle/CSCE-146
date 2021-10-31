/*
 * Tyler Beetle
 */
import java.util.Random;
public class HotPotatoGame {
	private int currentTime;
	private QueueI<String> players;
	public static final int MAX_RAND_TIME = 21;
	public static final int MIN_RAND_TIME = 10; 
	
	public HotPotatoGame()
	{
		init();
	}
	private void init()
	{
		players = new LLQueue<String>();
		this.resetTime();
		
	}
	public void resetTime()
	{
		Random r = new Random();
		this.currentTime = r.nextInt(MAX_RAND_TIME)+MIN_RAND_TIME;
	}
	public void addPlayer(String aName)
	{
		if(aName == null)
			return;
		players.enqueue(aName);
	}
	public String getCurrentPlayer()
	{
		return players.dequeue();
	}
	public boolean hasLost(int time)
	{
		this.currentTime -= time;
		return this.currentTime <= 0;
	}
	public boolean getWin()
	{
		return players.size() <= 1;
	}
	
}
