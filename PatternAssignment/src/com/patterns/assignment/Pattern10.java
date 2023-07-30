package com.patterns.assignment;

public class Pattern10 {
	public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
             for (int j = i; j <=i; j++) {
              System.out.print(" ");
         }   
            for (int k = 1; k <= (2*i -1) ;k++) {
             if( k==1 || i ==4 || k==(2*i-1)) {
              System.out.print("*");
              }
               else {
                        System.out.print(" ");
                    }
                }
                System.out.println("");
            }
	}
}