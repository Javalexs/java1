package ru.progwards.java1.lessons.arrays;


import java.util.Arrays;

public class DIntArray {
    int[] a = new int[0];

    public static void main(String[] args) {
        DIntArray arr = new DIntArray();
        arr.add(46);
//        arr.add(40);
        arr.add(15);
        arr.add(82);
        arr.atInsert(3,40);
        arr.atDelete(2);
        System.out.println(arr.at(0));
    }

    public DIntArray() {
    }

    public void add(int num) {
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, a.length);
        b[a.length] = num;
        a = b;
    }
    public void atInsert(int pos, int num) {
        int[] b = new int[a.length + 1];
        System.arraycopy(a, 0, b, 0, pos);
        System.arraycopy(a, pos, b, pos + 1, a.length - pos);
        b[pos] = num;
        a = b;
    }
    public void atDelete(int pos) {
        int[] b = new int[a.length - 1];
        System.arraycopy(a, 0, b, 0, pos);
        System.arraycopy(a, pos + 1, b, pos, a.length - pos - 1);
        a = b;

    }
    public int at(int pos) {
        return a[pos];
    }
}
