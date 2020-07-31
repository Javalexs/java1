package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static void main(String[] args) {
        System.out.println (isGoldenTriangle (3,3,4));

    }

    //public static boolean containsDigit(int number, int digit){

    //}

    //public static int fiboNumber(int n){

    //}

    public static boolean isGoldenTriangle(int a, int b, int c){
        if (a == b || b == c || a == c && a/c >= 1.61703 && a/c <= 1.61903 || b/c >= 1.61703 && b/c <= 1.61903){
            return true;
        } else {
            return false;
        }
    }



}
