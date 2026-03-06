public class ShippingCostCalculator implements ShippingVisitor {

    @Override
    public double visitChair(Chair chair) {
        return 20.0; // flat rate
    }

    @Override
    public double visitTable(Table table) {
        return table.getLength() * 10;
    }

    @Override
    public double visitSofa(Sofa sofa) {
        return sofa.getWeight() * sofa.getDistance() * 0.5;
    }
}