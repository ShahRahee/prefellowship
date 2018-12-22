package com.bridgelabz.week1;
import java. util.Scanner;
public class TemperatureConversion {
private static Scanner scn;

public static void main(String[] args) {
	int celsius,fahrenheit;
	scn = new Scanner(System.in);
	System.out.println("Enter the temperature");
	int temp=scn.nextInt();
	celsius = (temp*9/5)+32;
	fahrenheit = (temp-32)*5/9;
	System.out.println("Temperature in Celsius: " +celsius);
	System.out.println("Temperature in Fahrenheit: " +fahrenheit);
	
	}
}
