package com.bridgelabz.week1;

public class CarLoan {
	public static void main(String[] args) {
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
		System.out.println("Principle amount= "+p+"\t No. of years= " +y+ 
				"\t Rate of Interest= "+r);
		double R=r/(100*12);
		double n=(12*y);
		double payment = (p*R)/(1- (Math.pow((1+r), (-n))));
		double interest= payment*n-p;
		System.out.println("Monthly Amount= "+payment);
		System.out.println("Interest amount= "+interest);
		
	}

}
