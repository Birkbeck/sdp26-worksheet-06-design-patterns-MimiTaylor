package bridge;

public class Motoren extends Car {

    public Motoren(Product product, String carType) {

        super(product, carType);
    }


    @Override
    public void assemble() {
        System.out.println("Assembling (inside Motoren class): ");
    }

    @Override
    public void produceProduct() {
        System.out.println("Producing the following (inside Motoren class): ");
        product.produce();
    }
}
