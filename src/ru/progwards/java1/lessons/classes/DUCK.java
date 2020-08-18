package ru.progwards.java1.lessons.classes;

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
