// MY Dream Is Want To Become Successful & quality Programmer
package ArraysAndThereFunction;
// Do You Know How To Calculate MOD
//let Suppose we need to calculate 58 mod 10
//step 1 :58/10 === 5.8
//step 2 : we have subtract Before The Decimal Number 
//  with that Answer Then We Get ans: 0.8
//step 3 : muti with the divided Number 0.8*10 =8
public class NumberToWords {
	
static String []once= {"","ONE ","TWO ","THREE ","FOUR ","FIVE ",
		"SIX ","SEVEN ","EIGHT ","NINE ","TEN ",
		"ELEVEN ","TWELVE ","THIRTEEN ","FOURTEEN ","FIFTEEN ",
		"SIXTEEN ","SEVENTEEN ","EIGTHTEEN ","NINITEEN "};
static String [] ten= {"","","TWENTY ","THIRTY ","FOURTY ","FITHTY ",
		"SIXTY ","SEVENTY ","EIGHTY ","NINETY "};


	public static void main(String arrgs[])
	{
		mainfun(999999999);
	}
	
	public static String mainfun(long n)
	{
		if(n<100)
		{
			subfun(n);
		}
		else if(n<1000)
		{//BELOW ONE THOUSAND
			System.out.print(once[(int)n/100]+"HUNDRADEN ");
			System.out.print(mainfun(n%100));
		}
		
		else if(n<1000_00)
		{//BELOW ONE LACK
			System.out.print(mainfun(n/1000)+"THOUSAND ");
			System.out.print(mainfun(n%1000));
		}
		else if(n<1000_0000)
		{//BELOW ONE CRORE
			System.out.print(mainfun(n/1000_00)+"LACK ");
			System.out.print(mainfun(n%1000_00));
		}
		else if(n<1000_000_000)
		{//BELOW ONE CRORE
			System.out.print(mainfun(n/1000_000_0)+"CRORE ");
			System.out.print(mainfun(n%1000_000_0));
		}
		
		return "";
	}
	
	
	public static String subfun(long n)
	{
		if(n<20)
		{
			System.out.println(once[(int)n]);
		}
		else if(n<100)
		{
			System.out.println(ten[(int)n/10]+once[(int)n%10]);
		}
		
		return "";
	}
}
