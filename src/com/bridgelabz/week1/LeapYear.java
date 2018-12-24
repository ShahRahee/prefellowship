package com.bridgelabz.week1;

public class LeapYear
{
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		if(year>=1582) {
		boolean isLeapYear;
		
		isLeapYear=year % 4==0;
		isLeapYear= isLeapYear && year % 100!=0;
		isLeapYear= isLeapYear || year % 400==0;
		System.out.println(isLeapYear);
	}
		else {
			System.out.println("Enter the valid year");
		}
	}
}
