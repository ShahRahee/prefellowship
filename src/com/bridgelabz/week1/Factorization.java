package com.bridgelabz.week1;

import com.bridgelabz.utility.Utility;

public class Factorization {
	public static void main(String[] args) {
       long n = Long.parseLong(args[0]);

        System.out.print("The prime factorization of " + n + " is: ");
        Utility.getFactor(n);
	}
}


