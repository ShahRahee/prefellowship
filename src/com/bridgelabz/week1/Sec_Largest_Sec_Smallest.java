package com.bridgelabz.week1;

public class Sec_Largest_Sec_Smallest {
public static void main(String[] args) {
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
}
