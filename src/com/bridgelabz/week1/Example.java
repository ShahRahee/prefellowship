package com.bridgelabz.week1;

public class Example {
	public static void main(String args[])
	{
		System.out.println("Main Class");
		ABC a= new ABC();
		a.m1(10,20);
	}
	}
class ABC{
	void m1(int x,int y)
	{
	
		System.out.println("Th numbers are " + x + " and " +y);
	}
}

