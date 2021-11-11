package ArraysAndThereFunction;
// split size how many times div
public class HowManyTimesDivides 
{
  public static void main(String args[])
  {
	  int count=0;
	  int k=2;//split size..
	  int arr[]= {2,3,4,5,3,4,6};
	  int s=arr.length;
	  for(int i=0;i<s;i++)
	  {
		  if(arr[i]%2==0)
		  {
			count+=arr[i]/k;  
		  }
		  else 
		  {
			  count+=arr[i]/k+1;
		  }
		  if(arr[i]==0)
		  {
			  count++;
		  }
	  }
	  System.out.println("The val is "+count);
  }
}
