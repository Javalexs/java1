package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

 public class DIntArray {
     private int[] a;
//     private int[] b;
     public static void main(String[] args) {
     }
     public DIntArray() {
     }
            public void add(int num){
                a = new int[1];
                int[] b = new int[a.length + 1];
                System.arraycopy(a, 0, b,0, a.length + 1);
                b[a.length - 1] = num;

            }
            public void atInsert(int pos, int num){
                a = new int[1];
                int[] b = new int[a.length + 1];
                System.arraycopy(a, num + 1, b,num, a.length + 1);
                b[a.length - 1] = num;


            }
            public void atDelete(int pos){

            }
            public int at(int pos){
                return a[pos];

            }
 }
