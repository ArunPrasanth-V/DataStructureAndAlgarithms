package linkedListsAndthereConcept;
import java.util.*;
public class LinkedListFULLprogram
{
	LinkedList<String> doe=new LinkedList<String>();
	Scanner scan=new Scanner(System.in);
    Iterator<String> itr;
    LinkedList<String> temp=null;	   
	
	
   public static void main (String args[])
   {
	// I Love Main Method Is Too Small.... .   
	   Scanner scan=new Scanner(System.in);
	   
	   
		  
		   body();
	   
		   int ch=0;
	      ch=scan.nextInt();
    	   calling(ch);
		   System.out.println("\n\n");
	   

   }
   
   static void calling(int ch)
	{
		LinkedListFULLprogram call=new LinkedListFULLprogram();
		
		 switch(ch)
		   {
		         case 1: call.add();
		                 
		                 break;
		         case 2: call.delete();
		                 break;
		         case 3: call.append();
		                 break;
		         case 4: call.length();
		                 break;
		         case 5:call.display();
		                break;
		        
		   }
		   
	}
 
   static void body()
   {
	   System.out.println("  <<<LINKED LIST OPEARTION>>>\n");
	   System.out.println("PRESS");
	   System.out.println("1.   Add An Element");
	   System.out.println("2.   Delete An Element");
	   System.out.println("3.   append  ");
	   System.out.println("4.   length ");
	   System.out.println("5.   Display ");
	  
	   System.out.println("\n << Enter Your Choice >> ");
   }   
   void add() {
	   int i;
	   String j;
	   System.out.println("Enter The Index");
	   i=scan.nextInt();
   	   System.out.println("Enter The Element You Want to Add");
       j=scan.next();
        doe.add(i,j);
	 
	  display();
	  call();
   }
   void call()
   {
	   
	 System.out.println("\n\nPRESS \n 1. Delete\n 2.Append\n 3.Add \n 4.Length \n 5.Exit");
	int fun=scan.nextInt();
			if(fun==1)
			{
				delete();
			}
			else if(fun==2)
			{
				append();
			}
			else if(fun==3)
			{
				add();
			}
			else if(fun==4)
			{
				length();
			}
			else
			{
				System.out.println("Thank You !!!! \n  CODING IS FUN ");
			}
   }   
   void delete() {
	   System.out.println("Elements are "+doe);
	  System.out.println("\nEnter the Index You want to delete");
	  int value;
	  value=scan.nextInt();
	
	  doe.remove(value);
	  System.out.println(doe);
	  call();
   }
   void append() {
    	
    
         int time;  
   	  
    	 // System.out.println("You Choose The Add Function ");
    	 System.out.println("Enter The No.of Element  To add");
    	  time=scan.nextInt();
    	 String name[]=new String[time];
    	  System.out.println("Enter the names ");
    	 
    	
    	  for(int i=0;i<time;i++)
    	  {
    		  
    		 
    		  doe.add(scan.next());
    	  }
    	  display();
    	  call();
    }
   void length() {
	    
	   System.out.println("Length is :: "+doe.size());
   }
   void display() {
	
	   System.out.println("The Elements are ::\n"+doe);
	  
   }
    
   {
	  
		doe.add("HEY");
		doe.add("arun");
		doe.add("HELLO");
		
		}
}
