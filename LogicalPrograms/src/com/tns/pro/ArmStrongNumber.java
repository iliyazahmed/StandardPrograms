package com.tns.pro;

import java.util.Scanner;

class ArmStrong // 153,370 are examples for armstrong.
{
	public static void main(String[] args) 
	{
		int rem,sum=0;
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number ");
		int num = sc.nextInt();
		int originalNum=num;
		while(num!=0)
		{
			rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(sum==originalNum)
		{
		System.out.println(originalNum+" is an Armstrong Number");
		}
		else
			System.out.println(originalNum+" Not a Armstrong Number");
	}
}