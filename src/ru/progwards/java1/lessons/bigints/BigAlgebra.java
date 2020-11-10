package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

import static java.math.BigDecimal.ONE;
import static java.math.BigDecimal.ZERO;

public class BigAlgebra {
    public static BigDecimal fastPow(BigDecimal num, int pow) {


        BigDecimal res = ONE;
        while (pow > 0) {
            if ((pow & 1) == 1) {
                res = res.multiply(num);
            }
            num = num.multiply(num);
            pow >>= 1;
        }
        return res;

    }

    public static BigInteger fibonacci(int n) {
        BigInteger x = new BigInteger("0");
        BigInteger x1 = new BigInteger("1");
        BigInteger x2 = new BigInteger("0");
        for (int i = 1; i <= n; i++) {
            x = x1.subtract(x2);
            x1 = x2;
            x2 = x;
        }
        return x;
    }



}