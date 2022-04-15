package com.tns.c;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter First String ");
	String val = scanner.next();
	System.out.println("Enter Second String ");
	String val2 = scanner.next();
	
	val=val.toLowerCase();
	val2=val2.toLowerCase();
	
	if(val.length()!=val2.length()) {
		System.out.println("Both String are not Anagrams");
	}
	else if (val.length()==val2.length()) {
		char[] charArray1 = val.toCharArray();
		char[] charArray2 = val2.toCharArray();
		
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);
		
		boolean result = Arrays.equals(charArray1, charArray2);
		
		if(result==true) {
			System.out.println(val+" and "+val2+" is Anagram");
		}
		else {
			System.err.println(val+" and "+val2+" is not Anagram");
		}
		
	}
	
	}
}
