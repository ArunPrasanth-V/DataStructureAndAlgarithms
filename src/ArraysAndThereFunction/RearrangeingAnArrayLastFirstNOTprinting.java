package ArraysAndThereFunction;

import java.util.Arrays;

public class RearrangeingAnArrayLastFirstNOTprinting {
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int n=arr.length;
	reArrange(arr,0,n-1);
	Arrays.stream(arr).forEach(System.out::println);
}
public static void reArrange(int arr[],int start,int end)
{
	while(start<end)
	{
		int temp=arr[start];
		//arr[start]=arr[end];
		//arr[start+1]=arr[end];
		start++;
		end--;
		
	}
}
}
