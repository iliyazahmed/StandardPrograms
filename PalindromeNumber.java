package org.technoelevate.standardprograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Number...////");
		int num = scan.nextInt();
		int rev=0;
		int originalNum=num;
		while (num!=0) {
			int rem=num%10; 
			rev=rev*10+rem;
			num=num/10;
		}
		if(originalNum==rev){
	           System.out.println("Reveresed number "+num+" is a palindrome");
		}
		else
		    System.out.println("Reveresed number "+num+" is not a palindrome");
		

	}

}
