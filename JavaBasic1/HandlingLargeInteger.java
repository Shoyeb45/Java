import java.util.Scanner;
import java.math.BigInteger;

class HandlingLargeInteger {
    public static String factorial(int num) {
        BigInteger ans = new BigInteger("1");
        for(int i = 1; i <= num; i++) {
            ans = ans.multiply(new BigInteger(Integer.toString(i)));
        }
        return ans.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(factorial(num));
        sc.close();
    }
}