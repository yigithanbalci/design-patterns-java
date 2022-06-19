package org.example.creational_design_patterns.builder;

public class CarEngineer {
    private final CarBuilder carBuilder;

    public CarEngineer(CarBuilder carBuilder) {
        this.carBuilder = carBuilder;
    }

    public Car constructCar(){
        this.carBuilder.buildNumberOfDoors();
        this.carBuilder.buildMotorSize();
        this.carBuilder.buildHorsePower();
        return this.carBuilder.getCar();
    }
}
