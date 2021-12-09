package org.technoelevate.standardprograms;

import java.util.Scanner;

public class CheckVowelOrConsonant {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Character to check whether vowel or consonant.....");
		char ch=scan.next().charAt(0);
		
		switch (ch) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			       System.out.println(ch+" is a vowel ");
			break;

		default:
			System.out.println(ch+" is consonant");
			break;
		}

	}

}
