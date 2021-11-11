package hashMap;
/*         .........MAP..........
 * Type:
 *      1) HashMap 2)HashTabel   3) treeHashMap
 *      4) LinkedHashMap .     
 *               
 * What is Map :
 *    # Map is a Interface in java
 *    # Map consist of Key and value pair...
 *    # Each key and value is called as the Entry.
 *    # Map only contain the unique key .
 *      Duplicate keys are strightly not allowed
 *    # Map is a easy to use if you have to search ,
 *      update or delete element on the basis of keys..
 *    
 *     
 *     EG:
 *       # search student based on their roll number..
 *       #fetch customer details from DB based on their customer is 
 *         and so on. 
 *         
 *         
 *         
 * HashMap:
 *       # java HashMap a class which implements the interface
 *       # A HashMap also contain values based on the keys 
 *       and only unique element
 *       # it may have null key and multiple null values.
 *       # Main point - it does not store value in order
 *       #              
 *         
 * 
 */
import java.util.*;
public class Theory 
{
  public static  void main (String args[])
  {
//HashMap Implementation
	  // we can also use this type 
	  //HashMap<> obj=new HashMap<>();  .. but it is not type safe..
	  HashMap<String ,String > obj=new HashMap<>();
	  // it will not display is proper order
	  //it will display the element only once
	  //dup will not print 
	    obj.put("10","Value");  
	    obj.put("20","Value"); 
	    obj.put("1","java"); 
	    obj.put("2","kk"); 
// it will display all the element 
	  System.out.println(obj);
//it will display specific  element by accessing the key
	  String value=obj.get(10);
	  System.out.println("The value is : "+value);
//Entry of map   
	  for (Map.Entry<String ,String> data:obj.entrySet())
	  {
		  System.out.println("the form MAP "+data.getKey()+" and vale "
				  +data.getValue());
		  
	  }
  }
}
