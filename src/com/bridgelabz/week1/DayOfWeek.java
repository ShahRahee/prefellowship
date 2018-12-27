package com.bridgelabz.week1;

import com.bridgelabz.utility.Utility;

public class DayOfWeek {
	public static void main(String[] args) {
		int m= Integer.parseInt(args[0]);
		int d= Integer.parseInt(args[1]);
		int y= Integer.parseInt(args[2]);
		Utility.getDayOfWeek(m, d, y);
	}

}
