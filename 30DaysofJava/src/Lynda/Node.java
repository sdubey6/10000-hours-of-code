 package Lynda;

public class Node {

	private int data; //we are assuming th data is gping to be of int type
	private Node nextNode;
	
	public Node (int data)
	{
		this.data = data;
		
	}
	
	public int getData()
	{
		return this.data;
	}
	
	public Node getNextNode()
	{
		return this.nextNode;
	}
	
	
public void setData(int Data)

{
	this.data = data; 
	}

	public void setNextNode(Node nextNode)
	{
		this.nextNode = nextNode;
		
	}
	
	@Override
	public String toString()
	{return "Data: "+this.data;
	}
	
}
