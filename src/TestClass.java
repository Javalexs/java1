

public class TestClass {
//    public int i;

    public static void main(String[] args) {
        System.out.println(fiboNumber(1));

    }
    public static int fiboNumber (int n) {
        if(n == 1) return 1000000;
        int x = 0;
        int x1 = 1;
        int x2 = 0;
        for (int i = 1; i <= n - 1; i++) {
            x = x1 + x2;
            x1 = x2;
            x2 = x;
        }
        return x;
    }
//    public static String fda (String str){
////            int x = Integer.parseInt(str);
//        int a = 0;
//        for(int i = 0; i < 3; i++){
//            a += str.charAt(i);
//        }
//        int b = 0;
//        for(int i = 3; i < 6; i++){
//            b += str.charAt(i);
//        }
//        if (a == b){
//            return "Да";
//        }else {
//            return "Нет";
//        }


}
