package lineEquationApproachForPatternPrinting;

public class Alphabet {
    public static void printA(int n) {
        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == n / 2 || (i == 0 && j != 0 && j != n - 1) || ((j == 0 || j == n - 1) && i != 0)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printB(int n) {
        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(((i == n / 2 || i == 0 || i == n - 1) && j != n - 1) || (j == 0) || (j == n - 1 && (i != 0 && i != n - 1 && i != n / 2))){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        printB(7);
    }
}
