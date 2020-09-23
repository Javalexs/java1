package ru.progwards.java1.lessons.bitsworld;

public class SumBits {
    public static void main(String[] args) {
//        System.out.println(sumBits(00000011));
    }
    public static int sumBits(byte value){
        int sum = 0;
        for (int i = 0; i < 8; i++) {
            sum += (0x1) & (value >> i);
        }
        return sum;
    }
}
