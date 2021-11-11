package binarySearchTree;

class Node 
{
	int data;
	Node left;
	Node right;
}

class Bst{
	
	public Node CreateNewNODE(int k)
	{
		Node a=new Node();
		a.data=k;
		a.left=null;
		a.right=null;
		
		return a;
	}
	
	public Node insert(Node node,int val)
	{
		
		if(node ==null)
		{
			return CreateNewNODE(val);
		}
		if(val<node.data) 
		{
			node.left=insert(node.left,val);
		}else if(val>node.data) 
		{
			node.right=insert(node.right,val);
		}
	return node;
	}
	public void preOrder(Node node)
	{
		if(node==null)
			return ;
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
		
			System.out.println("PreOrder IS ");
			preOrder(node);
			System.out.println("\nInOder IS ");
			inOrder(node);
			System.out.println("\nPostOrder IS ");
			postOrder(node);
		
	}
}

public class BSTinsertion {
public static void main(String args[]) {
	 Bst bcall=new Bst();
	 Node root=null;
	 int value[]= {9,2,5,6,3,8};
	 root=bcall.insert(root,8);
	 root=bcall.insert(root,9);
	 root=bcall.insert(root,5);
	 root=bcall.insert(root,6);
	 root=bcall.insert(root,17);
	 root=bcall.insert(root,6);
	 bcall.traverse(root);
}

}