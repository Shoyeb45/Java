public class Test {
    public static void main(String[] args) {
        Pattern p = new Pattern();
        // p.patter1(5);
        // System.out.println();
        // p.patter2(5);
        // System.out.println();
        // p.patter4(5);

        // p.patter6(150);
        int n = 6;
        int odd = 9, even = 2; 
        int num1 = odd, num2 = even;

        for(int i = 1; i <= n; i++) {
            System.out.print(i + " ");
            int elem = i;

            for(int j = 2; j <= i; j++) {
                if(j % 2 == 0) {
                    elem += num1;
                    System.out.print(elem + " ");
                } else {
                    elem += num2;
                    System.out.print(elem + " ");
                }

                if(j > i - 1) {
                    odd -= 2;
                    even = 2;
                }
            }
            System.out.println();
            num1 -= 2;
            num2 += 2;
        }
    }
}
