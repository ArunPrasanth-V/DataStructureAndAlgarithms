package ArraysAndThereFunction;
import java.util.*;
public class DupFINDusingSet 
{
  public static void main(String args[])
  {
	  int arr[]= {1,2,2,3,4,5,5,6,7};
	  int n=arr.length;
	  Set<Integer> val=new HashSet<>();
	  for(int i=0;i<n;i++)
	  {
		  val.add(arr[i]);
	  }
	  val.forEach(valll-> System.out.println(valll));
  }
}
