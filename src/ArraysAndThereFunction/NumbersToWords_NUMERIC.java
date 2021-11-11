package ArraysAndThereFunction;
// i don't know what am Doing :(
public class NumbersToWords_NUMERIC {

public static void main(String args[])
{
	convertToWords(2999);
}
	
public static String numToWords(int n, String s) 
		{

	String one[] = {"",         "one ",     "two ",       "three ",    "four ",
                    "five ",    "six ",     "seven ",     "eight ",    "nine ",
                    "ten ",     "eleven ",  "twelve ",    "thirteen ", "fourteen ",
                    "fifteen ", "sixteen ", "seventeen ", "eighteen ", "nineteen "};


	String ten[] = {"",       "",       "twenty ",  "thirty ", "forty ",
                    "fifty ", "sixty ", "seventy ", "eighty ", "ninety "};
	
		        String str = "";
		       
				// if n is more than 19, divide it
		        if (n > 19)
		            str += ten[  n / 10] + one[n % 10];
		        else
		            str += one[n];
		        // if n is non-zero
		        
		        	str += s;
		        	System.out.println(str);
		        return str;
		}
public static String convertToWords(long n) 
		{
	      
    String out="";
    if(n<=100)
    {
    out += numToWords((((int)n / 100) % 10), "hundred ");
    }

    else if(n<10000) {
        out += numToWords((((int)n / 1000) % 100), "thousand ");
        }
    
    else if(n< 100000) {
    out += numToWords((((int)n / 100000) % 100), "lakh ");
    }
    
    else  if(n<10000000) {
        out += numToWords(((int)n / 10000000), "crore ");
        }
    if (n > 100 ) out += "and ";

    // handles digits at ones and tens places (if any)
    out += numToWords(((int)n % 100), "");

    return out;

		}

}
//promise....