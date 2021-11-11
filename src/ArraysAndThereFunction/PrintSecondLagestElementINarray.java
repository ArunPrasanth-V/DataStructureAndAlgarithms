package ArraysAndThereFunction;
import java.util.*;
public class PrintSecondLagestElementINarray
{
    public static void main(String args[])
    {
        int value=0;
        int array[]= {1,2,3,5};
        int size=array.length;
    	for(int i=0;i<size;i++)
    	{
    		if(array[i]>value)
    		{
    			value=array[i];
    		}
    		value=value-1;
    		
    	}
    	System.out.println(value);
    }
}


/*
 * 
 * 1) Initialize two variables first and second to INT_MIN as
   first = second = INT_MIN
2) Start traversing the array,
   a) If the current element in array say arr[i] is greater
      than first. Then update first and second as,
      second = first
      first = arr[i]
   b) If the current element is in between first and second,
      then update second to store the value of current variable as
      second = arr[i]
3) Return the value stored in second.
 */

