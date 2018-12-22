package com.bridgelabz.week1;
import java.util.Scanner;
public class Trig {
private static Scanner scn;

public static void main(String[] args) {
	scn = new Scanner(System.in);
System.out.print("Enter the value for various trignometric function in degree= ");
double n=scn.nextDouble();
n=Math.toRadians(n);
System.out.println("Value in Radians= " +n);
double sin=Math.sin(n);
double cos=Math.cos(n);
double tan = Math.tan(n);
System.out.println("sin= "+sin);
System.out.println("cos= "+cos);
System.out.println("tan= "+tan);

}
}
