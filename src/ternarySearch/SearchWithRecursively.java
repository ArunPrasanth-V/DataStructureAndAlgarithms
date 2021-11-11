package ternarySearch;

public class SearchWithRecursively {
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println(ternary(arr,0,arr.length-1,9));
}
public static int ternary(int arr[],int first,int last,int key)
{
	
	if(last>=first)
	{
		int mid1=first+(last-first)/3;
		int mid2=last-(last-first)/3;
	
		if(arr[mid2]==key)
		{
			return key;
		}
		if(arr[mid1]==key)
		{
			return key;
			
		}
		if(key<arr[mid1])
		{
			return ternary(arr,first,mid1-1,key);
		}
		if(key>arr[mid2])
		{
			return ternary(arr,mid2+1,last,key);
			
		}
		return ternary(arr,mid1+1,mid2-1,key);
	}
	return -1;
}
}
