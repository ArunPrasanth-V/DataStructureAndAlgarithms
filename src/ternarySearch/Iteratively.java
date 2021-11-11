package ternarySearch;

public class Iteratively {
public static void main(String args[])
{
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	System.out.println(iterate(arr,0,arr.length-1,11));
}
public static int iterate(int arr[],int first,int last,int key)
{
	
	while(last>=first)
	{
		int mid1 = first + (last - first) / 3; 
        int mid2 = last - (last - first) / 3; 
		if(arr[mid1]==key)
		{
			return key;
		}
	else if(arr[mid2]==key)
		{
			return key;
		}
	else if(key < arr[mid1])
		{
			last=mid1-1;
		}
	else if(key>arr[mid2])
		{
			first=mid2+1;
		}
     else
		{
			first=mid1+1;
			last=mid2-1;
		}
	}
	return -1;
}
}
