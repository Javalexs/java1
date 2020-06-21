package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static void main(String[] args) {
        System.out.println(sphereSquare (1.0d));
        System.out.println(earthSquare (6371.2d));
        System.out.println(mercurySquare(2439.7d));
        System.out.println(jupiterSquare (71492.0d));
        System.out.println(earthVsMercury( 6371.2d, 2439.7d));
        System.out.println(earthVsJupiter (6371.2d, 71492.0d));
    }
    public static Double sphereSquare (Double r){
        double p = 3.14d;
        double S = 4*p*r*r;
        return S;
    }
    public static Double earthSquare(Double r1){
        double p = 3.14d;
        double S1 = 4*p*r1*r1;
        return S1;
    }
    public static Double mercurySquare(Double r2){
        double p = 3.14d;
        double S2 = 4*p*r2*r2;
        return S2;
    }
    public static Double jupiterSquare (Double r3){
        double p = 3.14d;
        double S3 = 4*p*r3*r3;
        return S3;
    }
    public static Double earthVsMercury (Double r1, Double r2){
        Double z1 = (r1 * r1) / (r2 * r2);
        return z1;
    }
    public static Double earthVsJupiter (Double r1, Double r3){
        Double z2 = (r1 * r1) / (r3 * r3);
        return z2;
    }
}

