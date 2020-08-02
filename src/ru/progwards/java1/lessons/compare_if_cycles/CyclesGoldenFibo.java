package ru.progwards.java1.lessons.compare_if_cycles;

public class CyclesGoldenFibo {
    public static void main(String[] args) {
        System.out.println(fiboNumber(1));
        System.out.println(fiboNumber(2));
        System.out.println(fiboNumber(3));
        System.out.println(fiboNumber(4));
        System.out.println(fiboNumber(5));
        System.out.println(fiboNumber(6));
        System.out.println(fiboNumber(7));
        System.out.println(fiboNumber(8));
        System.out.println(fiboNumber(9));
        System.out.println(fiboNumber(10));
        System.out.println(fiboNumber(11));
        System.out.println(fiboNumber(12));
        System.out.println(fiboNumber(13));
        System.out.println(fiboNumber(14));
        System.out.println(fiboNumber(15));

        for (int i = 1; i < 100; i++) {
            for (int j = 1; j <= i; j++)
                if (isGoldenTriangle (i,i,j)){
                    System.out.println("Найден золотой треугольник с параметрами: " + i + ", " + i + ", " + j);

            }
        }
    }

    public static boolean containsDigit(int number, int digit){

    }

    public static int fiboNumber (int n) {
        int x = 0;
        int x1 = 1;
        int x2 = 0;
        for (int i = 1; i <= n; i++) {
            x = x1 + x2;
            x1 = x2;
            x2 = x;

        }
        return x;
    }

    public static boolean isGoldenTriangle(int a, int b, int c){
       if (a == b || b == c || a == c && a/c >= 1.61703 && a/c <= 1.61903 || b/c >= 1.61703 && b/c <= 1.61903){
            return true;
        } else {
            return false;
        }
    }

}


