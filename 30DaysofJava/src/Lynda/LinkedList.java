package Lynda;

public class LinkedList {

	private Node Head; //contains just the head
	
	public void insertAtHead(int data)
	{
		Node newNode = new Node(data);
		newNode.setNextNode(this.Head);
		this.Head=newNode;
		
	}
	
	public int length()
	{
		int length = 0;
		Node current = this.Head;
		while(current!=null)
		{
			length++;
			current = current.getNextNode();
			
		}
			return length;

	}
	
	public Node find(int data)
	{
		Node current = this.Head;
		while(current!= null)
		{ if (current.getData() == data)
			return current;
		
		current = current.getNextNode();
		}
		return null;
		
	}
	public void deleteFromHead()
	{
		this.Head = this.Head.getNextNode();
		
	}
	
	@Override
	public String toString()
	{
		String result = "{";
		Node current=this.Head;
		
		while(current!= null) {
			result+=current.toString() + ",";
			current = current.getNextNode();
			
			 
		}
		result+="}";
		return result;
		
	}
}
