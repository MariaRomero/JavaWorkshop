package exercise03;

/**
 * Created by mromero on 15/11/16.
 */
public class Cat {
    public String name;
    public int weight;

    Cat(String name, int weight){
        this.name = name;
        this.weight = weight;
    }

    public int eat(int amount) {
        return weight += amount/2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cat)) return false;

        Cat cat = (Cat) o;

        if (weight != cat.weight) return false;
        if (name != null ? !name.equals(cat.name) : cat.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + weight;
        return result;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
