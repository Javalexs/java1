package ru.progwards.java1.lessons.interfaces;

public class CalculateFibonacci {

    privat static CacheInfo lastFibo;

    public static class CacheInfo{
        public int n;
        public int fibo;
    }

    public static int fiboNumber (int n) {


    }
    public static CacheInfo getLastFibo(){
        return lastFibo;
    }
    public static void clearLastFibo(){
        Integer lastFibo = 0;
    }
}
