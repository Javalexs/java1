package ru.progwards.java1.lessons.interfaces;

public class Duck extends Animal {
    @Override
    public double getFood1kgPrice(){
        switch (getFoodKind()) {
            case HAY: return 20;
            case CORN: return 50;
            default: return 0;
        }
    }
    @Override
    public int compareFoodPrice(Animal animal){
        return Double.compare(this.getFoodPrice(), animal.getFoodPrice());
    }

    public Duck(double weight) {
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
    public double getWeight() {
        return weight;
    }

    @Override
    public double getFoodCoeff() {
        return 0.04;
    }

    @Override
    public double calculateFoodWeight(){
        return getWeight() * getFoodCoeff();
    }
}
