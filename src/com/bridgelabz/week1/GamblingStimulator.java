package com.bridgelabz.week1;

public class GamblingStimulator {
public static void main(String[] args) {
	int stake = Integer.parseInt(args[0]);
	int goal = Integer.parseInt(args[1]);
	int trails = Integer.parseInt(args[2]);
	
	int bet = 0;
	int win = 0;

for(int t=0;t<trails;t++) 
{
	int cash = stake;
	while(cash>0 && cash<goal)
		{
		bet++;
		if(Math.random()<0.5) {
			cash++;
		}
		else {cash--;}
		}
	if(goal==cash)
	{
		win++;
	}
}
	System.out.println(win +" wins of " +trails);
	System.out.println("% of games won " +100*win/trails);
	System.out.println("Average of bets " +bet/trails);	
}
}
