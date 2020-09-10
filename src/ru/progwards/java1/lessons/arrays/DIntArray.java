package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

 public class DIntArray {
     private int[] a;


     public static void main(String[] args) {

     }

     public DIntArray() {

     }

            public void add(int num){
                a = new int[1];
                int[] b = new int [a.length + 1];
                System.arraycopy(a,0,b,0, a.length + 1);
                /* a = Arrays.copyOf(a, 0, b, a.length + 1); */
                a[a.length - 1] = num;
            }
            public void atInsert(int pos, int num){
                a = Arrays.copyOf(a, a.length + 1);
                int [] a1 = new int [a.length];
                System.arraycopy(a, 1, a1, pos + 1, a.length);
                a[pos] = num;

            }
            public void atDelete(int pos){
                a = Arrays.copyOf(a, a.length - 1);

            }
            public int at(int pos){
                return a[pos];

            }

 }
