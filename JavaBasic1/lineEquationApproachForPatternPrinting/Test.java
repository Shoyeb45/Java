package lineEquationApproachForPatternPrinting;

public class Test {
    public static void main(String[] args) {
        int n = 11;

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i + j == n - 1 + n / 2 || i - j == n / 2 || ((j == 0 || j == n - 1) && i >= 1 && i <= n / 2) || (j - i == 1 && j >= 1 && j <= n / 2) || (i + j == 2 *(n / 2) - 1 && j >= n / 2 && j < n - 1)) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
