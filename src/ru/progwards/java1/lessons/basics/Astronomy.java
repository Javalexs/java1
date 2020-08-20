package ru.progwards.java1.lessons.basics;

import com.sun.source.util.SourcePositions;

public class Astronomy {
    public static final double Pi = 3.14;
    public static final double r = 6371.2;
    public static final double r1 = 2439.7;
    public static final double r2 = 71492.0;

    public static void main(String[] args){

        System.out.println (sphereSquare(r));
        System.out.println (sphereSquare(r1));
        System.out.println (sphereSquare(r2));
        System.out.println (sphereSquare (r)/sphereSquare (r1));
        System.out.println (sphereSquare (r)/sphereSquare (r2));
    }
    public static Double sphereSquare (Double r){
        double S = 4.0*Pi*r*r;
        return S;
    }
    public static Double earthSquare(){

        return sphereSquare(6371.2);
    }
    public static Double mercurySquare(){
        return sphereSquare(2439.7);
    }
    public static Double jupiterSquare() {
        return sphereSquare(71492.0);
    }
    public static Double earthVsMercury(){
        return (sphereSquare(6371.2)/sphereSquare(2439.7));
    }
    public static Double earthVsJupiter(){
        return (sphereSquare(6371.2)/sphereSquare(71492.0));
    }
}

