package arrayList;
//these program is rotate an element in an arrauList
import java.util.ArrayList;

public class RotateInArrayList {
public static void main(String args[]) {
	ArrayList<Integer> arr=new ArrayList<Integer>();
	 arr.add(1);
	 arr.add(2);
	 arr.add(3);
	 arr.add(4);
	 arr.add(5);
	 arr.add(6);
	 arr.add(7);
	int n=arr.size();
	System.out.println("size "+n);
	int k=3;
	reverseInGroups(arr,n,k);
	}
 
static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
 //now the idea of these ArrayList is to reverse the 
	//two set of element then reverse  whole arrayList
	reverse(arr,0,k-1);
    reverse(arr,k,n-1);
    reverse(arr,0,n-1);
   for(int i=0;i<n;i++)
   {
       System.out.print(arr.get(i)+" ");
   }
      
  }
  public static void reverse(ArrayList<Integer> arr,int start,int end)
  {
	  while(start<end)
      {
          int temp=arr.get(start);
          arr.set(start,arr.get(end));
          arr.set(end,temp);
          start++;
          end--;
      }
  }
}
