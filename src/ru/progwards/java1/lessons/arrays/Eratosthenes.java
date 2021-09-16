package ru.progwards.java1.lessons.arrays;

public class Eratosthenes {
    private boolean[] sieve;
    int N;
        public Eratosthenes(int N){
            this.N = N;
            this.sieve = new boolean[N];
                for(int i = 1; i < N; i++){
                    sieve [i] = true;
                }
            sift();
        }

        private void sift(){
            sieve[1] = false;
            for(int i = 2; i < N - 1; i++){
                for(int j = 2; j*i < N - 1; j++){
                    sieve[i*j] = false;
                }
            }
        }

        public boolean isSimple(int n){
            return sieve[n];
        }

    public static void main(String[] args) {
        Eratosthenes erat = new Eratosthenes(20);

        System.out.println(erat.isSimple(1));
        System.out.println(erat.isSimple(2));
        System.out.println(erat.isSimple(3));
        System.out.println(erat.isSimple(4));
        System.out.println(erat.isSimple(5));

    }
}
