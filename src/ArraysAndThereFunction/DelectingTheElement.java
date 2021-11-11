package ArraysAndThereFunction;

public class DelectingTheElement 
{
//	something wrong in this program
       public static void main(String args[])
       {
    	   int []array= {6,9,32,43,15};
    	   int location=3;
    	  int index=4;
    	   for(int i=0;i<=array.length-1;i++) 
    	   {		  
       	     System.out.print(" "+array[i]);
    	   }
      //  4,3 >2
    	  for(int i=index;i>location-1;i--)
    	   {
    		 
    		   array[i]=array[i-1];//4=5;3=4;
    	    //array[location-1]=0;
    	  // index--;
    	   }
    	  System.out.println("\nThe Element After Delecting ");
    	  for(int i=0;i<5;i++)
            {
           System.out.print(array[i]+" ");
            }
       }
}

