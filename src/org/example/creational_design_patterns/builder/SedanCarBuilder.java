package org.example.creational_design_patterns.builder;

public class SedanCarBuilder implements CarBuilder{
    private final Car car;

    public SedanCarBuilder(Car car) {
        this.car = car;
    }

    @Override
    public void buildNumberOfDoors() {
        car.setNumberOfDoors(4);
    }

    @Override
    public void buildMotorSize() {
        car.setMotorSize(1.6);
    }

    @Override
    public void buildHorsePower() {
        car.setHorsePower(120);
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
