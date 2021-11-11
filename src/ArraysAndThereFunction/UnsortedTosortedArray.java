package ArraysAndThereFunction;
//am creating my new own App 
//my 
import java.util.*;


public class UnsortedTosortedArray 
{//how can i sort an array
//1)selection 2)merge short 3)bubble short 4)shell short 5)
  public static void main (String args[])
  {
	  //i don't know what am doing
	  int arr[]= {10,2,9,4,15,7,1,3,6};
	  sort012(arr,arr.length);
  }
/*	
 *   Time Complexity will High it take more then 2.50min  :(
 *   Arrays.sort(arr);
	    for(int i=0;i<arr.length;i++)
	    {
	        System.out.print(" "+arr[i]);
	    }
	    */
	  public static void sort012(int a[], int n){
		    int low = 0, high = n-1, mid = 0;
		    while(mid <= high){
		        if(a[mid]==0) {
		            int temp=a[low];
		            a[low]=a[mid];
		           a[mid]=temp;
		            low++;
		            mid++;
		        } else if(a[mid]==1) {
		            mid++;
		        } else {
		            int temp=a[mid];
		            a[mid]=a[high];
		           a[high]=temp;
		            high--;
		        }
		    }
		    Arrays.stream(a).forEach(System.out::println);
		   
		}
	}
  

