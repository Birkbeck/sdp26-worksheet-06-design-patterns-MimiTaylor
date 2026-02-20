package bridge;

public class BigWheel extends Car {

    public BigWheel(Product product, String carType) {
        super(product, carType);
    }

    @Override
    public void assemble() {
        System.out.println("Assembling (inside BigWheel class): ");
    }

    @Override
    public void produceProduct() {
        System.out.println("Producing the following (inside BigWheel class): ");
        product.produce();
    }
}
