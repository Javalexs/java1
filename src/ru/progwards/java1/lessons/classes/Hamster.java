package ru.progwards.java1.lessons.classes;

public class Hamster extends Animal{
    public Hamster(double weight) {
        super(weight);
        }
    public Hamster(double weight, double H ) {
        super(weight,H);
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
        public double getWeight() {
            return weight;
        }

        @Override
        public double getFoodCoeff() {
            return H;
        }

        @Override
        public double calculateFoodWeight(){
            return weight * H;
        }

}
