package ru.progwards.java1.lessons.interfaces;

import java.lang.constant.Constable;

public class Animal {
    double weight;
    public boolean equals(Object anObject){
        if(this == anObject) return true;
        if(anObject == null || getClass() != anObject.getClass() ) return false;
        Animal animal = (Animal) anObject;
        return Double.compare(animal.weight, weight) == 0;
    }
    public int compareFoodPrice(Animal animal){
        return Double.compare(this.getFoodPrice(), animal.getFoodPrice());
    }


    public enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
    public enum FoodKind {UNKNOWN, HAY, CORN};
        public double getFood1kgPrice(){
            switch (getFoodKind()) {
                case HAY: return 20;
                case CORN: return 50;
                default: return 0;
            }

        }

    public static void main(String[] args) {
    }

    public double getFoodPrice(){
        return calculateFoodWeight() * getFood1kgPrice();
    }

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }
    public double getFoodCoeff() {
        return 0.02;
    }
    public double calculateFoodWeight(){
        return getFoodCoeff() * getWeight();
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    public String toString() {
        return "I am " + getKind() + ", eat " + getFoodKind();

    }
    public String toStringFull() {
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + getFoodCoeff() * getWeight();
    }
}

