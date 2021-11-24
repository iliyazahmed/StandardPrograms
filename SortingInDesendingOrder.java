package org.technoelevate.standardprograms;

import java.util.Scanner;

public class SortingInDesendingOrder {

	public static void main(String[] args) {
		   Scanner scan = new Scanner(System.in);
	       System.out.println("Enter the integers....");
	       int [] arr=new int[5];
	       for(int i=0;i<arr.length;i++) {
	    	      arr[i]=scan.nextInt(); 
	       }
	       System.out.println("My Array Contains below integers");
	       for(int j=0;j<arr.length;j++) {
	    	   System.out.print(arr[j]+", ");
	       }
	       // for descending order in sorting
	       for (int i = 0; i < arr.length; i++) {
			   for (int j = i+1; j < arr.length; j++) {
				   if(arr[i] < arr[j]) {  
	                   int temp=0;
					   temp = arr[i];  
	                   arr[i] = arr[j];  
	                   arr[j] = temp;  
	               }   
			}
		}
	       System.out.println("Elements of array sorted in descending order: ");  
	       for (int i = 0; i < arr.length; i++) {   
	           System.out.print(arr[i] + " ");  
	       }  
		}
	}

	
