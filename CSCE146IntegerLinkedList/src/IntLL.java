/*
 * Written by Tyler Beetle
 */
public class IntLL {
	private class ListNode
	{
		private int data;
		private ListNode link;
		public ListNode(int aData, ListNode aLink)
		{
			data = aData;
			link = aLink;//reference to its self (memory address)
		}
	}
	private ListNode head;//First element
	private ListNode current;//Current element
	private ListNode previous;//One node behind current 
	public IntLL()
	{
		head = current = previous = null; 
	}
	public void add(int aData)
	{
		ListNode newNode = new ListNode(aData,null);
		if(head == null)
		{
			head = current = newNode;
			return;
		}
		ListNode temp = head; 
		while(temp.link != null)
		{
			temp = temp.link;
			temp.link = newNode;
		}
	}
		public void addAfterCurrent(int aData)
		{
			if(current == null)
				return;
			ListNode newNode = new ListNode(aData, current.link);
				 current.link = newNode; 
		}
		public void print()
		{
			ListNode temp = head;
			while(temp != null)
			{
				System.out.println(temp.data);
				temp = temp.link;
			}
		}
		public int getCurrent()
		{
			if(current == null)
				return 0;
			return current.data;
		}
		public void setCurrent(int aData)
		{
			if(current == null)
				return;
			current.data = aData;
		}
		public void gotoNext()
		{
			if(current != null)
			{
				previous = current; 
				current = current.link;
			}
		}
		public boolean hasMore()
		{
			return current != null;
		}
		public void reset()
		{
			current = head;
			previous = null;
		}
		public void removeCurrent()
		{
			if(current != null && previous == null)
			{
				previous.link = current.link;
				current = current.link;
			}
		}
}
