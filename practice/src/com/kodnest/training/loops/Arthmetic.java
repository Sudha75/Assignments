package com.kodnest.training.loops;
import java.util.*;
public class Arthmetic {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the first number");
	long num1=scan.nextLong();
	System.out.println("Enter the second number");
	
	long num2=scan.nextLong();
	long res=galacticAddition(num1, num2);
	System.out.println("the galactic addition of"+num1+" and " +num2+ "is" +res);
}
	public static long galacticAddition(long num1, long num2)
	{

	long a=num1+num2;
	return a;
	
	}
}

