// Inheritance is a process in which one object acquires all the properties and behaviors of its parent object automatically. In such a way, you can reuse, extend or modify the attributes and behaviors which are defined in other classes
// In Java, the class which inherits the members of another class is called derived class and the class whose members are inherited is called base class. The derived class is the specialized class for the base class. 

// Types of inheritance : 
// Single inheritance : When one class inherits another class, it is known as single level inheritance 
// Hierarchical inheritance : Hierarchical inheritance is defined as the process of deriving more than one class from a base class. 
//  Multilevel inheritance : Multilevel inheritance is a process of deriving a class from another derived class.
// Hybrid inheritance : Hybrid inheritance is a combination of simple, multiple inheritance and hierarchical inheritance. 



class Shape {
    public void area() {
        System.out.println("show area");
    }
}

class Triangle extends Shape {
    public void area(int l, int h) {
        System.out.println(1/2 * l * h);
    }
}

class EquilateralTriangle extends Triangle {
    public void area(int a) {
        System.out.println(Math.sqrt(3)/2 * a * a);
    }
}
class Circle extends Shape {
    public void area(int r) {
        System.out.println(Math.PI * r * r);
    }
}

public class inheritance {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("Examples of all inheritance\n1. Single inheritance: Triangle -> Shape\n2. Hierarchial Inheritance: Cirlce, Triangle -> Shape\n3. Mulitlevel Inheritance: EquilateralTriangle -> Triangle -> Shape");
        System.out.println(s);
    }
}
