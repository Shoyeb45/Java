package polymorphism;

public class Verify {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        System.out.println(cp instanceof Plane);   
    }
}

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

    public void takeOff() {
        System.out.println("CargoPlane is taking off from a long-sized runway");
    }

    public void fly() {
        System.out.println("CargoPlane is flying at lower heights..");
    }

    public void land() {
        System.out.println("CargoPlane is landing on a long-size runway.");
    }
}
class PassengerPlane extends Plane {

    public void takeOff() {
        System.out.println("PassengerPlane is taking off from a normal-sized runway");
    }

    public void fly() {
        System.out.println("PassengerPlane is flying at medium heights..");
    }

    public void land() {
        System.out.println("PassengerPlane is landing on a normal-sized runway.");
    }
}

class FighterPlane extends Plane {

    public void takeOff() {
        System.out.println("FighterPlane is taking off from a short-sized runway");
    }

    public void fly() {
        System.out.println("FighterPlane is flying at higher heights..");
    }

    public void land() {
        System.out.println("FighterPlane is landing on a short-sized runway.");
    }
}
