package polymorphism.examples.advantage;

// Non-Polymorphic code 
// public class PlaneExample {
//     public static void main(String[] args) {
//         CargoPlane cp = new CargoPlane();
//         PassengerPlane pp = new PassengerPlane();
//         FighterPlane fp = new FighterPlane();

//         cp.takeOff();
//         cp.fly();
//         cp.land();

//         pp.takeOff();
//         pp.fly();
//         pp.land();

//         fp.takeOff();
//         fp.fly();
//         fp.land();
//     }
// }


// Polymorphism without advantages
// public class PlaneExample {
//     public static void main(String[] args) {
//         CargoPlane cp = new CargoPlane();
//         PassengerPlane pp = new PassengerPlane();
//         FighterPlane fp = new FighterPlane();

//         Plane ref;

//         ref = cp;
//         cp.takeOff();
//         cp.fly();
//         cp.land();
        
//         ref = pp;
//         pp.takeOff();
//         pp.fly();
//         pp.land();
        
//         ref = fp;
//         fp.takeOff();
//         fp.fly();
//         fp.land();
//     }
// }



// Polymorphism version with advantages
class Airport {
    public void permit(Plane ref) {
        ref.takeOff();
        ref.fly();
        ref.land();
    }
}

public class PlaneExample {
    public static void main(String[] args) {
        CargoPlane cp = new CargoPlane();
        PassengerPlane pp = new PassengerPlane();
        FighterPlane fp = new FighterPlane();
        
        Airport a = new Airport();

        a.permit(cp);
        a.permit(pp);
        a.permit(fp);
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

