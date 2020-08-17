package ru.progwards.java1.lessons.classes;

public class Animal {


    double weight;
    
    enum AnimalKind{
        ANIMAL,COW,HAMSTER,DUCK};
    enum FoodKind {
        UNKNOWN,HAY,CORN};


    public static void main(String[] args) {
        Cow cow = new Cow(100);
        System.out.println(cow);
        Hamster hamster = new Hamster(2);
        System.out.println(hamster);
        DUCK duck = new DUCK(9);
        System.out.println(duck);
    }



        public Animal(double weight){

        this.weight = weight;
        }

        public AnimalKind getKind(){
            return AnimalKind.ANIMAL;
        }
        public FoodKind getFoodKind(){
            return FoodKind.UNKNOWN;
        }
        public String toString(){
            return "I am " + getKind() + ", eat " + getFoodKind();

        }

    public static class Cow extends Animal {
        public Cow(double weight) {
            super(weight);
        }

        @Override
        public AnimalKind getKind() {
            return AnimalKind.COW;
        }

        @Override
        public FoodKind getFoodKind() {
            return FoodKind.HAY;
        }
    }
    public static class Hamster extends Animal{
        public Hamster(double weight) {
            super(weight);
        }
        @Override
        public AnimalKind getKind() {
            return AnimalKind.HAMSTER;
        }
        @Override
        public FoodKind getFoodKind() {
            return FoodKind.CORN;
        }
    }
    public static class DUCK extends Animal{


        public DUCK(double weight) {
            super(weight);
        }

        @Override
        public AnimalKind getKind() {
            return AnimalKind.DUCK;
        }
        @Override
        public FoodKind getFoodKind() {
            return FoodKind.CORN;
        }
    }

}