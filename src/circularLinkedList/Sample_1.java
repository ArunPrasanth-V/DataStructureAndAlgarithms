package circularLinkedList;

public class Sample_1 {

	public static void main(String[] args)
	{
		circularLinkedList call=new circularLinkedList();
		call.insert(11);
		call.insert(12);
		call.insert(13);
		call.insert(14);
		call.insertAT(0,111);
		call.show();
	}
}
class Node
{
	Node next_address;
	int data;
}
class circularLinkedList
{
	Node head_Node;
	public void insert(int value)
    {
		Node new_node=new Node();
		new_node.data=value;
	      if(head_Node==null)	
	      {
	        head_Node=new_node;
	      }
	      else
	      {
	    	  
	    	  Node next_node=head_Node;
	    	 // Node temp=head_Node;
	    	  while(next_node.next_address!=head_Node && next_node.next_address!=null)
	    	  {
	    		  next_node=next_node.next_address;  
	    	  }
	    	  next_node.next_address=new_node;
	    	  new_node.next_address=head_Node;
	    	  
	      }
	}
	public void show()
	{
		Node next_node=head_Node;
		 Node temp=head_Node;
	while(next_node.next_address!=temp)
  	  {
			System.out.println(next_node.data+"--"+next_node.next_address);
  		  next_node=next_node.next_address;  
  	  }
		System.out.println(next_node.data+"--"+next_node.next_address);
		
	}
	public void insertAT(int index,int value)
	{
		Node next_node=head_Node;
		
		Node new_node=new Node();
		int temp;
		
		if(index==0)
		{
			temp=head_Node.data;    
		    head_Node.data=value;
		    index++;
		    value=temp;
		}
		new_node.data=value;

			for(int i=0;i<index-1;i++)
			{
				next_node=next_node.next_address;
			}
			new_node.next_address=next_node.next_address;
			next_node.next_address=new_node;
		
	}
	
}