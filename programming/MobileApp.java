package programming;
import java.util.*;
public class MobileApp {
	public static void main(String[] args) { 
		Scanner scan= new Scanner(System.in);
	System.out.println("Enter the brand of mobile"); 
	String brand = scan.nextLine(); 
	System.out.println("Enter the model of this brand");
	String model= scan.nextLine(); 
	System.out.println("Enter storage");
	String storage= scan.next(); 
	System.out.println("Enter the RAM of this model");

	String ram=scan.next(); 
	System.out.println("Enter display");
	scan.nextLine();
	String display= scan.nextLine();
	System.out.println("Enter the camera spaecifications");
   
	String camera= scan.next();
	System.out.println("Enter the battery capacity of this model");
	String battery_capacity=scan.next();
	System.out.println("Enter the cost"); 
	int cost= scan.nextInt();

	Mobile m= new Mobile(brand, model, storage, ram, display, camera, battery_capacity, cost);
	m.capturePicture(brand, camera);
    m.cost(brand, model, cost);

			}

			}
