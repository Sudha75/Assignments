package com.patterns.assignment;
public class Pattern7 {
public static void main(String[] args) {
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j--)
			{
				if((i+j)%2==0) {
					System.out.print(1+" ");
				}
				else {
					System.out.print(0);
				}
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
