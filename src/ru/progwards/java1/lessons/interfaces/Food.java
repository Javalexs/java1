package ru.progwards.java1.lessons.interfaces;

public class Food {
    private int weight;
    public Food(int weight){
        this.weight = weight;
    }

    public int getWeight(){
        return weight;
    }
    public CompareWeight.CompareResult compareWeight(CompareWeight smthHasWeigt){
        if(this.weight < weight) {
            return CompareWeight.CompareResult.LESS;
        }else if(this.weight == weight){
            return CompareWeight.CompareResult.EQUAL;
        } else{
            return CompareWeight.CompareResult.GREATER;
        }


    }

}
