import java.util.Scanner;

public class Rectangle extends Shape {
    private float length;
    private float breadth;

    public void acceptInput() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of rectangle");
        length = sc.nextFloat();

        System.out.println("Enter the breadth of rectangle");
        breadth = sc.nextFloat();
    }

    public void compute() {
        area = length * breadth;
    }
}
