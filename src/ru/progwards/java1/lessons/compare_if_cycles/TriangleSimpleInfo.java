package ru.progwards.java1.lessons.compare_if_cycles;

public class TriangleSimpleInfo {
    public static void main(String[] args) {
//        int m;
        System.out.println(maxSide(6, 5, 7));
//        System.out.println(minSide(4, 6, 7));
//        System.out.println(isEquilateralTriangle(4,4,4));

    }
        public static int maxSide(int a, int b, int c){


            int m;
            if (a > b) {
                m = a;
            } else {
                m = b;
            }
            if (m > c) {
                return m;
            } else {
                return c;
            }
        }
        public static int minSide(int a, int b, int c){

            int m;
            if (a < b) {
                m = a;
            } else {
                m = b;
            }
            if (m < c) {
                return m;
            } else {
                return c;
            }
        }
        public static boolean isEquilateralTriangle(int a, int b, int c){
            if (a==b && a==c && b==c){
                return true;
            } else {
                return false;
            }
        }
}

