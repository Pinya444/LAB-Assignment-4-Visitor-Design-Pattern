public class Table implements Furniture {

    private String name;
    private double length;

    public Table(String name, double length) {
        this.name = name;
        this.length = length;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double accept(ShippingVisitor visitor) {
        return visitor.visitTable(this);
    }
}