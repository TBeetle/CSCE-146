/*
 * Written by Tyler Beetle
 */
public class LLQueue<T> implements QueueI<T> {
	private class ListNode
	{
		private T data;
		private ListNode link;
		public ListNode (T aData, ListNode aLink)
		{
			data = aData;
			link = aLink;
		}
	}
	private ListNode head; //First element of the queue (linked list)
	private ListNode tail;//Last element
	public LLQueue()
	{
		head = tail = null;
	}
	public void enqueue(T aData)
	{
		ListNode newNode = new ListNode(aData, null);
		if(head == null)
		{
			head = tail = newNode;
			return; 
		}
		tail.link = newNode; 
		tail = tail.link;
	}
	public T dequeue()
	{
		if(head == null)
			return null;
		T ret = head.data;
		head = head.link;
		return ret;
	}
	public T peek()
	{
		if(head == null)
			return null; 
		return head.data;
	}
	public void print()
	{
		for(ListNode temp = head;temp!=null;temp = temp.link)
			System.out.println(temp.data);
		
	}
	

}
