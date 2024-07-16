import java.math.BigDecimal;
import java.util.Scanner;

public class FactorialByBigDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        BigDecimal ans = new BigDecimal("1");
        for(int i = 1; i <= n; i++) {
            ans = ans.multiply(new BigDecimal(Integer.toString(i)));
        }
        System.out.println(ans);
        sc.close();
    }
}
