package com.bridgelabz.week1;


public class WindChill {
	public static void main(String[] args) {
		double cel;
		double t = Double.parseDouble(args[0]);
		System.out.println("Temperature: " +t);
		cel=(t-32)*(0.5556);
		System.out.println("Temperature in Fahreheit: " +cel);
		double v = Double.parseDouble(args[1]);
		System.out.println("Wind speed: " +v);
		
		double a= Math.abs(cel);
		boolean isTemp = (a <= 50 && v>=3 && v<=120 );
		if(isTemp==true) 
		{
	
		double w=35.74+0.6215*t+(0.4275*t-35.75)*(Math.pow(v, 0.16));
		System.out.println("Wind chill: " +w);
		}
		else
		{
			System.out.println("Please enter the correct temperature and wind speed");
		}		
	}	
}
