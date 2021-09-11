package ru.progwards.java1.lessons.arrays;

public class Eratosthenes {
    private boolean[] sieve;
    int N;
        public Eratosthenes(int N){
            this.N = N;
            this.sieve = new boolean[N];
                for(int i = 0; i <= N; i++){
                    sieve [i] = true;
                }
            sift();
        }

        private void sift(){
            sieve[1] = false;
            for(int i = 2; i < N - 1; i++){
                for(int j = 2; j*i < N - 1; j++){
                    sieve[j] = false;
                }
            }
        }

        public boolean isSimple(int n){
            return sieve[n];
        }

    public static void main(String[] args) {
        System.out.println(new Eratosthenes(7));

    }
}
