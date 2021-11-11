package ArraysAndThereFunction;

import java.util.Arrays;

public class DeleteAnElementInAnArray {
	//deleting mean simply overriding 
	public static  void main(String args[])
	{
		int []arr= {1,2,3,4,5,6,7,8,9};
		 int ele=6;
		
		 for(int i=0;i<arr.length;i++)
		  {
			
			   			 if(arr[i]==ele &&i!=arr.length-1)
						 {
					 		while(i<arr.length-1)
				 	  		{
						   	  arr[i]=arr[i+1];
							  i++;
							}
				         }
			   			 else if(arr[i]==ele &&i==arr.length-1)
						 {
							 arr[arr.length-1]=0;
						 }
			 
		  }      
				     arr[arr.length-1]=0;
		 
				 Arrays.stream(arr).forEach(System.out::println);
		  
		 
	}
}
