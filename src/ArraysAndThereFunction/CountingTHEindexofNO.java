package ArraysAndThereFunction;
//Find Transition Point....
public class CountingTHEindexofNO 
{
public static void main(String args[])
{
	int array[]= {0,0,0,0,0,0,1};
	int s=array.length;
	int count=0;
	int val=0;
	for(int i=0;i<s;i++)
	{
		if(array[i]==0)
		{
			count++;
		}
		val=array[i]!=1?-1:count;
	}
	//here it will 1th stating index
	System.out.println(val);
	
		//val=count==s?-1:count;
	//System.out.println(count==s?-1:count);

}
}