package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

 public class DIntArray {
     int[] a = new int[0];

     public static void main(String[] args) {
         DIntArray arr = new DIntArray();
         arr.atInsert(1,1);
//
     }

     public DIntArray() {
     }
            public void add(int num){
                int[] b = new int[a.length + 1];
                System.arraycopy(a, 0, b, 0, a.length);
                b[a.length] = num;
                a = b;
            }
            public void atInsert(int pos, int num) {
                int[] b = new int[a.length + 1];
                System.arraycopy(a, 0, b, 0, pos-1);
                b[pos - 1] = num;
                System.arraycopy(a, pos - 1, b, pos, a.length);
                a = b;
            }
            public void atDelete(int pos){
                int[] b = new int[a.length + pos + 1];
                System.arraycopy(a, 0, b,0,a.length);

            }
            public int at(int pos){
                return a[pos];
            }
 }
