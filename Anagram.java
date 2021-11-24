import java.util.Scanner;
import java.util.Arrays;
class Anagram
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st String");
		String str1 = sc.next();
        System.out.println("Enter the 2nd String");
		String str2 = sc.next();
		
		str1=str1.toLowerCase(); // to change the input to lower case
		str2=str2.toLowerCase();

		if (str1.length()!=str2.length())
		{
			System.out.println(str1+" and "+str2+" are not Anagrams");
		}
		else if (str1.length()==str2.length())
		{
			// convert strings into arrays
           char[] charArray1 = str1.toCharArray();
		   char[] charArray2 = str2.toCharArray();
		   
		   //sort the char array
		   Arrays.sort(charArray1);
		   Arrays.sort(charArray2);

		   
		   boolean result = Arrays.equals(charArray1,charArray2); //to check sorted arrays are same or not

		    if(result==true)
			{
			   System.out.println(str1+" and "+str2+" are Anagrams");
			}
			else
			{
				System.out.println(str1+" and "+str2+" are Not Anagrams ");
			}

		}
	}
}
