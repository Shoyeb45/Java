package lineEquationApproachForPatternPrinting;

import java.util.Scanner;

public class WordToPattern {
    public static void logicOfA(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == n / 2 || (i == 0 && j != 0 && j != n - 1) || ((j == 0 || j == n - 1) && i != 0)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfB(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(((i == n / 2 || i == 0 || i == n - 1) && j != n - 1) || (j == 0) || (j == n - 1 && (i != 0 && i != n - 1 && i != n / 2))){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfC(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(((i == 0 || i == n - 1) && j != 0) || (j == 0 && i != 0 && i != n - 1)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfD(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if((j == 0) || ((i == 0 || i == n - 1) && j != n - 1) || (j == n - 1 && i != 0 && i != n - 1)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfE(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == 0 || i == n - 1 || (i == n / 2 && j <= n / 2) || j == 0){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfF(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == 0 || (i == n / 2 && j <= n / 2) || j == 0){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfG(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == 0 || j == 0 || (j == n - 1 && i >= n / 2) || (j == n - 1 && i == 1) || (j == n / 2 && (i >= n / 2)) || (i == n / 2 && j >= n / 2) || (i == n - 1 && j <= n / 2)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfH(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(j == 0 || j == n - 1 || i == n / 2){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfI(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == 0 || i == n - 1 || j == n / 2){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfJ(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == 0 || j == n / 2 || i - j == n / 2){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfK(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(j == 0 || (i + j == n / 2) || (i - j == n / 2)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfL(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == n - 1 || j == 0){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfM(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(j == 0 || j == n - 1 || ((i == j || i + j == n - 1) && i <= n / 2)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfN(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(j == 0 || j == n - 1 || i == j){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfO(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(((i == 0 || i == n - 1) && j != 0 && j != n -1 ) || ((j == 0 || j == n - 1) && i != 0 && i != n - 1)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfP(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(j == 0 || ((i == 0 || i == n / 2) && j != n - 1) || (j == n - 1 && i >= 1 && i < n / 2)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfQ(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(((i == 0 || i == n / 2 + 1 ) && j > 0 && j <= n / 2) || ((j == 0 || j == n / 2 + 1) && i > 0 && i <= n / 2) || (i == j && i >= n / 2)) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfR(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(((i == 0 || i == n / 2) && j >= 0 && j < n / 2) || j == 0 || (j == n / 2 && i >= 0 && i < n / 2) || (i - j == n / 2)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfS(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if((i == 0 && j != 0) || (i == n - 1 && j != n - 1) || (j == 0 && i >= 1 && i < n / 2) || (j == n - 1 && i > n / 2 && i < n - 1) || (i == n / 2 && j != 0 && j != n - 1)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }

    public static void logicOfT(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == 0 || j == n / 2){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfU(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(((j == 0 || j == n - 1) && i != n - 1) || (i == n - 1 && j != 0 && j != n - 1)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfV(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if((i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfW(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(j == 0 || j == n - 1 || (i + j == n - 1 && i >= n / 2 ) || (i == j && i >= n / 2)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfX(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == j || i + j == n - 1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfY(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i + j == n - 1 || (i == j && i <= n / 2)){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    
    public static void logicOfZ(int n, int i) {
        for(int j = 0; j <= n - 1; j++) {
            if(i == 0 || i == n - 1 || i + j == n - 1){
                System.out.print("*");
            } else {
                System.out.print(" ");
            }
        }
    }
    public static void printPattern(int n, String s) {
        for(int i = 0; i < n; i++) {
            for(int k = 0; k < s.length(); k++) {
                char ch = s.charAt(k);

                switch(ch) {
                    case 'a', 'A' -> logicOfA(n, i);
                    case 'b', 'B' -> logicOfB(n, i);
                    case 'c', 'C' -> logicOfC(n, i);
                    case 'd', 'D' -> logicOfD(n, i);
                    case 'e', 'E' -> logicOfE(n, i);
                    case 'f', 'F' -> logicOfF(n, i);
                    case 'g', 'G' -> logicOfG(n, i);
                    case 'h', 'H' -> logicOfH(n, i);
                    case 'i', 'I' -> logicOfI(n, i);
                    case 'j', 'J' -> logicOfJ(n, i);
                    case 'k', 'K' -> logicOfK(n, i);
                    case 'l', 'L' -> logicOfL(n, i);
                    case 'm', 'M' -> logicOfM(n, i);
                    case 'n', 'N' -> logicOfN(n, i);
                    case 'o', 'O' -> logicOfO(n, i);
                    case 'p', 'P' -> logicOfP(n, i);
                    case 'q', 'Q' -> logicOfQ(n, i);
                    case 'r', 'R' -> logicOfR(n, i);
                    case 's', 'S' -> logicOfS(n, i);
                    case 't', 'T' -> logicOfT(n, i);
                    case 'u', 'U' -> logicOfU(n, i);
                    case 'v', 'V' -> logicOfV(n, i);
                    case 'w', 'W' -> logicOfW(n, i);
                    case 'x', 'X' -> logicOfX(n, i);
                    case 'y', 'Y' -> logicOfY(n, i);
                    case 'z', 'Z' -> logicOfZ(n, i);
                    case ' ' -> System.out.print("   ");
                }
                System.out.print("  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();

        printPattern(n, s);
        sc.close();
    }
}
