package com.bridgelabz.week1;

public class Stats5 {
public static void main(String[] args) {
	double min,max,avg;
	double a= Math.random();
	double b= Math.random();
	double c= Math.random();
	double d= Math.random();
	double e= Math.random();
	
	System.out.println("a=" +a+ "\t b=" +b+ "\t c=" +c+ "\t d=" +d+ "\t e=" +e);
	
	avg=(a+b+c+d+e)/5;
	max=(int)(Math.max(a, (Math.max(b, (Math.max(c, (Math.max(d, e))))))));
	min=(int)(Math.min(a, (Math.min(b, (Math.min(c, (Math.max(d, e))))))));
	System.out.println("The average of 5 number= " +avg );
	System.out.println("The maximum value = " +max);
	System.out.println("The minimum value = " +min);
}
}
