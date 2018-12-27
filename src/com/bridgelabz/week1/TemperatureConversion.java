package com.bridgelabz.week1;
import java. util.Scanner;

import com.bridgelabz.utility.Utility;
public class TemperatureConversion {


public static void main(String[] args) {
	
	Scanner scn = new Scanner(System.in);
	System.out.println("Enter the temperature");
	int temp=scn.nextInt();
	Utility.getTemp(temp);
	}
}
