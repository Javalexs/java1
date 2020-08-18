package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;
    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
    enum FoodKind {UNKNOWN, HAY, CORN};

    public static void main(String[] args) {
        Animal animal = new Animal(45);
        System.out.println(animal);
        Cow cow = new Cow(100);
        System.out.println(cow);
        Hamster hamster = new Hamster(2);
        System.out.println(hamster);
        Duck duck = new Duck(9);
        System.out.println(duck);
    }

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public AnimalKind getKind() {
        return AnimalKind.ANIMAL;
    }

    public FoodKind getFoodKind() {
        return FoodKind.UNKNOWN;
    }

    public double getFoodCoeff(){
        return 0.02;
    }
    public double calculateFoodWeight(){
        double calculateFoodWeight = weight * getFoodCoeff();
        return calculateFoodWeight;
    }

    public String toString() {
        return "I am " + getKind() + ", eat " + double calculateFoodWeight;
    }
}

