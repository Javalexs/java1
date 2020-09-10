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
//                int[] b = Arrays.copyOf(a, a.length + 1);
                int[] b = new int[a.length + 1];
                System.arraycopy(a, 1, b,2,1);
                a[a.length - 1] = num;

            }
            public void atInsert(int pos, int num){

            }
            public void atDelete(int pos){

            }
            public int at(int pos){
                return pos;

            }
 }
