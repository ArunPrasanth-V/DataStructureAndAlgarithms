package ArraysAndThereFunction;

import java.util.Arrays;
//its not working properly
public class RearrangeArrayAlternately 
{
	public static void work(int arr[],int n)
	{
		int maxind=n-1;
		int minind=0;
		for(int i=0;i<n;i++)
		{
			if(i%2==0)
			{
				arr[i]+=(arr[maxind]);
				maxind--;
			}
			else
			{
				minind--;
			}
		}
		
	}
public static void main(String args[])
	
{
	int array[]= {1,2,3,4,5,6};
	int size=array.length;
	work(array,size);
	Arrays.stream(array).forEach(System.out::println);

	
}
}
