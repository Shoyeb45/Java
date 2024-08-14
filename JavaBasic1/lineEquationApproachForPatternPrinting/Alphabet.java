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

    public static void printC(int n) {
        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(((i == 0 || i == n - 1) && j != 0) || (j == 0 && i != 0 && i != n - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printD(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if((j == 0) || ((i == 0 || i == n - 1) && j != n - 1) || (j == n - 1 && i != 0 && i != n - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printE(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == 0 || i == n - 1 || (i == n / 2 && j <= n / 2) || j == 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printF(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == 0 || (i == n / 2 && j <= n / 2) || j == 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printG(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == 0 || j == 0 || (j == n - 1 && i >= n / 2) || (j == n - 1 && i == 1) || (j == n / 2 && (i >= n / 2)) || (i == n / 2 && j >= n / 2) || (i == n - 1 && j <= n / 2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printH(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(j == 0 || j == n - 1 || i == n / 2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printI(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == 0 || i == n - 1 || j == n / 2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printJ(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == 0 || j == n / 2 || i - j == n / 2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printK(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(j == 0 || (i + j == n / 2) || (i - j == n / 2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printL(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == n - 1 || j == 0){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printM(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(j == 0 || j == n - 1 || ((i == j || i + j == n - 1) && i <= n / 2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printN(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(j == 0 || j == n - 1 || i == j){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printO(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(((i == 0 || i == n - 1) && j != 0 && j != n -1 ) || ((j == 0 || j == n - 1) && i != 0 && i != n - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printP(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(j == 0 || ((i == 0 || i == n / 2) && j != n - 1) || (j == n - 1 && i >= 1 && i < n / 2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printQ(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(((i == 0 || i == n / 2 + 1 ) && j > 0 && j <= n / 2) || ((j == 0 || j == n / 2 + 1) && i > 0 && i <= n / 2) || (i == j && i >= n / 2)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printR(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(((i == 0 || i == n / 2) && j >= 0 && j < n / 2) || j == 0 || (j == n / 2 && i >= 0 && i < n / 2) || (i - j == n / 2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printS(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if((i == 0 && j != 0) || (i == n - 1 && j != n - 1) || (j == 0 && i >= 1 && i < n / 2) || (j == n - 1 && i > n / 2 && i < n - 1) || (i == n / 2 && j != 0 && j != n - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printT(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == 0 || j == n / 2){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printU(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(((j == 0 || j == n - 1) && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printV(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if((i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printW(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(j == 0 || j == n - 1 || (i + j == n - 1 && i >= n / 2 ) || (i == j && i >= n / 2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printX(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == j || i + j == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }

    public static void printY(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i + j == n - 1 || (i == j && i <= n / 2)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void printZ(int n) {

        for(int i = 0; i <= n - 1; i++) {
            for(int j = 0; j <= n - 1; j++) {
                if(i == 0 || i == n - 1 || i + j == n - 1){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        printZ(7);
    }
}
