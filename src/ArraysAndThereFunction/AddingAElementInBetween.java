package ArraysAndThereFunction;

import java.util.*;

public class AddingAElementInBetween 
{
	
	public static void main(String[] args)
	{
	   // int location=0;
	    int value=0;
  		Scanner scan=new Scanner(System.in);
  		System.out.println("Enter The Size Of An Array");
  		int size=scan.nextInt();
  		System.out.println("Enter the Element You need");
  		int array[]=new int[size];
	    int index=size-1;
//get input from user
	
  		for(int i=0;i<=index;i++)//here  we get only the  length-3... 
  		{
  			array[i]=scan.nextInt();
  		}
//display all input
  		System.out.println(" The Element Before Deletee is : ");
  		for(int dd:array)
  		{
  			System.out.print(" "+dd);
  		}
//Get input from user which element you want to delete
  		System.out.println("Enter the Value You need to Delete :");
        value=scan.nextInt();  
//                    4,3> 2
        for(int i=index;i>value;i--)
            {     //4=       3
           	   array[i]=array[i-1];//read the value
            }      //3=2
       	   
       	   for(int i=0;i<=index;i++)
           {
       		 System.out.println(array[i]);
       	   }


     scan.close();	
	}

}
/*
*
*
*
*
*/