package ArraysAndThereFunction;

public class RearrangeTheArrayAlternatively 
{
  public static void main(String args[])
  {
	  int []arr= {1,2,3,4,5,6,7,8,9,10};
	  int n=arr.length;
	  int i=0;
	  int mid=n/2;
	 // System.out.println(mid);
	  int first=0;
	  int last=n-1;
		 while(i<n)
		 {
			 if(first!=mid)
			 {
				 System.out.println(arr[last]);
				 last--;
				 System.out.println(arr[first]);
				 first++;
			 }
			
		 }

    
  }
}
