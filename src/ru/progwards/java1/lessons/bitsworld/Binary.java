package ru.progwards.java1.lessons.bitsworld;

public class Binary {
    byte num;
    public static void main(String[] args) {
        Binary b = new Binary( (byte) 127);
        System.out.println(b);
    }
    public Binary(byte num){
        this.num = num;

    }
    public String toString(){
        String text = "";
        for(int i = 0; i < 8; i++) {
            text = (num >> i & (0x1)) + text;
        }
        return text;

    }
    
}
