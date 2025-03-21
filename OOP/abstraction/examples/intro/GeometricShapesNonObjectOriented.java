package abstraction.examples.intro;

import java.util.Scanner;

public class GeometricShapesNonObjectOriented {
    public static void main(String[] args) {
        Square s = new Square();
        Rectangle r = new Rectangle();
        Circle c = new Circle();

        s.takeInput();
        s.compute();
        s.disp();

        r.takeInput();
        r.compute();
        r.disp();
        
        c.takeInput();
        c.compute();
        c.disp();
    }
}

class Rectangle {
    float length;
    float breadth;
    float area;

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of rectangle");
        length = sc.nextFloat();

        System.out.println("Please enter breadth of rectangle");
        breadth = sc.nextFloat();
        sc.close();
    }

    public void compute() {
        area = length * breadth;
    }

    public void disp() {
        System.out.println("The area of rectangle is: " + area);
    }
}

class Square {
    float length;
    float area;

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter length of square");
        length = sc.nextFloat();
        sc.close();
    }

    public void compute() {
        area = length * length;
    }

    public void disp() {
        System.out.println("The area of square is: " + area);
    }
}

class Circle {
    float radius;
    float area;

    public void takeInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter radius of circle");
        radius = sc.nextFloat();
        sc.close();
    }

    public void compute() {
        area = 3.141f * radius * radius;
    }

    public void disp() {
        System.out.println("The area of circle is: " + area);
    }
}