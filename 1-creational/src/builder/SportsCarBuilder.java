package builder;

public class SportsCarBuilder implements CarBuilder{

    private Car sportsCar = new Car("Sports Car");

    public SportsCarBuilder() {

    }

    @Override
    public void buildBodyStyle() {
        sportsCar.setBodyStyle("Sports body style");
    }

    @Override
    public void buildPower(){
        sportsCar.setPower("Sports power");
    }

    @Override
    public void buildEngine() {
        sportsCar.setEngine("Sports engine");
    }

    @Override
    public void buildBreaks() {
        sportsCar.setBreaks("Sports breaks");
    }

    @Override
    public void buildSeats() {
        sportsCar.setSeats("Sports seats");
    }

    @Override
    public void buildWindows() {
        sportsCar.setWindows("Sports windows");
    }

    @Override
    public void buildFuelType() {
       sportsCar.setFuelType("Sports fuel type");
    }

    @Override
    public Car getCar(){
        return sportsCar;
    }
}