package basicprograms;

import java.util.Scanner;

public class StrongNumber {
     public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter to Check the Strong NUmber...");
		                       //145 is best example
		int num=scan.nextInt();
		int sum=0;
		int temp=num;
		while(num!=0) {
			int i=1;
			int fact=1;
			int rem=num%10;
			while (i<=rem) {
				fact=fact*i;
				i++;
			}
			sum=sum+fact;
			num=num/10;	
		}
		if(sum==temp) {
			System.out.println(temp+" is Strong Number...");
		}
		else {
			System.out.println(temp+" is Not a Strong Number...");
		}
		
	}
}
