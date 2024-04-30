import java.util.Scanner;

public class getBit {
    // By left shift
    public static int printkthBit(int n, int k) {
        // Function to get kth bit
        int bitMask = 1 << k;
        return (bitMask & n) == 0 ? 0: 1;
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
        if(printkthBit(n, i) == 0)
            System.out.println("By left shift - Bit is on at position " + i);
        else
            System.out.println("By left shift - Bit is off at position " + i);
        if(getbit(n, i) == 0)
            System.out.println("By right shift - Bit is on at position " + i);
        else
            System.out.println("By right shift - Bit is off at position " + i);
        sc.close();
    }
}
