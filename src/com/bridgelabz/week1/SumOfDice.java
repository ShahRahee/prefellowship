package com.bridgelabz.week1;

public class SumOfDice {
	public static void main(String[] args) {
		int sides=6;
		int a = 1+(int)(Math.random()*sides);
		int b = 1+(int)(Math.random()*sides);
		
		System.out.println(a);
		System.out.println(b);
		
		int sum = a + b;
		System.out.println("Sum of the two dice= " +sum);
	}

}
