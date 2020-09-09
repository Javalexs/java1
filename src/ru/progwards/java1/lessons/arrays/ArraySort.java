package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;
public class ArraySort {


    public static void main(String[] args) {

    }
    public static void sort(int[] a){
        for (int i = 1; i < a.length; i++){
            if (a[i] > a[i + 1]) {
                for (int j = i + 1; j < a.length; j +=1){
                    Arrays.sort (a);
                }

            }
        }
    }
}
