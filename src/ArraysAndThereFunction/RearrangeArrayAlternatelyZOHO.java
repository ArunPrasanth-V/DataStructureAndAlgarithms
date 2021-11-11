package ArraysAndThereFunction;

import java.util.Arrays;

//it is not printing well i don't know it doing well  :(
public class RearrangeArrayAlternatelyZOHO {
public static void rearrange(int arr[], int n){
        
	// initialize index of first minimum and first 
	// maximum element 
	int max_idx = n - 1, min_idx = 0; 

	// store maximum element of array 
	int max_elem = arr[n-1]+1 ; //max_in 6,min 0 maxEle 7

	// traverse array elements 
	
	/* # in these for loop what will happen is 			
	*  #it first perform modulo perform modulo then int then add
	*  # array max index % max element-->
	*   (max element can have array last index th value +1)
	*   then star operation perform 
	*          7(6%7)*14==49 
	*  # above value get stored in the arr[i] index 
	*  # max index getting --
	*  # Then next index will come it check the role 
	*  # if it even index it perform the same operation
	*  # weather it is odd mean it come in the else block
	*  # in the else block it perform the same operation as the if block
	*    one change perform max index replace with min index
	*    min index getting ++
	*  # After the if else operation it store all value with math
	*
	*  # next it perform  next for loop
	*        arr[i] % max_elem     these operation 
	*   
	*/
	
	
	for (int i = 0; i < n; i++) {
		
		
	
		// at even index : we have to put maximum element 
		if (i % 2 == 0) { 
			//0(6%6)*6;
			
			arr[i] += (arr[max_idx] % max_elem) * max_elem;
			max_idx--; 
			//7(6%7)*14==49
			//(5%7)*14==19
			//4(4%7)*14==25
			//6(3%7)*14==37
     	} 

		// at odd index : we have to put minimum element 
		else
		{ 
			arr[i] += (arr[min_idx] % max_elem) * max_elem; 
		    min_idx++; 
		} 
	} 
	
	// array elements back to it's original form 
	for (int i = 0; i < n; i++)
	{
		arr[i] = arr[i] % max_elem;
   

	}   
    }
public static void main(String args[])
{
	//19..5..
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int s=arr.length;
	rearrange(arr,s);
   Arrays.stream(arr).forEach(System.out::println);
}
}
/*
 * These function will take the less time complexity
 * i don't know it take it less time 
 * one think You should in remember  
 *    O(n)--> mean it will traverse n number of time until the last array
 *    O(1)-->means it will traverse only once ..
 *    
 *    for these program the time complexity Would be O(1)..
 *    because it traverse only once..
 *
*                   DRY RUN
*  # fist declare the array ,size of the array
*  # Initialize the min &max element 
*  # create a max element which hold the last index th value +1..
*  # create a for loop which traverse the all array element ..
*  # inside the for loop create a if loop 
*  # in the first if loop put the condition Which (index)mod by two ==0
*  # then the else part hold the even index th value  
*  
*
*
*/