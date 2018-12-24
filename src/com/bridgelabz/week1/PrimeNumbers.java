package com.bridgelabz.week1;
import java.util.Scanner;
public class PrimeNumbers {
public static void main(String[] args) {
	int n;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the range of numbers");
	n = sc.nextInt();
	String prime =  " ";
		for(int i =1;i<=n;i++)
		{ 
			int counter=0;
			for(int j=i;j>=1;j--) {
			if(i%j == 0)
			{
				counter = counter +1;
				
			}
			}
			if(counter==2){
				prime = prime + i + " ";
				}
			}
	
		System.out.println("The prime number between 1 to " +n+ " is:");
		System.out.println(prime);
			}
}

