package binarySearchTree;
class Node{
	int data;
	Node left;
	Node right;
}
class BST
{
	public  Node create(int k)
	{
		Node n =new Node();
		n.data=k;
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
	public static  void preOrder(Node node)
	{

		if(node==null)
			return;
		System.out.print(node.data+"\t");
		preOrder(node.left);
		preOrder(node.right);
	}
	public  static void inOrder(Node node)
	{
		    
		if(node==null)
			return;
		
	      inOrder(node.left);
		  inOrder(node.right);
		System.out.print(node.data+"\t");
	}
	public static void postOrder(Node node)
	{
		if(node==null)
			return;
		    
			postOrder(node.left);
			postOrder(node.right);
			System.out.println(node.data+"\t");
	}
    public static void traverse(Node node)
    {
    	System.out.println("THESE IS PREORDER  !!! ");
    	preOrder(node);
    	System.out.println("THESE IS INORDER !!! \n");
    	inOrder(node);
    	System.out.println("THSE IS POSTORDER !!! \n");
    	postOrder(node);
    	
    	
    }
}

public class ClassBst
{
	public static void main (String args[])
	{
		BST call=new BST();
		Node root=null;
		root=call.insert(root, 15);
		root=call.insert(root, 35);
		//root=call.insert(root, 5);
		//root=call.insert(root, 9);
		BST.traverse(root);
	}
}
