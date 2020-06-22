package ru.progwards.java1.lessons.basics;

public class Astronomy {
    public static void main(String[] args){
        System.out.println (sphereSquare (1.00));
        System.out.println (earthSquare (6371.2));
        System.out.println (mercurySquare(2439.7));
        System.out.println (jupiterSquare (71492.0));
        System.out.println (earthVsMercury( 6371.2, 2439.7));
        System.out.println (earthVsJupiter (6371.2, 71492.0));

    }
    public static Double sphereSquare (Double r){
        double S = 4.0*3.14*r*r;
        return S;
    }
    public static Double earthSquare(Double r1){
        double S1 = 4.0*3.14*r1*r1;
        return S1;
    }
    public static Double mercurySquare(Double r2){
        double S2 = 4.0*3.14*r2*r2;
        return S2;
    }
    public static Double jupiterSquare (Double r3){
        double S3 = 4.0*3.14*r3*r3;
        return S3;
    }
    public static Double earthVsMercury (Double r1, Double r2){
        double z1 = (r1 * r1) / (r2 * r2);
        return z1;
    }
    public static Double earthVsJupiter (Double r1, Double r3){
        double z2 = (r1 * r1) / (r3 * r3);
        return z2;
    }
}

