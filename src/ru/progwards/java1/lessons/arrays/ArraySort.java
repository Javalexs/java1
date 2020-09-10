package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {

    }
    public static void sort(int[] a){
        int b;
        for (int i = 1; i < a.length; i++){
            for (int j = i + 1; j < a.length; j += i) {
                  if (a[i] > a[j]) {
                      b = a [i];
                      a[i] = a[j];
                      a[j] = b;


                  }
            }

        }
    }
}
