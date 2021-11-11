package ArraysAndThereFunction;
//fighting with darkness..
public class FindingMAXelementOFanarray 
{
public static void main(String args[])
	{
	int max=-1;
		int []arr= {1,2,5,7,8,10};
		int size=arr.length;
		for(int i=0;i<size;i++)
		{
		
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
			
			
		}
		System.out.println(max);
		
	}
}
