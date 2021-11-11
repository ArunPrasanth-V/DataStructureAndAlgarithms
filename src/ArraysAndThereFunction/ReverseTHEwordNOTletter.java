package ArraysAndThereFunction;

import java.util.Arrays;

public class ReverseTHEwordNOTletter
{
	//string char ta convert pandra
	// for loop la last irrthu print pandra
	//space vantha break pandra.. 
	//atha inno ru string la po22 print prandara
  public static void main(String args[])
  {
	  String word="arun java coder";
	  int i=word.length()-1;
	  String word1[]=word.split(" ");
	  revese(word1,0,word1.length-1);
	  Arrays.stream(word1).forEach(System.out::println);
	}
 public static void revese(String word[],int start,int end)
 {
	 while(start<end)
	 {
		 String temp=word[start];
		 word[start]=word[end];
		 word[end]=temp;
		 start++;
		 end--;
		 
	 }
 }
}
