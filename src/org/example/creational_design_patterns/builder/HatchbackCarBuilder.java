package org.example.creational_design_patterns.builder;

public class HatchbackCarBuilder implements CarBuilder{
    private final Car car;

    public HatchbackCarBuilder(Car car) {
        this.car = car;
    }

    @Override
    public void buildNumberOfDoors() {
        car.setNumberOfDoors(5);
    }

    @Override
    public void buildMotorSize() {
        car.setMotorSize(1.2);
    }

    @Override
    public void buildHorsePower() {
        car.setHorsePower(90);
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
