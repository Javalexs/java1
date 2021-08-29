package ru.progwards.java1.lessons.classes;

public class ComplexNum {
    int a;
    int b;

    public ComplexNum(int a, int b){
        this.a = a;
        this.b = b;
    }
    @Override
    public String toString() {

        return this.a + "+" + this.b + "i";
    }
    public ComplexNum add(ComplexNum num) { // (a + bi) + (c + di) = (a + c) + (b + d)i
        this.a = this.a + num.a;
        this.b = this.b + num.b;
        return this;
    }
    public ComplexNum sub(ComplexNum num) { //(a + bi) - (c + di) = (a - c) + (b - d)i
        this.a = this.a - num.a;
        this.b = this.b - num.b;
        return this;
    }

    public ComplexNum mul(ComplexNum num) { //(a + bi) * (c + di) = (a*c - b*d) + (b*c + a*d)i
        int a = this.a;
        int b = this.b;

        this.a = a*num.a - b*num.b;
        this.b = b*num.a + a*num.b;

        return this;
    }

    public ComplexNum div(ComplexNum num) { //(a + bi) / (c + di) = (a*c + b*d)/(c*c+d*d) + ((b*c - a*d)/(c*c+d*d))i
        int a = this.a;
        int b = this.b;

        this.a = (a*num.a + b*num.b)/(num.a*num.a + num.b*num.b);
        this.b = (b*num.a - a*num.b)/(num.a*num.a + num.b*num.b);

        return this;
    }

    public static void main(String[] args) {

    }



}
