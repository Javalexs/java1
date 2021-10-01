package ru.progwards.java1.lessons.bigints;

    public class ShortInteger extends AbsInteger{
        short a;

        public ShortInteger(short a) {
            this.a = a;
        }

        public short getA() {
            return a;
        }

        @Override
        public String toString() {
            return "ShortInteger{" +
                    "a=" + a +
                    '}';
        }
    }
