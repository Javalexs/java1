package ru.progwards.java1.lessons.bigints;

    public class IntInteger extends AbsInteger{
        int a;

        public IntInteger(int a) {
            this.a = a;
        }

        public int getA() {
            return a;
        }

        @Override
        public String toString() {
            return "IntInteger{" +
                    "a=" + a +
                    '}';
        }
    }
