package builder;

public class SedanCarBuilder implements CarBuilder{

    private Car SedanCar = new Car("Sedan Car");

    @Override
    public void buildBodyStyle() {
        SedanCar.setBodyStyle("Sedan body style");
    }

    @Override
    public void buildPower(){
        SedanCar.setPower("Sedan power");
    }

    @Override
    public void buildEngine() {
        SedanCar.setEngine("Sedan engine");
    }

    @Override
    public void buildBreaks() {
        SedanCar.setBreaks("Sedan breaks");
    }

    @Override
    public void buildSeats() {
        SedanCar.setSeats("Sedan seats");
    }

    @Override
    public void buildWindows() {
        SedanCar.setWindows("Sedan windows");
    }

    @Override
    public void buildFuelType() {
        SedanCar.setFuelType("Sedan fuel type");
    }

    @Override
    public Car getCar(){
        return SedanCar;
    }
}

