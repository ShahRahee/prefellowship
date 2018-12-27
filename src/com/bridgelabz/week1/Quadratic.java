package com.bridgelabz.week1;

import com.bridgelabz.utility.Utility;

public class Quadratic {
	public static void main(String[] args) {
	double x = Double.parseDouble(args[0]);
	double y = Double.parseDouble(args[1]);
	double z = Double.parseDouble(args[2]);
	Utility.getQuad(x, y, z);
}
}
