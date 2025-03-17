package inheritance.example;

public class SealedClassEx {
    public static void main(String[] args) {
        
    }
}

sealed class Vehicle permits Car, Truck, Bike {
    void disp() {
        System.out.println("This is a vehicle class.");
    }
}

// Car class
final class Car extends Vehicle {
    void disp() {
        System.out.println("Car is a vehicle.");
    }
}

// Truck class
sealed class Truck extends Vehicle permits MiniTruck {
    void disp() {
        System.out.println("Truck is a vehicle.");
    }
}


// MiniTruck
final class MiniTruck extends Truck {
    void disp() {
        System.out.println("MiniTruck is a smaller Truck.");
    }
}

// Bike class
non-sealed class Bike extends Vehicle {
    void disp() {
        System.out.println("Bike is a vehicle.");
    }
}

// Not pemitted
/*

class Bicycle extends Vehicle {

}

 */
