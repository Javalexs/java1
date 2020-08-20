package ru.progwards.java1.lessons.classes;

public class Cow extends Animal {
        public Cow(double weight) {
            super(weight);
        }
        public Cow(double weight, double H) {
            super(weight, H);
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
        public double getWeight() {
            return weight;
        }

        @Override
        public double getFoodCoeff() {
            return 0.05;
        }

        @Override
        public double calculateFoodWeight(){
            return weight * 0.05;
        }
}
