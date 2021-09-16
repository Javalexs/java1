package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    //    int b;
    public static void main(String[] args) {
        int [] a = {1,5,7,2,4,8,3,4,6};
        sort(a);
        System.out.println(Arrays.toString(a));

    }
    public static void sort(int[] a){
        int b;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] > a[j]) {
                    b = a [i];
                    a[i] = a[j];
                    a[j] = b;


                }
            }

        }
    }
}
