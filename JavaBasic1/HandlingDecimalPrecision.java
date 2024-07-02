import java.math.BigDecimal;

public class HandlingDecimalPrecision {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("0.06");
        BigDecimal b = new BigDecimal("0.04");
        BigDecimal c = a.subtract(b);
        System.out.println(c);
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));
        System.out.println(a.divide(b));
    }
}
