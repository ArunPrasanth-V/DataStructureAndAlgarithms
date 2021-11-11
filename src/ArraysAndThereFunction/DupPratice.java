package ArraysAndThereFunction;
// i don't know what am doing.... 
public class DupPratice 
{
  public static void main (String args[])
  {
	 int arr[]={1,2,3,4,5,6,7};
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
					 visit[j]=true;
				 }
			 }
		 }
  }
}

