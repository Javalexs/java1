package ru.progwards.java1.lessons.bigints;

public class ShortInteger extends AbsInteger{
    short num;
    public ShortInteger(short num){

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
