import java.util.Scanner;

class Solution {
    int num1;
    int num2;

    void solve() {
        if(num2 == 0) {
            System.err.println("Denominator is 0.");
            System.out.println("The quotient is : undefined");
            System.out.println("The remainder is : undefined");
            return;
        }
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("The quotient is : " + quotient);
        System.out.println("The remainder is : " + remainder);
        return;
    }
}

public class SimpleDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Solution s = new Solution();

        System.out.println("Enter tne numerator : ");
        s.num1 = sc.nextInt();
        System.out.println("Enter tne denominator : ");
        s.num2 = sc.nextInt();

        s.solve();
        sc.close();
    }
}
