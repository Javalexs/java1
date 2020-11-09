package ru.progwards.java1.lessons.bigints;

public abstract class AbsInteger {
    int num;
    public AbsInteger(){
    }
    public int getValue(){
        return num;
    }
    public static AbsInteger add(AbsInteger num1, AbsInteger num2){
        num1 = num1;
        num2 = num2;
        int a = num1.getValue();
        int b = num2.getValue();

        int res = a + b;

        if (res > -128 & res <= 127) {
            return new ByteInteger((byte) res);
        } else if (res < -128 & res >= -32768) {
            return new ShortInteger((short) res);
        } else if( res > 127 & res <= 32767) {
            return new ShortInteger((short) res);
        }else {
            return new IntInteger(res);
        }
    }
}
        


