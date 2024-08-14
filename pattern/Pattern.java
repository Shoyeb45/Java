public class Pattern {
    /**
     * 
     */
    void patter1(int n) {
        // for(int i = 1; i <= n; i++) {
        //     for(int k = 1; k <= n - i; k++) {
        //         System.out.print(" ");
        //     }

        //     for(int j = i; j >= 1; j--) {
        //         System.out.print(j);
        //     }

        //     for(int j = 2; j <= i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i <= n; i++) {
            for(int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            
            int temp = i;
            for(int j = 1; j <= 2 * i - 1; j++) {
                if(j > i) {
                    System.out.print(temp++);
                } else {
                    System.out.print(temp--);
                    if(j == i) {
                        temp = 2;
                    }
                }
            }
            System.out.println();
        }
    }

    void patter2(int n) {
        // for(int i = 1; i <= n; i++) {
        //     for(int k = 1; k <= n - i; k++) {
        //         System.out.print(" ");
        //     }

        //     for(int j = 1; j <= i; j++) {
        //         System.out.print(j);
        //     }

        //     for(int j = i - 1; j >= 1 ; j--) {
        //         System.out.print(j);
        //     }
        //     System.out.println();
        // }

        for(int i = 1; i <= n; i++) {
            for(int k = 1; k <= n - i; k++) {
                System.out.print(" ");
            }
            
            int temp = 1;
            for(int j = 1; j <= 2 * i - 1; j++) {
                if(j > i) {
                    System.out.print(--temp);
                } else {
                    System.out.print(temp++);
                    if(j == i) {
                        temp--;
                    }
                }
            }
            System.out.println();
        }
    }

    void patter3(int n) {
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
                if(i % 2 == 1) {
                    System.out.print(2 * j - 1);
                } else {
                    System.out.print(2 * j);
                }
            }
            System.out.println();
        }
    }

    /**
     * Pattern:
     * <pre> 
     * 1 
     * 3 8 5
     * 7 9 40 11 13
     * </pre>
     * @param n
     */
    void patter4(int n) {
        int last = 1;
        for(int i = 1; i <= n; i++) {
            // System.out.println("Last " + last);
            int term =  2 * i - 2;
            int middle = ((2 * last + (term - 1) * 2)) * term / 2;
            
            for(int j = 1; j <= 2 * i - 1 ; j++) {
                if(j == i) {
                    if(i == 1) {
                        System.out.print(last);
                        last += 2;
                    } else {
                        System.out.print(middle + " ");
                    }
                } else {
                    System.out.print(last + " ");
                    last += 2;
                }
            }
            System.out.println();
        }
    }

    /**
     * <pre>1 10 11 20 21
     * 2 9 12 19 22
     * 3 8 13 18 23
     * 4 7 14 17 24
     * 5 6 15 16 25
     * </pre>
     * @param n
     */
    void patter5(int n) {
        for(int i = 1; i <= n; i++) {
            int first = 2 * n - (2 * i - 1);
            int second = 2 * n - first;
            int term = i;
            for(int j = 1; j <= n; j++) {
                if(j % 2 == 1) {
                    System.out.print(term + " ");
                    term += first;
                } else {
                    System.out.print(term + " ");
                    term += second;
                }
            }
            System.out.println();
        }
    }

    /**
     * <pre>
     * 1
     * 2 9
     * 3 8 10 
     * 4 7 11 14
     * 5 6 12 13 15
     * </pre>
     * @param n
     */
    void patter6(int n) {
        for(int i = 1; i <= n; i++) {
            int first = (2 * n) - (2 * i - 1);
            int second = (2 * (n - 1) - 1) - first;
            // System.out.println("Row: " + i + " first: " + first + " second: " + second);
            int term = i;

            for(int j = 1; j <= i; j++) {
                System.out.print(term + "\t");
                if(j % 2 == 0) {
                    term += second;
                    second -= 4;
                } else {
                    term += first;
                }
            }
            System.out.println();
        }
    }
}

