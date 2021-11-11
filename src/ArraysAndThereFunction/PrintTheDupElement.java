package ArraysAndThereFunction;
import java.util.*;
public class PrintTheDupElement 
{
  public static void main(String args[])
  {
	  int arr[]= {1,2,2,4,5,6,6,4,7};
	  int n=arr.length;
	  
	  boolean visited[]=new boolean[n];
	  Arrays.fill(visited, false); 
	  for (int i = 0; i < n; i++) { 
			if (visited[i] == true) 
				continue; 

			int count = 1; 
			for (int j = i + 1; j < n; j++) 
			{ 
				if (arr[i] == arr[j])
				{ 
					//incoming values are set to true..
					visited[j] = true; 
					count++; 
				} 
			} 
		if(count >2)
		{
				 
		}	
		else
		{
			System.out.println(arr[i]);
		}

	  }
	  
  }
}
