package linkedListsAndthereConcept;

public class LinkedListCreateByUSER 
{
    public static void main(String args[])
    {
    	LinkedLists call=new LinkedLists();
    	call.insert(1);
    	call.insert(2);
    	call.insert(3);
    	call.insert(4);
    	call.insert(5);
    	call.deleteAt(2);
        call.insertAt(3,1111);
    	call.insertAtStart(777);
    	call.show();
        call.length();
    }
}
class Box
{
   Box next_node_address;
   int data;
}
class LinkedLists
{
	Box head_Node;
	public void insert(int value)
	{
		Box insert_new_data=new Box();
		insert_new_data.data=value;
		if(head_Node==null)
		{
			head_Node=insert_new_data;
		}
		else
		{
			Box next_Node=head_Node;
			while(next_Node.next_node_address!=null)
			{
				next_Node=next_Node.next_node_address;
			}
			next_Node.next_node_address=insert_new_data;
		}
	}
	
	public void show()
	{
		Box node=head_Node;
		while(node.next_node_address!=null)
		{
			System.out.println(node.data);
		node=node.next_node_address;	
		}
		System.out.println(node.data);
	}
	
	public void insertAt(int index,int value)
	{
		Box node=head_Node;
	      Box insert_node=new Box();
	      insert_node.data=value;
	      for(int i=0;i<index-1;i++)
	      {
	    	  node=node.next_node_address;
	      }
	      insert_node.next_node_address=node.next_node_address;
	      node.next_node_address=insert_node;
	}
	public void insertAtStart(int value)
	{
		  Box insert_node=new Box();
	      insert_node.data=value;
	       
	      insert_node.next_node_address=head_Node.next_node_address;
	      head_Node=insert_node;
	}
	public void deleteAt(int index)
		{
		    if(index==0)
		    {
		    	head_Node=head_Node.next_node_address;
		    }
		    else 
		    {
			     Box node=head_Node;
			     Box temp_node=null;
				for(int i=0;i<index-1;i++)
				{
				    node=node.next_node_address;	
				}
				temp_node=node.next_node_address;
				node.next_node_address=temp_node.next_node_address;
		         temp_node=null;
		    }
	     }
	
	public int length(Box node)
	{
		
		if(node==null)
		return 0;
		else
	    return length(node.next_node_address)+1;
	}
	}