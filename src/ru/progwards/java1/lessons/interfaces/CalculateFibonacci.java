package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {

    private static CacheInfo lastFibo;

    public static class CacheInfo {
        public int n;
        public int fibo;

        public CacheInfo(int n, int fibo) {
            this.n = n;
            this.fibo = fibo;
        }
    }

    public static int fiboNumber(int n){
//        int x = 0;
//        int x1 = 1;
//        int x2 = 0;
//        for (int i = 1; i <= n; i++) {
//            x = x1 + x2;
//            x1 = x2;
//            x2 = x;
        int fibo = 0;
        int fibo1 = 1;
        int fibo2 = 0;
        for (int i = 1; i <= n; i++) {
            fibo = fibo1 + fibo2;
            fibo1 = fibo2;
            fibo2 = fibo;

        }
        lastFibo = new CacheInfo(n, fibo);
        return fibo;
    }

    public static CacheInfo getLastFibo(){

        return lastFIbo;
    }
    public static void clearLastFibo() {
        lastFibo = 0;
    }
    public static void main(String[] args) {
        System.out.println(fiboNumber(10));
        fiboNumber(1);

    }
}
