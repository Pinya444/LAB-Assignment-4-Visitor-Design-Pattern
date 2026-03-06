public class Test {

    public static void main(String[] args) {

        ShippingVisitor calculator = new ShippingCostCalculator();

        Chair chair = new Chair("Office Chair", 5);
        Table table = new Table("Dining Table", 2.5);
        Sofa sofa = new Sofa("Living Room Sofa", 40, 15);

        System.out.println("Shipping cost for " + chair.getName() + " : " +
                chair.accept(calculator));

        System.out.println("Shipping cost for " + table.getName() + " : " +
                table.accept(calculator));

        System.out.println("Shipping cost for " + sofa.getName() + " : " +
                sofa.accept(calculator));
    }
}