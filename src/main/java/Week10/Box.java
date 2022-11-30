package Week10;

public class Box extends ToBeStored {
    private final double maxWeight;
    private double currentWeight;
    private int itemCount;

    public Box(double maxWeight) {
        super("Box", "Box", 0);
        this.maxWeight = maxWeight;
        this.currentWeight = 0;
        this.itemCount = 0;
    }

    public double weight() {
        return currentWeight;
    }

    public void add(ToBeStored item) {
        if (currentWeight + item.weight() <= maxWeight) {
            currentWeight += item.weight();
            itemCount++;
        }
    }

    @Override
    public String toString() {
        return "Box: " + itemCount + " things, total weight " + currentWeight + " kg";
    }
}

