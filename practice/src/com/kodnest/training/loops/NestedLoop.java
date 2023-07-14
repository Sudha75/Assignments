package com.kodnest.training.loops;
import java.util.*;
public class NestedLoop {
	public static void main(String[] args) {
		 Scanner scan= new Scanner(System.in);
		 System.out.println("Enter the value for side1, side2 and side3");
		 int side1=scan.nextInt();
		 int side2=scan.nextInt();
		 int side3=scan.nextInt();

	        if (side1 == side2 && side2 == side3)
	        {
	            System.out.println("The triangle is equilateral.");
	        } 
	        else 
	        {
	            if (side1 == side2 || side2 == side3 || side1 == side3) 
	            {
	                System.out.println("The triangle is isosceles.");
	            } 
	            else 
	            {
	                System.out.println("The triangle is scalene.");
	            }
	        }
	}
}
