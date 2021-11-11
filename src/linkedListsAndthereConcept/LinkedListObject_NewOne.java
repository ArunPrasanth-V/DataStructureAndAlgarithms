package linkedListsAndthereConcept;

public class LinkedListObject_NewOne
{
//Am The World class Google Programmer
	public static void main(String[] args) 
	{
		LinkedList linkey=new LinkedList();
		linkey.insert(1);
		linkey.insert(2);
		linkey.insert(3);
		linkey.insert(4);
		linkey.insert(5);
		linkey.insert(6);
		linkey.insert(7);
		linkey.insertAtStart(111);
		linkey.insertAt(2,333);
	    linkey.show();
	    linkey.length();
	}
}
class Node
{
	Node address;
	int data;
}
class LinkedList
{
	Node node;
	public void insert(int value)
	{
		Node new_node=new Node();
		new_node.data=value;
		
		if(node==null)
		{
			node=new_node;
		}
		else
		{
			Node other_node=node;
	        while(other_node.address!=null)
	        {
	        	other_node=other_node.address;
	        }
	        other_node.address=new_node;
		}
	}
	public void show()
	{
		Node traverse=node;
		while(traverse.address!=null)
		{
			System.out.println(traverse.data);
		    traverse=traverse.address;
		}
		System.out.println(traverse.data);
	}
	public void insertAt(int index,int value)
	{
		Node next_node=node;
		
		Node new_node=new Node();
		new_node.data=value;
		for(int i=0;i<index-1;i++)
		{
			next_node=next_node.address;
		}
		new_node.address=next_node.address;
		next_node.address=new_node;
	}
	public void insertAtStart(int value)
	{
		
		Node new_node=new Node();
		new_node.data=value;
	
	     new_node.address=node;
	     node=new_node;
	}
	
	public void length()
	{
		int count=0;
		Node next_node=node;
		while(next_node!=null)
		{
			count+=1;
			next_node=next_node.address;
		}
		
		System.out.println("The Length : "+count);
	}
	
}