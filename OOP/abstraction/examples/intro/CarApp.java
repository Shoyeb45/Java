package abstraction.examples.intro;

public class CarApp {
    public static void main(String[] args) {
        
    }
}

abstract class Car {
    public void start() {
        System.out.println("Car has started");
    }

    abstract public void accelarate();
    abstract public void drive();
    abstract public void combustion();
    
    public void stop() {
        System.out.println("Car has stopped.");
    }
}

class Maruti800 {
    public void accelarate() {

    }
    public void drive() {

    }
    public void combustion() {
        
    }
    
}

class Innova {
    public void accelarate() {
    
    }
    public void drive() {
    
    }
    public void combustion() {
    
    }
    
}

class Ferrari {
    public void accelarate() {
    
    }
    public void drive() {
    
    }
    public void combustion() {
    
    }
    
}