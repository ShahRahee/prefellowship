package com.bridgelabz.week1;

import java.util.Scanner;

class PrintThreeNames
{ 
static String wordReverse(String str) 
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
				result = result + str.charAt(start++); 
			
			result += ' '; 
			
			end = i; 
		} 
		i--; 
	} 
	
	start = 0; 
	while(start != end) 
		result = result + str.charAt(start++); 
	
	return result; 
} 

 
public static void main(String[] args) 
{   
	String str;
    Scanner sc = new Scanner(System.in);
    str=sc.nextLine();
	//String str = "Hello , How are you ?"; 
	System.out.println(str);
	System.out.print(wordReverse(str)); 
} 
} 



