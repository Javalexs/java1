package ru.progwards.java1.lessons.classes;

import jdk.swing.interop.SwingInterOpUtils;

public class Animal {
    double weight;
    Animal animal;
    enum AnimalKind{
        ANIMAL,COW,HAMSTER,DUCK};
    enum FoodKind {
        UNKNOWN,HAY,CORN};


    public static void main(String[] args) {
        System.out.println(AnimalKind.);
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
            return "I am" + AnimalKind.ANIMAL + ", eat" + FoodKind.UNKNOWN;

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
        @Override
        public String toString() {
            return "I am" + AnimalKind.COW + "," + "eat" + FoodKind.HAY;
        }
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
        @Override
        public String toString() {
            return "I am" + AnimalKind.HAMSTER + "," + "eat" + FoodKind.CORN;
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
        @Override
        public String toString() {
            return "I am" + AnimalKind.DUCK + "," + "eat" + FoodKind.CORN;
        }
    }








}