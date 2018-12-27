package com.bridgelabz.week1;
import java.util.Scanner;


import com.bridgelabz.utility.Utility;
public class PrimeNumbers {
public static void main(String[] args) {
	int n;
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the range of numbers");
	n = scn.nextInt();
	Utility.getPrime(n);
			}
}

