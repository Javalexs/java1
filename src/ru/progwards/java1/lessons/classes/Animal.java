package ru.progwards.java1.lessons.classes;

public class Animal {

    double weight;


    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
    enum FoodKind {UNKNOWN, HAY, CORN};

    public static void main(String[] args) {
//        Animal animal = new Animal(30.0);
//        System.out.println(calculateFoodWeight());
//        Cow cow = new Cow (31.9, 34,6)
//        System.out.println(cow.toStringFull());
//        Hamster hamster = new Hamster(2.9, 0.03);
//        System.out.println(hamster.toStringFull());
//        Duck duck = new Duck(9.0, 0.04);
//        System.out.println(duck.toStringFull());

    }

    public Animal(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return 34.9;
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
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight();
    }
}

