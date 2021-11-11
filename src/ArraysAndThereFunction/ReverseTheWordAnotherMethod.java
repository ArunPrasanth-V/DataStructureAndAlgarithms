package ArraysAndThereFunction;
import java.util.*;
public class ReverseTheWordAnotherMethod 
{
public static void main(String args[])
{
     String word="arun.  varun. tharun";
     int len=word.length();
     String w[]=word.trim().split("\\word+");
     Collections.reverse(Arrays.asList(w));
     String.join(" ",w);
    
    
}
}
