package com.kodnest.training.loops;
import java.util.*;
public class Nestedifelse {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);
	System.out.println("enter the marks");
	int marks=scan.nextInt();
	System.out.println("enter the activity points");
	int ActivityPoints=scan.nextInt();
	if(marks>=60) {
	if(ActivityPoints>=3) {
		System.out.println("student is eligible for schlorship");
	}
	else {
		System.out.println("student is not eligible for schlorship");
	}
	}
	else {
		System.out.println("student is not eligible for schlorship due to low marks");
	}

}

}
