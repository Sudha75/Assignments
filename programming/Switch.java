package programming;
import java.util.*;
public class Switch {
public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter the numbers from 1 to 7 ");
	int day=scan.nextInt();
	switch(day)
	{
	case 1:
		System.out.println("Super sunday");
		break;
	case 2:
		System.out.println("Boring monday");
		break;
	case 3:
		System.out.println(" More Boring Tuesday");
		break;
	case 4:
		System.out.println("colourful wednesday");
		break;
	case 5:
		System.out.println("tired Thursday");
		break;
	case 6:
		System.out.println(" favroute Friday");
		break;
	case 7:
		System.out.println("outing Saturday");
		break;
		default:
			System.out.println("idiot see the message carefully");
	}
}
}
