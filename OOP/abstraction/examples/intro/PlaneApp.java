package abstraction.examples.intro;

public class PlaneApp {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();

        Airport.permit(cp);
        Airport.permit(pp);
        Airport.permit(fp);
    }
}

class Airport {
    public static void permit(Plane ref) {
        ref.takeOff();
        ref.fly();     
        ref.land();
    }
}


abstract class Plane {
    abstract public void takeOff();
    abstract public void fly();
    abstract public void land();
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
