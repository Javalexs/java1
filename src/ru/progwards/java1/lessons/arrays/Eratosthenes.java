package ru.progwards.java1.lessons.arrays;


import java.util.Arrays;

public class Eratosthenes {

    int N;
    private boolean[] sieve;

    public Eratosthenes (int N){
        this.N = N;
        sieve = new boolean[N];
        Arrays.fill(sieve,true);
        sift();
    }

    private void sift() {
        sieve[1] = false;
        for (int i = 2; i * i < N; i++)
            if (sieve[i])
                for (int j = i*i; j < N; j += i)
                    sieve[j] = false;
    }

    public boolean isSimple(int n){
        return sieve[n];

    }

    public static void main(String[] args) {
    }
}
