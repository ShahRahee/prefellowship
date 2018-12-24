package com.bridgelabz.week1;

public class HarmonicNumber {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		System.out.println(n);
		double d=0.0;
	
		while(n>0)
		{
			d = d +  1.0 /n;
			
			n--;
		}
		System.out.println("The series of harmonic number = " 
				+ d);
	}

}
