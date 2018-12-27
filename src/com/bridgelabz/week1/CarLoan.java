package com.bridgelabz.week1;

import com.bridgelabz.utility.Utility;

public class CarLoan {
	public static void main(String[] args) {
		double p=Double.parseDouble(args[0]);
		double y=Double.parseDouble(args[1]);
		double r=Double.parseDouble(args[2]);
	Utility.getLoan(p, y, r);	}
}
