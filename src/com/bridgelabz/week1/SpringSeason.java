package com.bridgelabz.week1;
public class SpringSeason { 
    public static void main(String[] args) { 
    	try {
        int month = Integer.parseInt(args[0]);
        System.out.println("Enter the month: " +month);
        int day   = Integer.parseInt(args[1]);
        System.out.println("Enter the day: " +day);
        boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
                         || (month == 4 && day >=  1 && day <= 30)
                         || (month == 5 && day >=  1 && day <= 31)
                         || (month == 6 && day >=  1 && day <= 20);

        System.out.println("Day and month entered are " +isSpring);
    	}
    	catch(ArrayIndexOutOfBoundsException e)
    	{
    		System.out.println(e);
    	}
    }
}
