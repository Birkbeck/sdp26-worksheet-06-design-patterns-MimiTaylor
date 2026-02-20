package bridge;

public class CentralLocking implements Product {

    String productName; // CentralLocking IS-A product

    public CentralLocking(String productName) {
        this.productName = productName;
    }

    @Override
    public String productName() {
        return productName;
    }

    @Override
    public void produce() {
        System.out.println("Producing Central Locking (inside CentralLocking class).");    }
}
