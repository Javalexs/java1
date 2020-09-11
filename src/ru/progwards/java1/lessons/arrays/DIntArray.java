package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

 public class DIntArray {
     private int[] a = new int[0];

     public static void main(String[] args) {
//         DIntArray arr = new DIntArray();
//         arr.add(0);
     }


     public DIntArray() {
     }
            public void add(int num){

                int[] b = new int[a.length + 1];
                System.arraycopy(a, 0, b,0, a.length);
                b[a.length] = num;
            }
            public void atInsert(int pos, int num){

                int[] b = new int[a.length + 1];
                System.arraycopy(a, 0, b,1,a.length);
                b[b.length - 1] = num + pos;


            }
            public void atDelete(int pos){
                int[] b = new int[a.length + 1];
                System.arraycopy(a, 0, b,0,a.length);
                b[b.length - 1] = pos;

            }
            public int at(int pos){
                return a[pos];

            }
 }
