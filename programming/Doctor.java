package programming;

public class Doctor {
	int id;
	String name; 
	int age; 
	String gender; 
	String shift;
	String department;
 public Doctor(int id, String name, int age, String gender, String shift, String department) {
	super();
	this.id = id;
	this.name = name;
	this.age = age;
	this.gender = gender; 
	this.shift = shift;
	this.department = department;
	}

	void giveMedicines(String department) {
	System.out.println(department+" doctor is giving medicines");
	}

	void doSurgery(String name) 
	{
	System.out.println(name+" doctor is doing sugery");
	}

}



