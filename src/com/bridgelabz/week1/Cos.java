package com.bridgelabz.week1;

public class Cos {
	public static void main(String[] args) {
		double x = Double.parseDouble(args[0]);
		x = x % (2*(Math.PI));  
		double term = 1.0;
		  double sum = 0.0;
		   
		  for(int i =1 ; term !=0.0;i++)
		  {
			  term = term * (x/2);
			 if(i % 4 == 2)
			 {
				 sum = sum + term;
			 }
			 if(i % 4 == 4)
			 {
				 sum = sum - term;
			 }	 
		  }
		  System.out.println(sum);
		  }
}
