package linkedListsAndthereConcept;
import java.util.*;
public class LinkedListTOarray 
{
  public static void main(String args[])
  {
	  LinkedList<String> call=new LinkedList();
	  call.add("am");
	  call.add("a ");
	  call.add("java Developer ");
	  System.out.println(call);
	  int size=call.size();
	  String []number=new String[size];
	  number=call.toArray(number);
	  System.out.println("After converting ");
	  System.out.println(Arrays.toString(number));
  }
}
