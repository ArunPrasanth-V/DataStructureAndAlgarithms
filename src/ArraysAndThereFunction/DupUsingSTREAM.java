package ArraysAndThereFunction;
import java.util.*;
// vera vera vera level program...
public class DupUsingSTREAM 
{
  public static void main(String args[])
  {
	  int arr[]= {1,2,3,4,4,5,5,2,1};
	  String []str= {"arun","vijay","arun","vijay"};
	  Arrays.stream(str).distinct().
	         forEach(System.out::println);
	  // forEach(ele->System.out.println(ele);
	  
  }
}
