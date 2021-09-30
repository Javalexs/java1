package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Animal implements FoodCompare, CompareWeight {
    double weight;

    public enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
        public enum FoodKind {UNKNOWN, HAY, CORN};

        public static void main(String[] args) {

        }
//    public enum CompareResult{
//        LESS,
//        EQUAL,
//        GREATER,
//
//    }

    public CompareResult compareWeight(CompareWeight smthHasWeigt){
            Animal an = (Animal) smthHasWeigt;
            if(this.getWeight() < an.getWeight()) {
                return CompareResult.LESS;
            }else if(this.getWeight() == an.getWeight()){
                return CompareResult.EQUAL;
            } else{
                return CompareResult.GREATER;
            }
    }

    public double getFood1kgPrice(){
            switch (getFoodKind()){
                case HAY: return 20.0;
                case CORN: return 50.0;
                case UNKNOWN: return 0.0;
            }
            return 0.0;
    }
    public double getFoodPrice(){
            return calculateFoodWeight() * getFood1kgPrice();
    }
    public int compareFoodPrice(Animal animal){
            return Double.compare(animal.getFoodPrice(), getFoodPrice());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Double.compare(animal.weight, weight) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(weight);
    }

    public Animal(double weight) {
            this.weight = weight;
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

        public double getWeight() {
            return weight;
        }
        public double getFoodCoeff() {
            return 0.02;
        }
        public double calculateFoodWeight(){
            return getFoodCoeff() * getWeight();
        }

        public String toStringFull() {
            return "I am " + getKind() + ", eat " + getFoodKind() + " " + getFoodCoeff() * getWeight();
        }



}
