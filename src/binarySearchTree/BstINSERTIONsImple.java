package binarySearchTree;
import java.util.Scanner;

class Node
{
	int data;
	Node left;
	Node right;
}
class bfs{
	public Node create(int k)
	{
		Node n=new Node();
		n. data=k; 
		n.left=null;
		n.right=null;
	
		return n;
	}	
	public Node insert(Node node,int val)
	{
		if(node==null)
		{
			return create(val);
		}
		if(val<node.data)
		{
			node.left=insert(node.left,val);
		}
		if(val>node.data)
		{
			node.right=insert(node.right,val);
		}
		return node;
	}
	public void preOrder(Node node)
	{
		if(node==null)
			return;
		System.out.print(node.data+"\t");
		preOrder(node.left);
		preOrder(node.right);
	}
	public void inOrder(Node node)
	{
		if(node==null)
			return;
		
		inOrder(node.left);
		System.out.print(node.data+"\t");
		inOrder(node.right);
	}
	public void postOrder(Node node)
	{
		if(node==null)
			return;
		
		postOrder(node.left);
		postOrder(node.right);
		System.out.print(node.data+"\t");
	}
	public void traverse(Node node)
	{
		System.out.println("\nThis Is a preOrder  ");
		preOrder(node);
		System.out.println("\nThis Is a InOrder  ");
		inOrder(node);
		System.out.println("\nThis Is a postOrder  ");
		postOrder(node);
		
	}
	public static Node  delete(Node node,int val) {
		if(node==null)
		{
			return node;
		}
		if(val<node.data)
		{
			node.left=delete(node.left,val);
		}
		else if(val>node.data)
		{
			node.right=delete(node.right,val);
		}
		else 
		{
			if(node.left==null ||node.right==null)
			{
				Node temp=node.left!=null?node.right: node.right;
				if(temp==null)
				{
					return null;
					
				}else {
					return temp;
				}
			}else
			{
			//successor will assign the  right value to the left side ..
			Node successor =getSuccessor(node);
			//successor value get store in the node data
			node.data=successor.data;
			//i think after assign the left side ..right value get delete..
			node.right=delete(node.right,successor.data);
			return node;
		
			}
		}
		
		return node;
	}



	public static Node getSuccessor(Node node)
	{
		if(node==null)
		{
			return null;
		}
		// temp right value assigned in left side
		Node temp=node.right;
	    //in the while loop store the left value in the temp..
		while(temp.left!=null)
		{
			temp=temp.left;
		}
		// at the end of the  method it return temp...
		return temp;
	}	
	public static Node getParent(Node node,int val)
	{
		if(node==null)
		{
			return null;
		}
		Node getParent=null;
		while(node!=null)
		{
			if(val<node.data)
			{
				getParent=node;
				node.left=getParent(node.left,val);
			}
			else if(val>node.data)
				
				{
				   getParent=node;
				   node.right=getParent(node.right,val);
				}
			else 
			{
				break;
			}
			     
		
		}
			
		return node!=null?getParent:null;
	}
	
}
public class BstINSERTIONsImple
{
public static void main(String args[])
	{
	    Scanner scan=new Scanner(System.in);
		bfs call=new bfs();
		Node n=null;
		Node temp=null;
		
		
		System.out.println("Enter Total Number You want TO insert  ");
	   int value=scan.nextInt();
	  // System.out.println("Enter the values are  ");
	   /*n=call.insert(n,9);
	   n=call.insert(n,15);
	   n=call.insert(n,6);
	   n=call.insert(n,17);
	   n=call.insert(n,25);*/
	   for(int i=0;i<value;i++)
	    
	    {
	    	System.out.println("Enter the NO. "+(i+1)+" value");
	    	 int val=scan.nextInt();
	    	n=call.insert(n, val);
	    }
	    
	    call.traverse(n);
	    System.out.println("\nEnter the value you want to delete ");
         int del=scan.nextInt();
	    call.delete(n,del);
	    call.traverse(n);
	}
}