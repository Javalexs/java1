package ru.progwards.java1.lessons.interfaces;

public interface CompareWeight {

    public enum CompareResult{
        LESS,
        EQUAL,
        GREATER,

    }
    public CompareResult compareWeight(CompareWeight smthHasWeigt);
    public static void sort(CompareWeight[] a){    //int[] a

        CompareWeight b;
        for (int i = 0; i < a.length; i++){
            for (int j = i + 1; j < a.length; j++) {
                if (a[i].compareWeight(a[j]) == CompareWeight.CompareResult.LESS) {
                    b = a [i];
                    a[i] = a[j];
                    a[j] = b;
                }
            }
        }
    }
}
