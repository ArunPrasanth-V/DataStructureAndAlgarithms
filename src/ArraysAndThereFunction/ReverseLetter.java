package ArraysAndThereFunction;
import java.util.*;
public class ReverseLetter
{
    public static void main(String args[])
    
    {
    	Scanner scan=new Scanner(System.in);
    	String result="";
    	System.out.println("Enter the Char");
    	String str=scan.nextLine();//my input arun  0 to 3
    	char ch[]=str.toCharArray();//          n           U      r         a          false  
    	for(int i=ch.length-1;i>=0;i--) //3>=0 true --,2>=0 true,1>=0 true 0>=0 true ..,-1>=0 false
        {
    	    result+=ch[i];//step 1:)n..2)nu 3)nur 4)nura 
        }
    	//i--;
        System.out.println("THE REVERSE STRING IS :\n"+result);
    }
}

/*
*DRY RUN
*   First it will Convert into the Char because char can scan one by one so we need to convert into the char
*   
*   then YOu can see that Line YOu Understand clearly..
*
*/