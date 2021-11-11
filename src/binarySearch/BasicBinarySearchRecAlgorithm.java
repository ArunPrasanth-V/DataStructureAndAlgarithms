package binarySearch;

public class BasicBinarySearchRecAlgorithm 
{
	
	//the time complexity will be O(logn)
	//the space complexity will also be O(log n)
	   //-- because we use the recursive method in that space
   public static void main(String args[])
   {
	   int arr[]= {1,2,3,4,5,6,7,8,9,10};
	   System.out.println(binarySearch(
			     arr,0,arr.length-1,9));
   }
   //it will call recursively
   public static int binarySearch(
              int arr[],int first,int last,int key)
   {
if(first<=last)
 {
	 int mid =first+(last-first)/2;
	 if(arr[mid]==key)
	 {
		 return key;
	 }
	 if(arr[mid]>key)
	 {
		 return binarySearch(arr,first,mid-1,key);
	 }
	 return binarySearch(arr,mid+1,last,key);
    }
   return -1;
}
   
   
}
