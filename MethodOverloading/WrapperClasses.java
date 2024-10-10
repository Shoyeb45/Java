import java.util.ArrayList;
import java.util.Scanner;


public class WrapperClasses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Byte b = 4;
        Short c = new Short("12"); // Deprecated since 9.0 - Using constructor
        
        Integer a = 9;  // Using autoboxing

        Float f = Float.valueOf(3.4f); // Using valueof() method
        System.out.println(a + b + c);   // Using auto unboxing 
        System.out.println(f);

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 1; i <= 5; i++) {
            int x = sc.nextInt();
            arr.add(x);
        }

        for(int i = 0; i < 5; i++) {
            System.out.println(arr.get(i) + 42);
        } 

        Double d = Double.valueOf(9.3);
        double dd = d.doubleValue(); // unboxing
        dd = d;  // Auto unboxing

        System.out.println(dd + " " + d + " " + (dd == d));
    }
}
