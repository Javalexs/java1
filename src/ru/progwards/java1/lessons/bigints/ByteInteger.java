package ru.progwards.java1.lessons.bigints;

public class ByteInteger extends AbsInteger{
    byte num;
    public ByteInteger(byte num) {
        super();
        this.num = num;
    }

    @Override
    public int getValue(){
        return num;
    }
    @Override
    public String toString() {
        return "" + num;
    }
}
