package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
//    int b;
    public static void main(String[] args) {

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
