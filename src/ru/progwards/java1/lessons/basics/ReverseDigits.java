package ru.progwards.java1.lessons.basics;

public class ReverseDigits {
    public static void main(String[] args) {
        System.out.println(reverseDigits(700));
    }
    public static int reverseDigits(int number){
            //int a = number/100;
            int c = (number%10)*100;
            int b = ((number%100)/10)*10;
            int a = (number/100);
            return c + b + a;
    }
}
