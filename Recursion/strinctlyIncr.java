import java.util.Scanner;

public class strinctlyIncr {
    public static boolean isDecreasing(int[] a, int i) {
        if(i == a.length - 1)
            return a[i] < a[i - 1];
        
        return (a[i] > a[i + 1]) && isDecreasing(a, i + 1);
    }
    public static boolean isIncreasing(int[] a, int i) {
        if(i == a.length - 1)
            return a[i] > a[i - 1];
        
        return (a[i] < a[i + 1]) && isIncreasing(a, i + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = sc.nextInt();
        
        if(isIncreasing(a, 0))
            System.out.println("Array is strictly increasing.");
        else
            System.out.println("Array is not strictly increasing");

        if(isDecreasing(a, 0))
            System.out.println("Array is strictly decreasing.");
        else
            System.out.println("Array is not strictly decreasing");
        
        sc.close();
    }
}
