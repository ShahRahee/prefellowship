package com.bridgelabz.week1;

import com.bridgelabz.utility.Utility;

public class GamblingStimulator {
public static void main(String[] args) {
	int stake = Integer.parseInt(args[0]);
	int goal = Integer.parseInt(args[1]);
	int trails = Integer.parseInt(args[2]);
	Utility.getGambler(stake, goal, trails);
}
}
