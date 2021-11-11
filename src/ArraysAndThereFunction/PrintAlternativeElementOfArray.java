package ArraysAndThereFunction;

import java.util.*;

class PrintAlternativeElementOfArray
{
	
 static void count(int array[],int size)
	{
	    for(int i=0;i<size;i++)
	    {
	        
	        
	            System.out.println(array[i]);
	           i++;
	    }
	}
	
public static void main(String args[])
    {
	System.out.println("Hello ");
        Scanner scan=new Scanner(System.in);
       // int value=scan.nextInt();
       // System.out.println("Enter the size ");
        int size=scan.nextInt();
       // System.out.println("Enter the array element  ");
        int array[]=new int[size];
        for(int i=0;i<size;i++)
        {
            array[i]=scan.nextInt();
        }
        count(array,size);
    }
}
