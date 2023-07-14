package com.kodnest.training.loops;
import java.util.*;
public class NestedLoops {
	public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter a number (enter 0 to exit): ");
            number=scan.nextInt();
            sum += number;
        } while (number != 0);

        System.out.println("The sum of the numbers is: " + sum);
    }

}


