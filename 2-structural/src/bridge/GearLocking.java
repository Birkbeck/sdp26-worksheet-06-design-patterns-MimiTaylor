package bridge;

public class GearLocking implements Product {

    String productName; // GearLocking IS-A product

    public GearLocking(String productName) {
        this.productName = productName;    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Gear Locking (inside GearLocking class).");
    }
}
