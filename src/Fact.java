public class Fact {
    public static void main(String[] args) {
        System.out.println(factorial(0));
        int speed = 1;
        System.out.println(Integer.toBinaryString(speed));

    }
    static long factorial(long n){
        long a = 1;
        for(long i = 1; i <= n; i++){
            if(n == 0)
                break;
            a *=i;
        }
        return a;
    }
}

