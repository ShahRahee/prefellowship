package com.bridgelabz.utility;
public class Utility {
/**
 * @Purpose : Integer into binary conversion
 * @author Rahee Shah
 * @version 1.0
 * @since 22-12-2018
 * @param n
 * @return
 */
public static int getBinary(int n)
{
	 int power = 1;
	 while(power<=n/2) {
		 power = power*2;
		 }
	 	 while(power>0) {
		 if(n<power)
		 {
			 System.out.print(0);
		 }
		 else {
			 System.out.print(1);
			 n = n-power;
		 }
		 power = power / 2;
	 }
	 	 System.out.println();
		return power;
}
/**
 * @Purpose : Trigonometric function
 * @author Rahee Shah
 * @version 1.0
 * @since 22-12-2018
 * @param n
 * @return
 */
public static double Trig (double n) {
	n=Math.toRadians(n);
System.out.println("Value in Radians= " +n);
double sin=Math.sin(n);
double cos=Math.cos(n);
double tan = Math.tan(n);
System.out.println("sin= "+sin);
System.out.println("cos= "+cos);
System.out.println("tan= "+tan);
return tan;
}
/**
 * @Purpose : Harmonic function
 * @author Rahee Shah
 * @version 1.0
 * @since 22-12-2018
 * @param n
 * @return
 */
public static int getHarmonic(int n) {
double d=0.0;

while(n>0)
{
	d = d +  1.0 /n;
	
	n--;
}
System.out.println("The series of harmonic number = " 
		+ d);
return n;
}

/**
 * @Purpose :Find the percentage of the head flip or tail flip.
 * @author Rahee Shah
 * @version 1.0
 * @since 22-12-2018
 * @param n
 * @return
 */
public static void getCoinFlip () {
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

/**
 * @Purpose :Find the wind chill.
 * @author Rahee Shah
 * @version 1.0
 * @since 22-12-2018
 * @param n
 * @return
 */

public static double getWindChill(double t,double v) {
 double cel=(t-32)*(0.5556);
System.out.println("Temperature in Fahreheit: " +cel);
double a= Math.abs(cel);
boolean isTemp = (a <= 50 && v>=3 && v<=120 );
if(isTemp==true) {
	double w=35.74+0.6215*t+(0.4275*t-35.75)*(Math.pow(v, 0.16));
	System.out.println("Wind chill: " +w);
}
else{
	System.out.println("Please enter the correct temperature and wind speed");
}
return a;		
}

/**
 * @Purpose :Find the Euclidean Distance
 * @author Rahee Shah
 * @version 1.0
 * @since 22-12-2018
 * @param n
 * @return
 */

public static int getDistance(int x,int y) {
	double distance = Math.sqrt(x*x+y*y);
	System.out.println("x= " + x + "\t y= " + y);
	System.out.println("Euclidean Distace= " +distance);
	return x;
}

/**
 * @Purpose :Find the year is a Leap year
 * @author Rahee Shah
 * @version 1.0
 * @since 22-12-2018
 * @param n
 * @return
 */
public static int getLeapYear(int year) {
	
	if(year>=1582) {
	boolean isLeapYear;
	
	isLeapYear=year % 4==0;
	isLeapYear= isLeapYear && year % 100!=0;
	isLeapYear= isLeapYear || year % 400==0;
	System.out.println(isLeapYear);
}
	else {
		System.out.println("Enter the valid year");
	}
	return year;
}

/**
 * @Purpose :Find the factors of the given number
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static long getFactor(long n)
{
	 for (long factor = 2; factor*factor <= n; factor++) {

         
         while (n % factor == 0) {
             System.out.print(factor + " "); 
             n = n / factor;
         }
     }

     
     if (n > 1) System.out.println(n);
     else       System.out.println();
	return n;
 }

/**
 * @Purpose :Program for temperature conversion.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static int getTemp(int temp) {
	int celsius = (temp*9/5)+32;
	int fahrenheit = (temp-32)*5/9;
	System.out.println("Temperature in Celsius: " +celsius);
	System.out.println("Temperature in Fahrenheit: " +fahrenheit);
	return fahrenheit;
}

/**
 * @Purpose :Program for printing prime number
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static int getPrime(int n) {
	String prime =  " ";
	for(int i =1;i<=n;i++)
	{ 
		int counter=0;
		for(int j=i;j>=1;j--) {
		if(i%j == 0)
		{
			counter = counter +1;
			
		}
		}
		if(counter==2){
			prime = prime + i + " ";
			}
		}

	System.out.println("The prime number between 1 to " +n+ " is:");
	System.out.println(prime);
	return n;
}

/**
 * @Purpose :Program for printing power of two.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static int getPower2 (int n) {
	int i=0;
	int count =1;
	 while(i<=n && i<31 )
	 {
		 System.out.println(i + " = " + count);
		 count = 2 * count;
		 i++;
	 }
	return count;
	
}

/**
 * @Purpose :Program to find the day and month.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static int getDayOfWeek(int m,int d,int y) {
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
return d0;
}

/**
 * @Purpose :Program to find amount and the interest.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static double getLoan(double p,double y,double r) {
	System.out.println("Principle amount= "+p+"\t No. of years= " +y+ 
			"\t Rate of Interest= "+r);
	double R=r/(100*12);
	double n=(12*y);
	double payment = (p*R)/(1- (Math.pow((1+r), (-n))));
	double interest= payment*n-p;
	System.out.println("Monthly Amount= "+payment);
	System.out.println("Interest amount= "+interest);
	return interest;	
}

/**
 * @Purpose :Program to find Cosine series.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static double getCos(double x) {
	 x = x % (2*(Math.PI));  
	double term = 1.0;
	  double sum = 0.0;
	   
	  for(int i =1 ; term !=0.0;i++)
	  {
		  term = term * (x/2);
		 if(i % 4 == 2)
		 {
			 sum = sum + term;
		 }
		 if(i % 4 == 4)
		 {
			 sum = sum - term;
		 }	 
	  }
	  System.out.println(sum);
	return x;
}

/**
 * @Purpose :Program to find output for the double number.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static double getDOpt(double a, double b ,double c ) {
	  System.out.println("a+b*c = " + (a+b*c));
		System.out.println("a*b+c = " + (a*b+c));
		System.out.println("c+a/b = " + (c+a/b));
		System.out.println("a%b+c = " + (a%b+c));
		return c;
}

/**
 * @Purpose :Program to find percentage of win in gambling stimulator.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static int getGambler(int stake, int goal, int trails) {
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
	return win;	
}

/**
 * @Purpose :Program to find the expression for integer input.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static int getIopt(int a, int b, int c) {
	System.out.println("Enter  number c="+c);
	System.out.println("a+b*c = " + (a+b*c));
	System.out.println("a*b+c = " + (a*b+c));
	System.out.println("c+a/b = " + (c+a/b));
	System.out.println("a%b+c = " + (a%b+c));
	return c;
}

/**
 * @Purpose :Program to find the expression for quadratic equation.
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static double getQuad(double x,double y,double z) {
	double quadratic = (y*y -4.0*z*x);
	double root = Math.sqrt(quadratic);
	System.out.println("Quadratic equation: " +quadratic);
	System.out.println("Root of Quadratic equation: " +root);
	if(quadratic<0.0)
	{
		System.out.println("No real roots");
	}
	else
	{
	double root1 = (-y-root)/2.0;
	double root2 = (-y+root)/2.0;
	System.out.println("case1: " +root1+ " case2: " +root2);
	}
	return root;
}

/**
 * @Purpose :Program to find the second largest and second smallest number
 * @author Rahee Shah
 * @version 1.0
 * @since 24-12-2018
 * @param n
 * @return
 */
public static void getLargestSmallestNum(){
	int arr[]= {5,23,61,98,6};
	int S_Largest = arr[0];
	int Largest = arr[0];
	int S_Smallest = arr[0];
	int smallest = arr[0];
	
	for(int i =0 ; i<arr.length; i++)				
	{
		System.out.println(" The array is:"+arr[i]);
		if(arr[i]>Largest){
			S_Largest=Largest;
			Largest=arr[i];
		}
		else 
			if(arr[i]>S_Largest) {
			S_Largest=smallest;
			smallest=arr[i];
		}
		if(arr[i]<S_Smallest)
		{
			S_Smallest=smallest;
			smallest=arr[i];
		}
		else 
			if(arr[i]<S_Smallest)
			{
				S_Smallest = arr[i];
			}
	}
	System.out.println("The Second Largest no. =" +S_Largest);
	System.out.println("The Second smallest no. =" +S_Smallest);
}


/**
 * @Purpose :Program to find the reverse of the sentence.
 * @author Rahee Shah
 * @version 1.0
 * @since 23-12-2018
 * @param n
 * @return
 */
 public static String wordReverse(String str) 
{ 	
	 int i = str.length() - 1; 
	int start, end = i + 1; 
	String result = ""; 	
	while(i >= 0) 
    { 
        if(str.charAt(i) == ' ') 
        { 
            start = i + 1; 
            while(start != end) 
                result =result + str.charAt(start++); 
              
            result =result + ' '; 
            end = i; 
        } 
        i--; 
    } 
      
    start = 0; 
    while(start != end) 
        result = result + str.charAt(start++); 
      
    return result; 
} 

 /**
  * @Purpose :Program to find the sine vlaue.
  * @author Rahee Shah
  * @version 1.0
  * @since 23-12-2018
  * @param n
  * @return
  */
 public static double getSin(double x) {
		x = x % (2 *(Math.PI));
		
		double term = 1.0;
		double sum = 0.0;
		for(int i = 1 ; term != 0.0 ; i++ ) {
			term = term * (x/i);
			if(i % 4 == 1)
			{
				sum = sum + term;
			}
			if(i % 4 == 3)
			{
				sum = sum - term;
			}
		
		}
		System.out.println(sum);
		return sum;
 }
 
 /**
  * @Purpose :Program to find month and day which lies in spring season.
  * @author Rahee Shah
  * @version 1.0
  * @since 23-12-2018
  * @param n
  * @return
  */
 public static int getSpringSeason(int day, int month){
	 boolean isSpring =  (month == 3 && day >= 20 && day <= 31)
             || (month == 4 && day >=  1 && day <= 30)
             || (month == 5 && day >=  1 && day <= 31)
             || (month == 6 && day >=  1 && day <= 20);

System.out.println("Day and month entered are " +isSpring);
return month;
 }
 
 /**
  * @Purpose :Program to find square root
  * @author Rahee Shah
  * @version 1.0
  * @since 23-12-2018
  * @param n
  */
 public static void getSqrt(double c) {
		double epsilon = 1.0e-15;
		double t=c;
		while(Math.abs(t-c/t)>epsilon*t)
		{
			t = (c/t+t)/2;
		}
		System.out.println(t);
 }
 
 /**
  * @Purpose :Program to find square root
  * @author Rahee Shah
  * @version 1.0
  * @since 23-12-2018
  * @param n
  */
 public static void getK() {
	 int n= 5,i,j,k;
		for (i=0;i<=8;i++) {
			for(j=0;j<2;j++) {
				System.out.print("*");
			}
			for(k=0;k<=5;k++) {
				if(k==n) {
					System.out.print("**");
				}
				else {
					System.out.print(" ");
				}
			}
			if(i<=4) {
				n--;
			}
			else if(i<=8) {
				n++;
			}
			System.out.println(" ");
		}
 }
 public static void getD() {
	 System.out.println("         ");
		int x, y,z;
		for(x=0;x<=11;x++) {
			for(y=0;y<=2;y++) {
				System.out.print("*");	
			}
			for(z=1;z<=5;z++) {
				if(x>=0 && x<2 || x>9 && x<=11 || z==5 ) {
				System.out.print("**");
			}else {
				System.out.print("  ");
			}
				}
			for(y=0;y<=1;y++) {
				if(x>=0 && x<2 || x>9 && x<=11) {System.out.print(" ");
				}
				}
			System.out.println();
		}
 }
 
 public static void getW() {
	 System.out.println("        ");
		
		int p,q,r,s,t;
		for(p=0;p<=11;p++) {
			for(q=0;q<=2;q++) {
				System.out.print("*");
			}
			for(r=10;r>=p;r--)
			{
				System.out.print(" ");
			}
			for(q=0;q<=2;q++) {
				System.out.print("*");
			}
			for(s=1;s<=p;s++) {
				System.out.print("  ");
			}
			for(q=0;q<=2;q++) {
				System.out.print("*");
			}
			
			for(r=10;r>=p;r--)
			{
				System.out.print(" ");
			}
			for(q=0;q<=2;q++) {
				System.out.print("*");
			}
			
			System.out.printf("\n");
		}
 }
}




