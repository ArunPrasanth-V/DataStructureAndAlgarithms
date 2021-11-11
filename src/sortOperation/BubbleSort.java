package sortOperation;
//sorting is very Easy in my thought... ..
import java.util.Arrays;

public class BubbleSort 
{
	
	 
   public static void main(String args[])
   {
	      int temp;
	    int arr[]= {1,7,5,4,2,8,10,3,6};
	    boolean check=false;
	 while(check==false)
	 {
	  
			 for(int i=0;i<arr.length-1;i++)
			  {
				 check=true; 
				  if(arr[i]>arr[i+1])
				  {
					  temp=arr[i];
					  arr[i]=arr[i+1];
					  arr[i+1]=temp;
					  check=false;
				  }
				  
			  }
	 }
	 Arrays.stream(arr).forEach(System.out::println);
   }
}
