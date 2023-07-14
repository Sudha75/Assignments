package programming;
import java.util.*;
public class Difference {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the two numbers to find the difference");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		if(num1>num2)
		{
			System.out.println("Result is:"+(num2-num1));
		}
		else
		{
			System.out.println("Result is:" + (num1-num2));
		}
	}

}
