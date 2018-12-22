package com.bridgelabz.week1;
public class DoubleOpt{
public static void main(String args[]){

	double a= Double.parseDouble(args[0]);
	double b= Double.parseDouble(args[1]);
	double c= Double.parseDouble(args[2]);
    System.out.println("a+b*c = " + (a+b*c));
	System.out.println("a*b+c = " + (a*b+c));
	System.out.println("c+a/b = " + (c+a/b));
	System.out.println("a%b+c = " + (a%b+c));
    
  }
}
