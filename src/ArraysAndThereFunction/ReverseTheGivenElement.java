package ArraysAndThereFunction;

import java.util.Arrays;
//the space complexity will be O(1).
//there is no extra array only one variable
//the time complexity will be O(n/2)..
//we are using only one while which iterate n/2 times
public class ReverseTheGivenElement {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5,6,7,8,9,10};
		int n=arr.length;
		reverse(arr,0,n-1);
		Arrays.stream(arr).forEach(System.out::println);
	}
	public static void reverse(int arr[],int start,int end)
	{
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
