package ArraysAndThereFunction;

public class CountTheNumberOfZero
{
public static void main(String args[])
{
	int count=0;
	int arr[]= {1,1,0,0,0,0,0,0};
	int s=arr.length;
	for(int i=0;i<s;i++)
	{
	   if(arr[i]==0)
	   {
		   count++;
	   }
	}
	System.out.println("There are "+count+" zeros");
}
}
