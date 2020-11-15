package ru.progwards.java1.lessons.bigints;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;

public class ArrayInteger {
    int res;
    byte[] digits;

    public ArrayInteger(int n) {
        digits = new byte[n];
        res = 0;

    }

    public void fromInt(BigInteger value) {
        String str = value.toString();
        char[] ch = new char[digits.length];
        for (int i = 0; i < ch.length; i++) {
            ch[i] = str.charAt(i);
        }
        String bi = new String(ch);
        BigInteger temp = new BigInteger(bi);
        for (int i = 0; i < digits.length; i++) {
            digits[i] = temp.remainder(BigInteger.TEN).byteValue();


        }


    }
}