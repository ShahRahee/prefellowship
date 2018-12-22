package com.bridgelabz.week1;

public class Distance {
	public static void main(String[] args) {
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		double distance = Math.sqrt(x*x+y*y);
		System.out.println("x= " +args[0]+ "\t y= " +args[1]);
		System.out.println("Euclidean Distace= " +distance);
	}

}
