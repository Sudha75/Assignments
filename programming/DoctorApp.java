package programming;
import java.util.*;
public class DoctorApp {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
	System.out.println("Enter the id of doctor");
	int id=scan.nextInt();
	System.out.println("Enter the name of doctor");
	scan.nextLine();
	String name= scan.nextLine();
	System.out.println("Enter the age");
	int age= scan.nextInt();
	System.out.println("Enter the gender");
	scan.nextLine();
	String gender= scan.nextLine(); 
	System.out.println("Enter the shift");

	String shift=scan.nextLine();
	System.out.println("Enter the department"); 
	String department= scan.next();

	Doctor d= new Doctor(id, name, age, gender, shift, department);
	d.giveMedicines(name);
	d.doSurgery(department);
	}

	}


