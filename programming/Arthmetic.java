package programming;
import java.util.*;
public class Arthmetic {
	public static void add(int a,int b)
	{
		System.out.println("Addition Result:"+(a+b));
	}
	public static void sub(int a,int b)
	{
		System.out.println("Subtraction Result:"+(b-a));
	}
	public static void mul(int a,int b)
	{
		System.out.println("Multiplication  Result:"+(a*b));
	}
	public static void div(int a,int b)
	{
		System.out.println("Division  Result:"+(b/a));
	}
	public static void rem(int a,int b)
	{
		System.out.println("Remainder  Result:"+(a%b));
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter four integers");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		int d=scan.nextInt();
		Arthmetic art=new Arthmetic();
		add(a,b);
		sub(a,b);
		mul(a,b);
		div(a,b);
		rem(a,b);
	}
}
