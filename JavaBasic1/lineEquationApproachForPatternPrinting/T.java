package lineEquationApproachForPatternPrinting;

public class T {
    public static void main(String[] args) {
        int n = 7;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j <= 2 * n - 1; j++) {
                if((i == 0 && j != 0) || (i == n - 1 && j != n - 1) || (j == 0 && i >= 1 && i < n / 2) || (j == n - 1 && i > n / 2 && i < n - 1) || (i == n / 2 && j != 0 && j != n - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }
}
