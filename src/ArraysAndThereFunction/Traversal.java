package ArraysAndThereFunction;
/*Array is an collection of element,each 
 * 
 * 
 * array is a static data structure in data Structure
 * 
 * it contain collection of homogenous elements (it maintain type safe)
 * 		
 * 
 * 
 * 1) One dimensional Array
 *    1-D array is a type of linear array in which element are stored in a continuous row	 
 *    
 *        ArrayReferenceVariable = new dataType[arraeySize];
 *        eg..
 *           myArray =new int[5]; ....new is an keyWord that allocate the memory in heap area..
 *   
 *   
 *2)Two Dimensional Array
 *    2-D array is array of array in which element are stored in rows and columns
 *    
 *3)Multi Dimensional
 *  3-D array are typically of nested array lot of data are stored 
 *
 */
public class Traversal
{
	public static void main(String args[])
	{
	int size=5;//index of 0 to 4
    int array[]=new int[size];//in java array is an object so we use the new Keyword
	//int array[]= {4,5,6,4,2};//if You know the values YOu can use this Way also..
    array[0]=8; 
	array[1]=18; 
	array[2]=28; 
	array[3]=38; 
	array[4]=48; 
	System.out.println("We can also access the specfic element by calling there index Number");
	System.out.println(array[3]);
	System.out.println("We can access the all elements by using the for Loop");
    for(int i:array) //this for is traverse each element once 
   {
	  System.out.println(i);
   }
	   
  
    }
}