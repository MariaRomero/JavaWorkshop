package exercise04;

public class Cat extends Animal{

    public String name;

    public Cat (String name, int weight) {
        super(weight);
        this.name= name;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }


}
