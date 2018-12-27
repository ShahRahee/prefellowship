package com.bridgelabz.week1;

import com.bridgelabz.utility.Utility;

public class SpringSeason { 
    public static void main(String[] args) { 
        int month = Integer.parseInt(args[0]);
        System.out.println("Enter the month: " +month);
        int day   = Integer.parseInt(args[1]);
        System.out.println("Enter the day: " +day);
       Utility.getSpringSeason(day, month);
    }
}
