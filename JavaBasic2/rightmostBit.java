import java.util.Scanner;

public class rightmostBit {
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

    public static int rmvRightmostBit(int n) {
        return (n & (n - 1));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println("Decimal Number: " + n + "\nBinary representaion: " + decToBinary(n));
        System.out.println("Number after removing rightmost bit,\nDecimal Representation: " + rmvRightmostBit(n) + "\nBinary representaion: "+ decToBinary(rmvRightmostBit(n)));
        sc.close();
    }
}
