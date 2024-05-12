// Constructor are used to construct the object
class Car {
    String name;
    String color;

    // Defualt constructor is non - parametized constructor
    Car() {
        System.out.println("Non-paraetized constructor");
    }

    // Parametized constructor
    Car(String name, String color) {
        this.color = color;
        this.name = name;
    }

    // Copy constructor
    Car(Car c1) {
        this.name = c1.name;
        this.color = c1.color;
    }
    public StringBuilder getInfo() {
        StringBuilder ans = new StringBuilder("Name of the car is ").append(this.name).append(" and the color is ").append(this.color);
        return ans;
    }
}

public class constructor {
    public static void main(String[] args) {
        // Creating object with non-parametized constructor
        Car car1 = new Car();
        System.out.println(car1.getInfo());

        // Creating object with parametized constructor
        Car car2 = new Car("Nissan", "Black");
        System.out.println(car2.getInfo());
        
        // Copying information of car2
        Car car3 = new Car(car2);
        System.out.println(car3.getInfo());
    }
}