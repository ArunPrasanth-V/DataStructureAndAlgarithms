package twoDarray;
//very very simple swap concept 
public class TwoDarrayINTERCHANGErowANDcolumn {

	public static void main(String[] args) {
	// int array[][]= new int[3][4];
	 int arra[][]={{1,2,3,4,5},
		          {6,7,8,9,0}};
	 int row=2;
	 int column=5;
	 int temp=111;
	 for(int i=0;i<row;i++)
	 {
		 temp=arra[0][2];//temp will store that element
		 arra[0][2]=arra[0][4];//replace that element 
		 arra[0][4]=temp;//temp return that element in the index
		 temp=arra[1][2];
		 arra[1][4]=temp;
		 for(int j=0;j<column;j++)
		 {
			 System.out.print(arra[i][j]+" ");
		 }
		 System.out.println();
	 }
	}
}