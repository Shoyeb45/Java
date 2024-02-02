  //Q.1:Take 2 variables 'a' & 'b' and print their sum

import java.util.*;

public class Question {
    
  public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
      System.out.print("Enter Your Integer'a':");                  int a = sc.nextInt();
      System.out.print("Enter Your Integer'b':");      int b = sc.nextInt();
        int sum = a+b;
        System.out.print("Sum of a&b:");    System.out.println(sum);
     sc.close();
}
  }
}
