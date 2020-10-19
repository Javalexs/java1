package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigAlgebra {
    public static BigDecimal fastPow(BigDecimal num, int pow){
        return num.pow(pow);
    }
    public static BigInteger fibonacci(int n) {
        BigInteger x = new BigInteger("0");
        BigInteger x1 = new BigInteger ("1");
        BigInteger x2 = new BigInteger("0");
        for (int i = 1; i <= n; i++) {
            x = x1.subtract(x2);
            x1 = x2;
            x2 = x;
        }
        return  x;
    }
    public static void main(String[] args) {

    }
}
