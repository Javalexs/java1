package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static void main(String[] args) {
        System.out.println(sumBits((byte)99));

    }
    public static int sumBits(byte value){
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += (value >> i) & 1;
        }
        return sum;
    }
}
