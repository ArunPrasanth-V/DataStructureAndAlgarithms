package ArraysAndThereFunction;

public class NUMtoWORDS {
	static  String []once= {" ","one ","two ","three ","four ","five ",
		    "six ","seven ","eight ","nine ",
            "ten ","eleven ",  "twelve ","thirteen ", "fourteen ",
            "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};
	
	static String []tense= {" "," ","twenty ",  "thirty ", "forty ",
                    "fifty ", "sixty ", "seventy ",
                    "eighty ", "ninety "};
public static void main(String args[])
{
	totalfun(1234567890);
	}

public static String totalfun(long n)
{
   if(n<100)
   {
	   fun(n);
   }
   if(n>99&&n<1000)
   {
	   System.out.print(once[(int)n/100]+"Hundreden ");
       System.out.println(totalfun(n%100));
   }
   else if(n>=1000&&n<=1000_0)
   {//below 10 Thousand
	   System.out .print(once[(int)n/1000]+"Thousand ");
	   System.out.print(totalfun(n%1000));
   }
   else if(n>1000_0&&n<1000_00)
   {//below 1 Lack
	   System.out.print(totalfun(n/1000)+"Thousand ");
	   System.out.print(totalfun(n%1000));
   }
   else if(n>1000_00&&n<1000_000)
   {//below 10 Lack

	   System.out.print(totalfun((int)n/1000_00)+"Lack ");
	   System.out.print(totalfun(n%1000_00));
   }
   else if(n>1000_000&&n<1000_000_0)
   {//below 1 crore

	   System.out.print(totalfun((int)n/1000_00)+"Lack ");
	   System.out.print(totalfun(n%1000_00));
   }
   else if(n>1000_000_0&&n<1000_000_00)
   {//below 10 crore
	
	   System.out.print(totalfun((int)n/1000_000_0)+"crore ");
	   System.out.print(totalfun(n%1000_000_0));  
   }
   else if(n>1000_000_00&&n<1000_000_000)
   {//below 1 Billion
	 
	   System.out.print(totalfun((int)n/1000_000_0)+"crore ");
	   System.out.print(totalfun(n%1000_000_0));  
   }
   else {
	   System.out.println("GO And FU*K YOUR SELF");
   }
  
	return " ";
}
public static String fun(long n)

{
 
	if(n<20 )
	{
		System.out.print(once[ (int)n]);
	}
	else if(n<100&&n>19)
	{
		System.out.print(tense[(int) (n/10)]+once[(int) n%10]);
	}
	return " ";
}
}
