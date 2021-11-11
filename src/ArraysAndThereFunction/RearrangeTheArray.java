package ArraysAndThereFunction;
//i will store it tempravery array & print it
//the Timie & Space Complexity will be High
import java.util.Arrays;

//large,small,large,small.. 
public class RearrangeTheArray 
{
public static void main (String args[])
{
	
	int arr[]= {1,2,3,4,5,6,7,8,9,10};
	int n=arr.length;
	int mid=n/2;
	int left=0;
	int right=n-1;
    
   int temp[]=new int [n];
	for(int i=0;i<n;i++)
	{
		int j=0;
		//System.out.println(maxid);
		//for these function element should be in sorted
		//create an extra space and traverse left and right side 
		if(i<n)
		{
			while(right!=mid-1&&mid!=left)
			{
		//	System.out.println(arr[right]);//54	
			temp[j]=arr[right];
			j++;
			right--;
	         //5 1 4 2 3
		  // System.out.println(arr[left]);//12
		   temp[j]=arr[left];
		   j++;
		    left++;
		    }
			
		
		}
		
		}
	if(n%2!=0)
	{
	//System.out.println(arr[mid]);
	arr[n-1]=arr[mid];
	}
	   Arrays.stream(temp).forEach(System.out::println);

}
}
