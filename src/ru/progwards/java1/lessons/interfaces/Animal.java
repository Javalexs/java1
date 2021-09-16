package ru.progwards.java1.lessons.interfaces;

import java.util.Objects;

public class Animal implements FoodCompare, CompareWeight {
            double weight;
    private double smthHasWeigt;


    public enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
        public enum FoodKind {UNKNOWN, HAY, CORN};

        public static void main(String[] args) {
//       Animal animal = new Animal(30.0);
//        //System.out.println(calculateFoodWeight());
//        Cow cow = new Cow (31.9);
//        //System.out.println(cow.toStringFull());
//        Hamster hamster = new Hamster(2.9);
////        System.out.println(hamster.toStringFull());
//        Duck duck = new Duck(9.0, 0.04);
////        System.out.println(duck.toStringFull());

        }
//    public enum CompareResult{
//        LESS,
//        EQUAL,
//        GREATER,
//
//    }
    public CompareResult compareWeight(CompareWeight smthHasWeigt){
            if(this.weight < weight) {
                return CompareResult.LESS;
            }else if(this.weight == weight){
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
