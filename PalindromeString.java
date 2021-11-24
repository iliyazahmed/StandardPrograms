import java.util.Scanner;

class PalindromeString 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number to check String is Palindrome : ");
		String str=sc.nextLine();
		String str2="";
	  
		int length=str.length();
		for (int i=length-1;i>=0 ;i-- )
		{
			str2=str2+str.charAt(i);
		}
		if (str.equalsIgnoreCase(str2))
		{
			System.out.println(str+" Is A Palindrome ");
		}
		else
			System.out.println(str+" Is Not Palindrome ");

	}
} 