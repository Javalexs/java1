package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static void main(String[] args) {
        System.out.println(sphereSquare (1.00));
        System.out.println(earthSquare (6371.20));
        System.out.println(mercurySquare(2439.70));
        System.out.println(jupiterSquare (71492.00));
        System.out.println(earthVsMercury( 6371.20, 2439.70));
        System.out.println(earthVsJupiter (6371.20, 71492.00));
    }
    public static Double sphereSquare (double r){
        double p = 3.14d;
        double S = 4.0*p*r*r;
        return S;
    }
    public static Double earthSquare(double r1){
        double p = 3.14d;
        double S1 = 4.0*p*r1*r1;
        return S1;
    }
    public static Double mercurySquare(double r2){
        double p = 3.14d;
        double S2 = 4.0*p*r2*r2;
        return S2;
    }
    public static Double jupiterSquare (double r3){
        double p = 3.14d;
        double S3 = 4.0*p*r3*r3;
        return S3;
    }
    public static Double earthVsMercury (double r1, double r2){
        double z1 = (r1 * r1) / (r2 * r2);
        return z1;
    }
    public static Double earthVsJupiter (double r1, double r3){
        double z2 = (r1 * r1) / (r3 * r3);
        return z2;
    }
}

