package programming;

public class Mobile {
	String brand;
	String model;
	String storage;
	String ram;
	String display;
	String camera;
	String battery_capacity;
	int cost;
	public Mobile(String brand, String model, String storage, String ram, String display, String camera, String battery_capacity, int cost) {
	super();
	this.brand = brand;
	this.model = model;
	this.storage = storage; 
	this.ram= ram;
	this.display = display;
	this.camera = camera;
	this.battery_capacity = battery_capacity;
	this.cost = cost;
	}

	void capturePicture(String brand, String camera) 
	{ System.out.println(brand+" camera with"+ camera+
	" is very good feature");
	}

	void cost(String brand,String model, int cost) {
		System.out.println(brand+" with model "+model+"is expensive");
	}
}



