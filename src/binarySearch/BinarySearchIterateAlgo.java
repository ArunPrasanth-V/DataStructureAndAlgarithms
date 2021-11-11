package binarySearch;

public class BinarySearchIterateAlgo {
  public static void main(String args[])
  {
	  //The Time Complexity Will be  O(log n);
	  //The Space Compleity Will be O(1);
	  int arr[]= {1,2,3,4,5,6,7,8,9,10};
	  System.out.println(binarySearch(arr,0,arr.length-1,1));
  }
  public static int binarySearch(int arr[],
		  int first,int last,int key)
  {
	  while(first<=last)
	  {
		  int mid=first+(last-first)/2;
		  if(arr[mid]==key)
		  {
			  return key;
		  }
		  else if(arr[mid]>key)
		  {
			  last=mid-1;
		  }
		  else
		   first=mid+1;
		
	  }
	  return -1;
	  
  }
}
