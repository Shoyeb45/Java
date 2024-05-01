import java.util.Scanner;

public class toggleBit {
    public static String decToBinary(int n) {
        StringBuilder s = new StringBuilder("");

        if(n == 0)
            return "0";
        while(n >= 1) {
            int digit = n % 2;
            n /= 2;
            s.append((char)(digit + '0'));
        }
        s.reverse();
        return s.toString();
    }

    public static int togglebit(int n, int k) {
        int bitMask = 1 << k;
        return (n ^ bitMask);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(1 << k);
        System.out.println("Number: " + decToBinary(n));
        int dec = togglebit(n, k);
        System.out.println("After toggling\nDecimal number:" + dec + "\nBinary: " + decToBinary(dec));
        sc.close();
    }
}
