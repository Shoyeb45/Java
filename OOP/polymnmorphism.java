// There are two types : Function overloading and overriding
// Function overloading is compile time polymorphism in which we give same name to our methods, but the differentiating factors are: number of arguments, types of arguments, return type of arguments

class Max {
    int a, b, c;
    public int maximum(int a, int b) {
        return a > b ? a: b;
    }

    public void maximum(int a, int b, int c) {
        int max = 0;
        if(a > b && a > c) {
            max = a;
        } else if(b > c && b > a) {
            max = b;
        } else {
            max = c;
        }
        System.out.println(max);
    }

} 

public class polymnmorphism {
    public static void main(String[] args) {
        Max num = new Max();
        num.a = 12;
        num.b = 10;
        num.c = -10;
        System.out.println(num.maximum(num.b, num.c));
        num.maximum(num.a, num.c, num.a);
    }

}
