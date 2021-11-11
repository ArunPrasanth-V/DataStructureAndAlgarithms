package ArraysAndThereFunction;

public class DupOnlyPrint 
{
  public static void main(String args[])
  {
	  int arr[]= {1,2,3,4,5,6,7,1,2,3,4};
	  int n=arr.length;
	  boolean visit[]=new boolean[n]; 
	  for(int i=0;i<n;i++)
	  {
	   	  if(visit[i]==true)
		  {
			  continue;
		  }
		  for(int j=i+1;j<n;j++)
		  {
			  if(arr[i]==arr[j])
			  {
				  System.out.println(arr[i]);
			  }
			
	   	  }
	   }
  }
}