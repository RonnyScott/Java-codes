// Define a class called 'Car'
class Car {
    // Attributes of the Car class
    String model;
    String color;
    int year;
    
    // Constructor of the Car class
    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;
    }

    // Method to start the car
    public void start() {
        System.out.println("The " + color + " " + model + " is starting.");
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Model: " + model + ", Color: " + color + ", Year: " + year);
    }
}

// Define a class that inherits from Car
class ElectricCar extends Car {
    // Additional attribute specific to ElectricCar
    int batteryCapacity;

    // Constructor for ElectricCar
    public ElectricCar(String model, String color, int year, int batteryCapacity) {
        super(model, color, year); // Call parent class constructor
        this.batteryCapacity = batteryCapacity;
    }

    // Overriding start method to include electric car behavior
    @Override
    public void start() {
        System.out.println("\nThe electric " + color + " " + model + " is starting silently.");
    }

    // Method to display electric car details, including battery capacity
    public void displayDetails() {
        super.displayDetails(); // Call parent class method
        System.out.println("\nBattery Capacity: " + batteryCapacity + " kWh");
    }
}

// Main class to run the code
public class Main {
    public static void main(String[] args) {
        // Create an instance of Car
        Car car1 = new Car("Toyota Camry", "Blue", 2020);
        car1.start();
        car1.displayDetails();
        
        // Create an instance of ElectricCar
        ElectricCar electricCar1 = new ElectricCar("Tesla Model 3", "Red", 2023, 75);
        electricCar1.start();
        electricCar1.displayDetails();
    }
}
