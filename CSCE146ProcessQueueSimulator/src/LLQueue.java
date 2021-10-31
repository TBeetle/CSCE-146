/*
 * Written by Tyler Beetle
 */
 
public class LLQueue<T>//Created a Linked List Queue that took in the generic type "T" as its parameters
{
	public class ListNode
	{
		 T data;
		ListNode link;
		
		public ListNode (T aData, ListNode aLink)
		{
			this.data = aData;
			this.link = aLink;
		}
	}
	private ListNode head; //First element of the queue (linked list)
	private ListNode tail;//Last element
	private int amount;
	public LLQueue()
	{
		head = tail = null;
	}
	public T peek()
	{
		if(head == null)
			return null; 
		return head.data;
	}
	public void enqueue(T aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if(head == null)
		{
			head = newNode;
			tail = head;
			amount = 1;
			return; 
		}
		this.tail.link = newNode;
		this.tail = newNode;
		amount++;
	}
	public T dequeue()
	{
		if(head == null)
			return null;
		ListNode temp = head;
		head = head.link;
		amount--;
		return temp.data;
	}
	
	public void print()
	{
		ListNode tempNode = head;
		while(tempNode != null)
		{
			System.out.println(tempNode.data.toString());
			tempNode = tempNode.link;
		}
		
	}
	

}
