package doublyLinkedList;

public class Sample_1 {

	public static void main(String args[])
	{
		//am the Best_programmer
		 DoublyLinkedList call=new  DoublyLinkedList();
		 call.insert(12);
		 call.insert(13);
		 call.insert(14);
		 call.insert(15);
		 call.insert(16);
		 call.insertAt(3,11);
		 call.delete(5);
		 call.show();
	}
}
class Node
{
	Node next_add;
	Node privous_add;
	int data;
}
class DoublyLinkedList
{
	Node head;
	public void insert(int value)
	{
	    Node temp=head;	
		Node create=new Node();
		create.data=value;
		if(head==null)
		{
			head=create;
			
		}
		else
		{
			//Node before_node_address=tail;
			Node current_node_address=head;
			while(current_node_address.next_add!=null)
			{
				current_node_address=current_node_address.next_add;
			
			}
			current_node_address.next_add=create;
			create.privous_add=current_node_address;
		}
	}
	public void show()
	{
		Node  current_node_address=head;
		while(current_node_address.next_add!=null)
		{
			System.out.println(current_node_address.data
			+"---"+current_node_address.privous_add+"--->"+current_node_address.next_add);
			current_node_address=current_node_address.next_add;
		}
		System.out.println(current_node_address.data
		+"---"+current_node_address.privous_add+"--->"+current_node_address.next_add);
	}
    public void insertAt(int index,int value)
    {
    	
    	Node new_node=new Node();
    	new_node.data=value;
    	if(index==0)
    	{
    		//new_node=head;
    		new_node.next_add=head;
    		head.privous_add=new_node;
    		head=new_node;
    	}
    	else
    	{
    		Node node=head;
    		for(int i=0;i<index-1;i++)
    		{
    			node=node.next_add;
    		}
    		
    		new_node.privous_add=node;
    		new_node.next_add=node.next_add;
    		node.next_add=new_node;
    		node=node.next_add;
    		node=node.next_add;
    		node.privous_add=new_node;
    	}
    }
    public void delete(int index)
    {
    	Node temp=null;
    	Node temp1=null;
    	Node node=head;
    	if(index==0)
    	{
    		head=node.next_add;
    		head.privous_add=null;
    	}
    	else
    	{
	    	for(int i=0;i<index;i++)
	    	{ 
	    	    node=node.next_add;
	    	
	    	}
	    	if(node.next_add!=null)
	    	{
	          temp= node.next_add;   	
 	          temp1=node.privous_add;
 	          node=node.privous_add;
 	          node.next_add=temp;
 	          temp.privous_add=temp1;
 	          temp=null;temp1=null;
	    	}
	    	else
	    	{
	    		node=node.privous_add;
	    		node.next_add=null;
	    	}
	    }
    }
    
    
}