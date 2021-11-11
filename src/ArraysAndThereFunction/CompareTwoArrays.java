package ArraysAndThereFunction;
//it will compare the each Index & Element 
//if it is same then it will print it ...
public class CompareTwoArrays {

	public static void main(String args[])
	{
		int arr[]= {1,2,3,4,5};
		int arr2[]= {1,2,8,4,5,6,7};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
				
			{
				if(arr[i]==arr2[j])
				{
					System.out.println(arr2[j]);
					break;
				}
				
			}
		}
	}
}
