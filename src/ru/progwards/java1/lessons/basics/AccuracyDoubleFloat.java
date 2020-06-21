package ru.progwards.java1.lessons.basics;

public class AccuracyDoubleFloat {
    public static void main(String[] args) {
        System.out.println (volumeBallDouble(6371.2));
        System.out.println (volumeBallFloat (6371.2f));
        System.out.println (calculateAccuracy (10));

    }
    public static double volumeBallDouble(double radius){
        double p = 3.14;
        double V = 4/3*p*radius*radius*radius;
        return V;
    }
    public static float volumeBallFloat(float radius){
        float p = 3.14f;
        float V = 4f/3f*p*radius*radius*radius;
        return V;
    }
    public static double calculateAccuracy(double radius) {
        double p1 = 3.14;
        double radius1 = 6371.2;
        float p2 = 3.14f;
        float radius2 = 6371.2f;
        double Raz = (4/3*p1*radius1*radius1*radius1) - (4f/3f*p2*radius2*radius2*radius2);
        return Raz;

    }
}
