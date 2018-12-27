package com.bridgelabz.week1;

import java.util.Scanner;

public class PrintInitials {
public static void main(String[] args) {	
	int n= 7;
	for(int i =0;i<n;i++)
	{
		for(int j=0;j<=n/2;j++)
		{
		    if ((j == 0 || j == n / 2) && i != 0 ||
                    i == 0 && j != 0 && j != n/2 ||  
                    i == n / 2) {
				System.out.println("*");
			}
			else{
				System.out.println(" ");
			}
		}
		System.out.println();
	}
}
}

