public class Chair implements Furniture {

    private String name;
    private double weight;

    public Chair(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visitChair(this);
    }
}