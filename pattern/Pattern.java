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
}

