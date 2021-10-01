package ru.progwards.java1.lessons.bigints;

    public class ByteInteger extends AbsInteger {
        byte a;

        public ByteInteger(byte a){
            this.a = a;
        }

        public byte getA() {
            return a;
        }

        @Override
        public String toString() {
            return "ByteInteger{" +
                    "a=" + a +
                    '}';
        }
    }
