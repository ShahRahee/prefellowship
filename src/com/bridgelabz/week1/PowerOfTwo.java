package com.bridgelabz.week1;

public class PowerOfTwo {
	public static void main(String[] args) {
		int n= Integer.parseInt(args[0]);
		int i=0;
		int count =1;
		 while(i<=n && i<31 )
		 {
			 System.out.println(i + " = " + count);
			 count = 2 * count;
			 i++;
		 }
	}
	

}
