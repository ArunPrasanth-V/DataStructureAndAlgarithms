package ArraysAndThereFunction;

import java.util.Scanner;

public class ArrayExOneD
{
	Scanner sc=new Scanner(System.in);
    
    int size=sc.nextInt();
    int [] array=new int[size];
    
public static void main(String args[])
    {
    	System.out.println("Enter The Size of Array");
    	ArrayExOneD n=new ArrayExOneD();
    	n.arr();
    	n.MaxMin();
     } 
    public void arr()
    {
    	System.out.println("Enter the array number");
    	  for(int i=0;i<array.length-2;i++)
          {
            array[i]=sc.nextInt();
          }
 
    	  
          for(int i=0;i<size;i++)
          {
            System.out.print("  ");
            System.out.print(array[i]);    
          }
    }
    public  void MaxMin()
    {
    	
    	int max= array[0];
        int min=array[0];     //Initialize
        for(int j=0;j<array.length;j++)
        {
        	if (array[j]>max)   //it check whether index hold number which is great 
        	{
        		max=array[j];   //then it will come inside the loop store in max value
        	}
        	if(array[j]<min)   //it check whether index hold number which is least
        	{
        		min=array[j];   ///same stuff in 42
        	}
        }
    	System.out.println("\nThe max Element is  "+max);
    	System.out.println("The max Element is  "+min);

    }
}
