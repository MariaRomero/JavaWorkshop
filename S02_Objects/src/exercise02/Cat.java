package exercise02;

public class Cat {

    private final String name;
    int weight;

    public Cat(String name, int weight) {
        this.name= name;
        this.weight= weight;

    }

    public void eat(int mealSize){
        weight += mealSize;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


}
