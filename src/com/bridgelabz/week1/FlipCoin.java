package com.bridgelabz.week1;

public class FlipCoin {
public static void main(String[] args) {
	int count = 1;
	int flip=10;
	double result;
	double temp;
	int head=0,tails=0;
	while(count<=flip) {
		result = Math.random();
		if(result<=0.5)
		{
		 head++;
		}
		else {tails++;}
		
		count++;
	}
	 temp = head + tails;
	System.out.println("heads" + head);
	System.out.println("tails" + tails);
	double perHead= ((head)/temp)*100;
	double perTail=(tails/temp)*100;
	System.out.println("Percentage of head occurence="+perHead);
	System.out.println("Percentage of tail occurence= " +perTail);
	
	
}
}
