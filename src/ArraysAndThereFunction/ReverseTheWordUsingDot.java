package ArraysAndThereFunction;
//reverse the word cannot directly possible in java,
// Because '.' is a valid regex KeyWord
//we need to replace the dot by space

public class ReverseTheWordUsingDot {

	public static void main(String args[])
	{
		String str="am.java.coder.u.know";
		str=str.replace(".", " ");
		String arr[]=str.split(" ");
		for(int i=arr.length-1;i>0;i--)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println(arr[0]);
	}
	

}
