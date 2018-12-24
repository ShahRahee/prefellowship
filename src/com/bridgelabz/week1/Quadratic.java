package com.bridgelabz.week1;

public class Quadratic {
	public static void main(String[] args) {
	double x = Double.parseDouble(args[0]);
	double y = Double.parseDouble(args[1]);
	double z = Double.parseDouble(args[2]);
	
	double quadratic = (y*y -4.0*z*x);
	double root = Math.sqrt(quadratic);
	System.out.println("Quadratic equation: " +quadratic);
	System.out.println("Root of Quadratic equation: " +root);
	if(quadratic<0.0)
	{
		System.out.println("No real roots");
	}
	else
	{
	double root1 = (-y-root)/2.0;
	double root2 = (-y+root)/2.0;
	System.out.println("case1: " +root1+ " case2: " +root2);
	}
}
}
