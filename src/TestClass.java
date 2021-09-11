

public class TestClass {
//    public int i;

    public static void main(String[] args) {
        System.out.println(fda("324306"));

    }
    public static int fda (String s){
            int x = Integer.parseInt(s);
//        for(int i = 1; i < 4; i++){
//            a += s.charAt(i);
//        }
//        char b = 0;
//        for(int i = 4; i < 7; i++){
//            b += s.charAt(i);
//        }
        int a = x/100000 + (x/10000)%10 + (x/1000)%10;
        int b = x/100 + x/10;
//        if (a == b) {
            return a;
//        }else{
//            return "kjk";
//        }

    }
}
