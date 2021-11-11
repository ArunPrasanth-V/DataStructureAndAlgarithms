package stream;

import java.util.Arrays;
public class AccendingSorttedOreder
{
  public static void main(String args[])
  {
	  int arr[]= {1,5,3,2,4};
	  char ch[]= {'a','i','u','u','v','j','i'};
	  int n=arr.length;
	  System.out.println("THE Element");
     //System.out.println( Arrays.binarySearch(arr, 5));
	 Arrays.stream(arr).forEach(System.out::print);
  }
}
