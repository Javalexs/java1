package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

 public class DIntArray {
     private int[] a = new int[1];

     public static void main(String[] args) {
         DIntArray arr = new DIntArray();
         arr.add(1);
//
     }

     public DIntArray() {
     }
            public void add(int num){

                int[] b = new int[a.length + 1];
                System.arraycopy(a, 0, b, 0, a.length);
                b[a.length] = num;
            }
            public void atInsert(int pos, int num){

                int[] b = new int[a.length + pos + 1];
                System.arraycopy(a, 0, b,0, a.length);
                b[a.length] = num;
            }
            public void atDelete(int pos){
                int[] b = new int[a.length + pos + 1];
                System.arraycopy(a, 0, b,0,a.length);
//                b[a.length] = pos;
            }
            public int at(int pos){
                return a[pos];
            }
 }
