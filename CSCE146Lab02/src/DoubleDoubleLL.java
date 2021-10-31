/*
 * Written by Tyler Beetle
 */
public class DoubleDoubleLL {
	
	private class ListNode
	{
		private double data;
		private ListNode nextLink;
		private ListNode prevLink;//Similar to the next link but it refers to the link one prior to the current
		
		public ListNode()
		{
			data = 0.0; 
			nextLink = null; 
			prevLink = null; 
		}
		public ListNode(double aData, ListNode aNextLink, ListNode aPrevLink)
		{
			data = aData;
			nextLink = aNextLink;
			prevLink = aPrevLink;
		}
		
	}
	private ListNode head;
	private ListNode current;
	public DoubleDoubleLL()
	{
		head = current = null;
	}
	public void gotoNext()
	{
		if(current == null)
			return;
		current = current.nextLink;
	}
	public void gotoPrev()
	{
		if(current == null)
			return;
		current = current.prevLink;
	}
	public void reset()
	{
		current = head;
	}
	public void gotoEnd()
	{
		if(current == null)
			return;
		current = current.nextLink;
	}
	public boolean hasMore()
	{
		return current != null;
	}
	public double getCurrent()
	{
		if(current == null)
			return 0.0;
		return current.data;
	}
	public void setCurrent(double aData)
	{
		if(current != null)
			current.data = aData;
	}
	public void add(double aData)
	{
		ListNode newNode = new ListNode(aData,null, null);
		if(head == null)
		{
			head = newNode;
			current = head;
			return;
		}
		ListNode temp = head; 
		while(temp.nextLink != null && temp.nextLink != null)
			temp = temp.nextLink;
		temp.nextLink = newNode;
		newNode.prevLink = temp;
	}
	public void addAfterCurrent(double aData)
	{
		if(current == null)
			return;
		ListNode newNode = new ListNode(aData, current.nextLink, current);
		if(current.nextLink != null)
		current.nextLink.prevLink = newNode;
		current.nextLink = newNode;
	}
	public void remove(double search, double aData)
	{
		ListNode temp = head;
		if(current == null)
			return;
		while(temp != null)
		{
			if(search == temp.data)
			{
				if(temp == head)
				{
					head = head.nextLink;
					head = head.prevLink;
				}
				temp.prevLink.nextLink= temp.nextLink;
				temp.nextLink.prevLink = temp.prevLink;
				return; 
			}
		}
		
		
	}
	public void removeCurrent()
	{
		if(current == null)
			return;
		
		if(current == head)
		{
			head = head.nextLink;
			if(head != null)
				head.prevLink = null;
			current = head;
			return;
		
		}
		current.prevLink.nextLink = current.nextLink;
		if(current.nextLink != null)
			current.nextLink.prevLink = current.prevLink;
		current = current.nextLink;
	}
	public void print()
	{
		ListNode temp = head; 
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.nextLink;
		}
	}
	public boolean contains(double aData)
	{
		for(ListNode temp = head; temp != null; temp = temp.nextLink)
			if(temp.data == aData)
				return true; 
		return false;
	}
		
	
}
