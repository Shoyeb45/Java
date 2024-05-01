import java.util.Scanner;

public class getBit {
    // To get binary representation of decimal numbers
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

    // By left shift
    public static void printkthBit(int n, int k) {
        // Function to get kth bit
        int bitMask = 1 << (k - 1);
        System.out.println("Left Shifting of 1 to k - 1 times: " + decToBinary(bitMask));
        System.out.println("Taking and of left shifted 1 and n,\n" + decToBinary(n) + " & " + decToBinary(bitMask) + "\nResultant:" + (bitMask & n) + "(" + decToBinary((bitMask & n)) + ")");
        System.out.println("Decision");
        if((bitMask & n) == 0) {
            System.out.println("Bit is off");
        } else {
            System.out.println("Bit is on");
        }
        System.out.println("Given number: " + decToBinary(n));
    }

    // By right shift
    public static int getbit(int n, int k) {
        // Function to get kth bit
        return ((n >> k) & 1) == 0? 0: 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i = sc.nextInt(); 
        printkthBit(n, i);
        sc.close();
    }
}
