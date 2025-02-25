// package inheritance.example;

class Plane {
    public void takeOff() {
        System.out.println("Plane is taking off...");
    }
    
    public void fly() {
        System.out.println("Plane is flying...");
    }

    public void land() {
        System.out.println("Plane is landing...");
    }
}

class CargoPlane extends Plane {
    // Overridden method
    public void fly() {
        System.out.println("Cargo Plane is flying at lower heights..");
    }

    public void carryCargo() {
        System.out.println("Cargo plane is carrying goods...");
    }
}

class PassengerPlane extends Plane {
    // Overridden method
    public void fly() {
        System.out.println("Passenger Plane is flying at medium heights..");
    }

    public void carryPassenger() {
        System.out.println("Passenger plane is carrying passengers...");
    }
}

class FighterPlane extends Plane {
    // Overridden method
    public void fly() {
        System.out.println("Fighter Plane is flying at higher heights..");
    }

    public void carryFighter() {
        System.out.println("Fighter plane is carrying weapons...");
    }
}


public class PlaneApp {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        cp.takeOff();   
        cp.fly();
        cp.carryCargo();
        cp.land();

        pp.takeOff();
        pp.fly();
        pp.carryPassenger();
        pp.land();

        fp.takeOff();
        fp.fly();
        fp.carryFighter();
        fp.land();
    }
}
