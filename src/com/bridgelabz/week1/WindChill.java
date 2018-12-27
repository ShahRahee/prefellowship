package com.bridgelabz.week1;

import com.bridgelabz.utility.Utility;

public class WindChill {
	public static void main(String[] args) {

		double t = Double.parseDouble(args[0]);
		System.out.println("Temperature: " +t);
			double v = Double.parseDouble(args[1]);
		System.out.println("Wind speed: " +v);
		Utility.getWindChill(t, v);
		
	}	
}
