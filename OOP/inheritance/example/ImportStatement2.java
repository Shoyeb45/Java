package inheritance.example;

import static java.lang.Math.*;

public class ImportStatement2 {
    public static void main(String[] args) {
        System.out.println(max(5, 6));              // 6
        System.out.println(min(5, 6));              // 5
        System.out.println(PI);                     // 3.141592653589793
        System.out.println(sqrt(25));               // 5.0 (double)
        System.out.println(cbrt(8));                // 2.0 (double)
        System.out.println(pow(2, 3));              // 8.0
        System.out.println(abs(-25.6));               // 25.6
        System.out.println(ceil(8.6));              // 9.0
        System.out.println(floor(8.6));             // 8.0
        System.out.println(sin(0));                 // 0.0
        System.out.println(cos(0));                 // 1.0
        System.out.println(tan(0));                 // 0.0
        System.out.println(toDegrees(45));          // 2578.3100780887044
        System.out.println(toRadians(45));          // 0.7853981633974483
        System.out.println(log(4.5));                    // 1.5040773967762742
        System.out.println(log10(4.5));                  // 0.6532125137753437
        System.out.println(random() * 100);                // randomValues
    }   
}
