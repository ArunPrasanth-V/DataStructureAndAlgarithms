package linkedListsAndthereConcept;
import java.util.*;
public class LinkedListLIST 
{
public static void main(String args[])
{
	 Scanner scan=new Scanner(System.in);
	 LinkedList<String> d=new LinkedList<String>();
	 int no=scan.nextInt();
	 for(int i=0;i<no;i++)
	 {
		 d.add(scan.next());
		 
	 }
	 System.out.println("LinkedList Element are"+d);
	 String []num=new String[no];
	 num=d.toArray(num);
	 for(int i=no-1;i>=0;i--)
	 {
		 System.out.println(num[i]);
	 }
	 System.out.println();
}
}
