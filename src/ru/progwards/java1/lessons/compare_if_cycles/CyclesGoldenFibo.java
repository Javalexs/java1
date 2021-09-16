package ru.progwards.java1.lessons.compare_if_cycles;
public class CyclesGoldenFibo {
    public static boolean containsDigit(int number, int digit) {
//        int a = 0;
        if (number == 0 && digit == 0)
            return true;
        while (number != 0){

            if ((number % 10) == digit)
                return true;
                number = number / 10;

        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(containsDigit(123435725,1));

        for(int n = 1; n < 16; n++){
            System.out.println(fiboNumber(n));

        }
        for (int i = 1; i < 100; i++) {
            for (int j = 1; j <= i; j++){
                if (isGoldenTriangle(i,i,j)) {
                    System.out.println ("Золотой треугольник со сторонами: " + i + ", " + i + ", " + j);

                }
            }
        }
    }

    public static int fiboNumber (int n) {
        int x = 0;
        int x1 = 1;
        int x2 = 0;
        for (int i = 1; i <= n - 1; i++) {
            x = x1 + x2;
            x1 = x2;
            x2 = x;

        }
        return x;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){

        if(a == b & (double)a/c >= 1.61703d & (double)a/c <= 1.61903d | a == c & (double)a/b  >= 1.61703d & (double)a/b  <= 1.61903d | b == c & (double)b/a  >= 1.61703d & (double)b/a  <= 1.61903d){
            return true;
        } else {
            return false;
        }

    }

}


