package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static void main(String[] args) {
//        System.out.println(sumBits(0101010));
    }
    public static int sumBits(byte value){
        int sm = 0;
        while (value > 0) sm += value >>>= 1 & 1;
        return sm;

    }
}
