package exercise04;

public class Animal {

    public int weight;

    public Animal(int weight) {
        this.weight= weight;
    }

    public void eat(int mealSize){
        weight += mealSize;
    }
}
