package ArraysAndThereFunction;
import java.util.*;
public class DupUsingHashmap {

	public static void main(String[] args)
	{
  int arr[]= {1,2,3,4,2,2,2,3,4,5,5};
   int n= arr.length;
  
    HashMap<Integer,Integer> val=new HashMap<>();
    for(int i=0;i<n;i++)
    {
     val.put(arr[i],arr[i]);  	
    }
    val.forEach((k,v)-> System.out.println(k));
	}

}
