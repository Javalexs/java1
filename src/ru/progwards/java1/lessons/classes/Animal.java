package ru.progwards.java1.lessons.classes;

public class Animal {
    double weight;
    double H;

    enum AnimalKind {ANIMAL, COW, HAMSTER, DUCK};
    enum FoodKind {UNKNOWN, HAY, CORN};

    public static void main(String[] args) {
        Animal animal = new Animal(30.0);
        System.out.print(animal);
        System.out.println(animal.calculateFoodWeight(3.4,0.02));
        Cow cow = new Cow(31.0);
        System.out.print(cow);
        System.out.println(animal.calculateFoodWeight(3.4,0.05));
        Hamster hamster = new Hamster(2);
        System.out.print(hamster);
        System.out.println(animal.calculateFoodWeight(3.4,0.03));
        Duck duck = new Duck(9);
        System.out.print(duck);
        System.out.println(animal.calculateFoodWeight(3.4,0.04));

    }

    public Animal(double weight) {
        this.weight = weight;

    }
    public Animal(double weight, double H){
        this.weight = weight;
        this.H = H;

    }

    public double getWeight() {
        return weight;
    }
    public double getFoodCoeff() {
        return H;
    }
    public double calculateFoodWeight(double weight, double H){
        return weight * H;
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
        return "I am " + getKind() + ", eat " + getFoodKind() + " " + calculateFoodWeight(weight,H);
    }
}

