package ArraysAndThereFunction;
import java.util.*;
public class InArrayBEFOREandAFTERcount 
{
  public static void main(String args[])
  {
	  Scanner scan =new Scanner(System.in);
	  int array[]= {1,2,3,4,5,6,7,8,9,10};
      System.out.println("Enter the Element you want to find");
      int value=0;
      
      int count =1;
      
      value=scan.nextInt();
     int beforeCount=0;
     int afterCount=0;
      for(int i=0;i<array.length;i++)
      {
    	  if (value>array.length)
    	  {
    		  System.out.println("You are Choosing the Wrong Distination ");
    	       break;
    	  }
    	  else
    	  {
    		  
    	  
	    	  //value 5
	    	  if(value>array[i])
	    	  {
	    		System.out.println("Before "+array[i]);
	    	  beforeCount++;
	    	  count++;
	    	  
	    	  }
	    	
	    	  
	    	  else if(value<array[i])
	    	  {
	    		  System.out.println(" After--- "+array[i]);
	    		afterCount++;
	    		
	    	  }
	    	  
	    	
    	  }
    	  
      }
    	 
     
  }

}