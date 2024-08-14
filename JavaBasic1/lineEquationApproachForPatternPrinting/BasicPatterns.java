package lineEquationApproachForPatternPrinting;

/******************************************************************************
 * 
 * Online Java Compiler.
 * Code, Compile, Run and Debug java program online.
 * Write your code in this editor and press "Run" button to execute it.
 * 
 *******************************************************************************/

public class BasicPatterns {
    public static void main(String[] args) {
        int n = 7;

        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                // if(i + j >= n / 2 && j - i <= n / 2 && i + j <= n - 1 + n / 2 && i - j <= n /
                // 2) {
                // System.out.print(" ");
                // } else {
                // System.out.print("*");
                // }

                if (i + j >= n - 1 && i >= j || i <= j && i + j <= n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

                // if(i + j <= n - 1 && i >= j || i <= j && i + j >= n - 1) {
                // System.out.print("*");
                // } else {
                // System.out.print(" ");
                // }
                // if(i + j <= n / 2 || j - i >= n / 2 || i + j >= n - 1 + n / 2 || i - j >= n /
                // 2) {
                // System.out.print("*");
                // } else {
                // System.out.print(" ");
                // }
            }

            System.out.println();
        }
    }
}
