package ru.progwards.java1.lessons.classes;

import jdk.swing.interop.SwingInterOpUtils;

public class Animal {

    double weight;
    
    enum AnimalKind{
        ANIMAL,COW,HAMSTER,DUCK};
    enum FoodKind {
        UNKNOWN,HAY,CORN};


    public static void main(String[] args) {

    }
    public static void printInfo(Animal Cow){
        System.out.println(Animal.COW);

    }
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
            return "I am" + getKind() + "," + "eat" + getFoodKind();

        }

    public class Cow extends Animal{
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
    public class Hamster extends Animal{
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
    public class DUCK extends Animal{
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