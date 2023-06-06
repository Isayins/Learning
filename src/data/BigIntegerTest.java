package data;

import java.math.BigInteger;

public class BigIntegerTest {
    public static void main(String[] args) {
        BigInteger bigInteger1 = new BigInteger("10000000000000000000");
        BigInteger bigInteger2 = new BigInteger("50");


        System.out.println("bigInteger1.add(bigInteger2) = " + bigInteger1.add(bigInteger2));

        System.out.println("bigInteger1.subtract(bigInteger1) = " + bigInteger1.subtract(bigInteger2));

        System.out.println("bigInteger1.multiply(bigInteger2) = " + bigInteger1.multiply(bigInteger2));

        System.out.println("bigInteger1.divide(bigInteger2) = " + bigInteger1.divide(bigInteger2));
    }
}
