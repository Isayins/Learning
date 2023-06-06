package data;

import java.math.BigDecimal;

public class BigDecimalTest {
    public static void main(String[] args) {
        BigDecimal bd1 = new BigDecimal("0.09");
        BigDecimal bd2 = new BigDecimal("0.0000001");
        System.out.println("bd1.add(bd2) = " + bd1.add(bd2));
        System.out.println("bd1.add(bd2) = " + bd1.subtract(bd2));
        System.out.println("bd1.multiply(bd2) = " + bd1.multiply(bd2));
        System.out.println("bd1.divide(bd2) = " + bd1.divide(bd2));
    }
}
