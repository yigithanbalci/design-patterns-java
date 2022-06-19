package org.example.creational_design_patterns.builder;

public class Car {
    private Integer numberOfDoors;
    private Double motorSize;
    private Integer horsePower;

    public Integer getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(Integer numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public Double getMotorSize() {
        return motorSize;
    }

    public void setMotorSize(Double motorSize) {
        this.motorSize = motorSize;
    }

    public Integer getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(Integer horsePower) {
        this.horsePower = horsePower;
    }
}
