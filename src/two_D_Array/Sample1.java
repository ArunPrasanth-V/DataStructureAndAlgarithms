package two_D_Array;

import java.util.Arrays;

public class Sample1 {

	public static void main(String args[])
	{
		 int arr[][]= {   
				        {1,2,3,4,5,6},
				        {7,8,9,10,11,12},
					    {13,14,15,16,17,18}
		              };
		for(int[]i:arr)
		{
			for(int j:i)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
