//Fibonacci sequence till nth term

import java.util.*;

public class Recursion5 {
    public static void Fibonacci(long a , long b , long n){
            if ( n == 0){
                return;
            }

        //now for new term i.e,after 0 and 1 
        long c = a + b;
        System.out.print(" " + c);
//Now calling function,but now c becomes b and b becomes a

        Fibonacci(b, c, n-1);  //n-1 for decreasing terms and for base condition
    } 
      public static void main(String [] args){
        Scanner sc =new Scanner (System.in);
        System.out.print("Enter number of terms you want to enter:");
        long  a=0, b=1;
        long n = sc.nextLong();
        System.out.print(a + " " + b);  //First two terms

        //calling function
        Fibonacci(a, b, n-2);  //n-2 ,since two terms are already printed
        sc.close();
       

      }
}
