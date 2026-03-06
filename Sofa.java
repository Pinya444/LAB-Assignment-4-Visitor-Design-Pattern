public class Sofa implements Furniture {

    private String name;
    private double weight;
    private double distance;

    public Sofa(String name, double weight, double distance) {
        this.name = name;
        this.weight = weight;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public double getDistance() {
        return distance;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visitSofa(this);
    }
}