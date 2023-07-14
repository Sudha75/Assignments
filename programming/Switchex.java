package programming;
import java.util.*;
public class Switchex {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the number to find its difference");
	int num1=scan.nextInt();
	int num2=scan.nextInt();
	if(num1>num2) {
		System.out.println("result is:"+(num2-num1));
	}
	else {
		System.out.println("result is:"+(num1-num2));

}
}
}
