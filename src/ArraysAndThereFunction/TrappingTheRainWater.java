package ArraysAndThereFunction;

import java.util.Arrays;

//it is a important program it will asked in all top company
//trapping of water..
public class TrappingTheRainWater
{
  public static void main(String args[])
  {
     	  int []arr= {5,2,2,4,5};
          int count =0;
     	  int max=5;
     	  int temp;
    // as you know the conditions that All
     	
    for(int i=0;i<arr.length;i++)
    {
      if(arr[0]>=max &&arr[4]>=max)
      {
    	  temp=arr[i];
    	  do
    	  {
    		  arr[i]=arr[i]+1;
    		  count++;
    	  }
    	 while(arr[i]!=max);
    	  arr[i]=temp;
      }
// trapping of the water is look little Bit complicated 
   //i need to run different Time Complexity

      
//         ______     
//     /\  ||    |  ||    ||   |\  | 
      //\\ || \---  ||    ||   | \ | 
     //--\\||  \    ||____||   |  \|
     
      
      if(arr[i]<max&& arr[i+1]<max)
      {
    	  
      }
      
    }
     System.out.println(count);	  
     Arrays.stream(arr).forEach(System.out::println);
  }
}
