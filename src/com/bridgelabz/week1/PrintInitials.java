package com.bridgelabz.week1;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrintInitials {
public static void main(String[] args) {
	boolean letter=false;
	System.out.println("1.To print letter K,press 1");
	System.out.println("2.To print letter K and D,press 2 " );
	System.out.println("3.To print letter K, D and W,press 3 ");
	Scanner sc= new Scanner(System.in);
	int i=sc.nextInt();
	
	switch(i) {
	case 1:
		letter=true;
	Utility.getK();
	break;
	
	case 2:
		letter=true;
		Utility.getK();
		Utility.getD();
	break;
	case 3:
		letter = true;
		Utility.getK();
		Utility.getD();
		Utility.getW();
		break;
	default :
		System.out.println("Invalid input");
		break;
	}
	
	}
	}
	

	


