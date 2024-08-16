package lineEquationApproachForPatternPrinting;

import java.util.Scanner;
class IndianFlag {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int r = (n + 1) / 2;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                int x = i - r, y = j - r;

                if(x * x + y * y <= (r - 1) * (r - 1)) {
                    System.out.print(ANSI_BLUE + "*" + ANSI_RESET);
                } else {
                    System.out.print(" ");
                }
            }
	    System.out.println();
        }
        sc.close();
    }
}
	
