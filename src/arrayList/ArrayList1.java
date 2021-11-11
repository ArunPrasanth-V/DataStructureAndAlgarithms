package arrayList;

import java.util.*;


//i need print the even NO.
//in sorted order
//distinct
public class ArrayList1 
{
	public static void main(String args[])
	{
   List<Integer> number=Arrays.asList(1,2,3,4,5,1,2,3,4,5);
   
      number.stream()
      //.filter(e->e%2==0)
      //.sorted()
      .distinct()
      .forEach(System.out::println);
	}
}
