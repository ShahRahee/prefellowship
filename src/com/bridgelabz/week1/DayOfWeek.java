package com.bridgelabz.week1;



public class DayOfWeek {
	public static void main(String[] args) {
		int m= Integer.parseInt(args[0]);
		int d= Integer.parseInt(args[1]);
		int y= Integer.parseInt(args[2]);
		String dayString;
		String monthString = null;
		switch(d) {
		case 1:
			dayString = "Monday";
		break;
		
		case 2:
			dayString = "Tuesday";
		break;
		
		case 3:
			dayString = "wednesday";
		break;
		case 4:
			dayString = "Thursday";
		break;
		case 5:
			dayString = "Friday";
		break;
		case 6:
			dayString = "Saturday";
		break;
		case 0:
			dayString = "Sunday";
		break;
		default:
			dayString = "Invaild day";
			break;
		}
		System.out.println("Its " +dayString);
		switch(m)
		{
		case 1:
			monthString = "January";
		break;
		case 2:
			monthString = "Feb";
		break;
		case 3:
			monthString = "March";
		break;
		case 4:
			monthString = "April";
		break;
		case 5:
			monthString = "May";
		break;
		case 6:
			monthString = "June";
		break;
		case 7:
			monthString = "July";
		break;
		case 8:
			monthString = "August";
		break;
		case 9:
			monthString = "Sept";
		break;
		case 10:
			monthString = "Oct";
		break;
		case 11:
			monthString = "Nov";
		break;
		case 12:
			monthString = "December";
		break;
		}
		System.out.println("Its " + monthString);
		
	int y0=y-(14-m)/12;
	int x=y0+y0/4-y0/100-y0/400;
	int m0=m+12*((14-m)/12)-2;
	int d0=(d+x+31*m0/12)%7;
	//System.out.println(y0);
	System.out.println(d0);
	//System.out.println(x);
    //System.out.println(m0);
	}

}
