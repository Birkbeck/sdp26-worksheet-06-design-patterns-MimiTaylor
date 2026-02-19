package builder;

public class SportsCarBuilder implements CarBuilder{

    private Car sportsCar;

    public SportsCarBuilder(Car sportsCar) {
        this.sportsCar = sportsCar;
    }

    @Override
    public void buildBodyStyle() {
        // TODO: implement
    }

    @Override
    public void buildPower(){
        // TODO: implement
    }

    @Override
    public void buildEngine() {
        // TODO: implement
    }

    @Override
    public void buildBreaks() {
        // TODO: implement
    }

    @Override
    public void buildSeats() {
        // TODO: implement
    }

    @Override
    public void buildWindows() {
        // TODO: implement
    }

    @Override
    public void buildFuelType() {
        // TODO: implement
    }

    @Override
    public Car getCar(){
        // TODO: implement
        return null;
    }
}