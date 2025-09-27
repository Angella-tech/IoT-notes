

abstract class Vehicle {
	String brand;
	int year;

	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
	}

	
	public abstract void start();

	public void displayInfo() {
		System.out.println("Brand: " + brand + ", Year: " + year);
	}
}


class Car extends Vehicle {
	int numberOfDoors;

	public Car(String brand, int year, int numberOfDoors) {
		super(brand, year);
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public void start() {
		System.out.println(brand + " car is starting with a key.");
	}

	public void honk() {
		System.out.println("Beep beep!");
	}
}

class Motorcycle extends Vehicle {
	boolean hasSidecar;

	public Motorcycle(String brand, int year, boolean hasSidecar) {
		super(brand, year);
		this.hasSidecar = hasSidecar;
	}

	@Override
	public void start() {
		System.out.println(brand + " motorcycle is starting with a button.");
	}

	public void doWheelie() {
		System.out.println("Doing a wheelie!");
	}
}

public class VehicleDemo {
	public static void main(String[] args) {
		// Create a Car object
		Car myCar = new Car("Toyota", 2022, 4);
		myCar.displayInfo();
		myCar.start();
		myCar.honk();

		System.out.println();

		// Create a Motorcycle object
		Motorcycle myBike = new Motorcycle("Honda", 2021, false);
		myBike.displayInfo();
		myBike.start();
		myBike.doWheelie();
	}
}
