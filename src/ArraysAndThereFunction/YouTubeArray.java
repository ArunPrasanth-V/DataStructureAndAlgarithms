package ArraysAndThereFunction;
import java.util.*;
//Add of Whole Element... .
public class YouTubeArray 
{
   public static void main(String args[]) {
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter the Size of An Array");
	   int sum=0;
	   int size=scan.nextInt();
	   int array[]=new int[size];
	   System.out.println("Entre the Array Number");
	   for(int i=0;i<=array.length-1;i++)//the Array index start at 0 so we put -1
	   {
		   array[i]=scan.nextInt();
	   }
	   for(int i=0;i<=array.length-1;i++)
	   {
		   System.out.print(" "+array[i]);
	   }
	   
	   for(int i: array)//sum of all number here we used the enhanced For Loop
	   {
		   sum +=i;   
		  
	   }
	   System.out.println("\nThe Addition of ALL Numbers Are :"+sum);
	 

	 
   }
   
}
