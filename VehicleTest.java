class Vehicle {
    public void startEngine() {
        System.out.println("Start's vehicle engine...");
    }
}

class Car extends Vehicle {
    
    public void startEngine() {
        System.out.println("Car engine starts with a key!");
    }
}

class Motorcycle extends Vehicle {

    public void startEngine() {
        System.out.println("Motorcycle engine starts with a button press!");
    }
}

public class VehicleTest {
    public static void vehicleTestDrive(Vehicle vehicle) {
        vehicle.startEngine();
    }

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle motorcycle = new Motorcycle();

        System.out.println("Car Test Drive");
        vehicleTestDrive(car);

        System.out.println("\nMotorcycle Test Drive");
        vehicleTestDrive(motorcycle);
    }
}