package ru.progwards.java1.lessons.arrays;

import java.util.Arrays;

 public class DIntArray {
     private int[] a;

     public static void main(String[] args) {
     }
     public DIntArray() {
     }
            public void add(int num){

                a = new int[a.length];
                int[] b = new int[a.length + 1];
                System.arraycopy(a, 0, b, 0, b.length);
                b[b.length] = num;

            }
            public void atInsert(int pos, int num){
                a = new int[a.length];
                int[] b = new int[a.length + 1];
                System.arraycopy(a, pos, b,pos + 1, b.length);
                b[b.length - 1] = num;


            }
            public void atDelete(int pos){

            }
            public int at(int pos){
                return a[pos];

            }
 }
