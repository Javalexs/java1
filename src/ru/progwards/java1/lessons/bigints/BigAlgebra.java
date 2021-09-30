package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.ZERO;

public class BigAlgebra {
    public static void main(String[] args) {
        System.out.println(fastPow(new BigDecimal(4), 0));
    }

    public static BigDecimal fastPow(BigDecimal num, int pow) {
        BigDecimal result = ONE;
        for (int i = 1; i <= pow; i++) {
            result = result.multiply(num);
        }

        return result;
    }


    public static BigInteger fibonacci(int n) {
        BigInteger x = new BigInteger("0");
        BigInteger x1 = new BigInteger("1");
        BigInteger x2 = new BigInteger("0");
        for (int i = 1; i <= n; i++) {
            x = x1.add(x2);
            x1 = x2;
            x2 = x;
        }
        return x;
    }

}