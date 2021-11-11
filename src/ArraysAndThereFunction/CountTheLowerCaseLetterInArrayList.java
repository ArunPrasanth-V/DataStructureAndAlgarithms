package ArraysAndThereFunction;
import java.util.*; 
public class CountTheLowerCaseLetterInArrayList {

	public static void main(String[] args) {
//i need to find no. of lower case letter in an array
//list without the duplicate element 
		String str= "ARUN ";

		int word=(int)str
				.chars()
				.filter(Character::isLowerCase)
				.distinct()
				.count();
		
				//.System.out.print(str);
		if(word==0)
		{
			System.out.println("No words Found");
		}
		else
		{
	        System.out.println(word);
		}
	}

}
