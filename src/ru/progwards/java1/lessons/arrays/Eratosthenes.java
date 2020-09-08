package ru.progwards.java1.lessons.arrays;


import java.util.Arrays;

 public class Eratosthenes {
    int N;
    private boolean[] sieve = {true, false};

    public Eratosthenes (int N){
        this.N = N;
        sieve = new boolean[N];
        Arrays.fill(sieve,true);
        sift();

    }

    private void sift() {
        sieve[1] = true;
        for (int i = 2; i * i < N; i++)
            if (sieve[i])
                for (int j = 2; j < sieve.length; j++) {
                    sieve[j] = false;
                }
    }

    public boolean isSimple(int n){
        if (n == 0){
            return false;
        }
        else {
            return true;
        }
    }

     public static void main(String[] args) {
         Eratosthenes era = new Eratosthenes (6);
         System.out.println(era);

     }
 }
