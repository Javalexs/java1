package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

 public class DIntArray {
     private int[] a;
     public static void main(String[] args) {

     }

     public DIntArray() {

     }

            public void add(int num){
                a = Arrays.copyOf(a, a.length + 1);
                a[a.length - 1] = num;
            }
            public void atInsert(int pos, int num){
                a = Arrays.copyOf(a, a.length + 1);
//                a[a.length] = num;
                a[pos] = num;

            }
            public void atDelete(int pos){
                a = Arrays.copyOf(a, a.length - 1);

            }
            public int at(int pos){
                return a[pos];

            }




 }
