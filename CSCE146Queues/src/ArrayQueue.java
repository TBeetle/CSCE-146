
public class ArrayQueue <T> implements QueueI<T>{
	private T[] queue;
	private int headIndex;
	private int tailIndex;
	
	
	public static final int DEF_SIZE = 100; 
	public ArrayQueue()
	{
		
	}
	public ArrayQueue(int size)
	{
		
	}
	private void init(int size)
	{
	 tailIndex = 0;
	 if(size >= 1)
		 queue = (T[])(new Object[size]);
	 else
		 queue = (T[])(new Object[DEF_SIZE]);
	}
	public void enqueue( T aData)
	{
		if(queue[headIndex] != null && headIndex == tailIndex)
			return;//Full array  
		queue[tailIndex] = aData;
		tailIndex = (tailIndex+1)%queue.length;
	}
	public T dequeue()
	{
		T ret = queue[headIndex];
		headIndex = (headIndex+1)%queue.length;
		return ret; 
	}
	public T peek()
	{
		return queue[headIndex];
	}
	public void print()
	{
		System.out.println(queue[headIndex]);//prints the first element
		for(int i = (headIndex+1)%queue.length;i != tailIndex;i = (i+1)%queue.length)
			System.out.println(queue[i]);
			
	}
}
