package com.bridgelabz.week1;
import java.util.Scanner;

import com.bridgelabz.utility.Utility;
public class Trig {


public static void main(String[] args) {
	Scanner scn;
	scn = new Scanner(System.in);
	System.out.print("Enter the value for various trignometric function in degree= ");
	double n=scn.nextDouble();
	Utility.Trig(n);
}
}
