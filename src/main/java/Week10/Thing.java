package Week10;

public class Thing {
    private final String name;
    private final int weight;

    public Thing(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return name+" ("+weight+" kg)";
    }
}
