// there are 5 ways can do the problem
//1)brute fore approach -O(n^2)----array sort
//2)use hash table data structure - O(n)-----hashmap
//3)use set data structure - O(n)-----set
//stream
//boolean

package ArraysAndThereFunction;
import java.util.*;
// it is little difficult to find 
//   not exactly difficult but Little Complicated

//Check The Duplicate Element in an Array. .. 
//You need to print that duplicate element ... 
//You need to print all the element except the Second Duplicate element 
public class duplicate
{
	
	//these program will print the all element only once.. 
	public static void main (String args[])
	{
		int arr[]= {2,2,2,2,2,2,2};
		int n=arr.length;
		
		int count=1;
		boolean bool[]=new boolean[n];
		for(int i=0;i<n;i++)
		{
	       if(bool[i]==true)
	        {   
	    	   continue;   
	    	}
	       for(int j=i+1;j<n;j++)
	       {
	    	   if(arr[i]==arr[j])
	    	   {
	    		   bool[j]=true;
	    	     
	    	   }
	       }
	      
	        System.out.println(arr[i]);
		}
		
		//i need to print the element with less time complexity 
//what i want to do is	
	}
}
	

/*
*DRY..RUN..
*Line ::11 -->check the Condition(only index but in output it gives the input number(**index is not Show**)
* 
* here i Explain in only in Index
* i<=arr    step-1  0<=4(true)
*
*Line ::15 -->      
*     j=i+1         j=1 and it Check the ist Index number can have the value of other index          
*                
* 
*/