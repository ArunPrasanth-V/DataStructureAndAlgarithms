package sortOperation;
import java.util.*;
public class SortWithTwoForLoop {
// i think it look likes a bubble sort
	public static void main(String args[])
	{
		int []arr= {9,8,7,6,7,4,3,2,1};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
           for(int j=i;j<arr.length;j++)
           {
        	   if(arr[i]>arr[j])
        	   {
        		   temp=arr[i];
        		   arr[i]=arr[j];
        		   arr[j]=temp;
        	   }
           }
     
		}
	  	Arrays.stream(arr).forEach(e->System.out.print(e+" "));
	
	}
}
