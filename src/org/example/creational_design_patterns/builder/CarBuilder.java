package org.example.creational_design_patterns.builder;

public interface CarBuilder {
    void buildNumberOfDoors();
    void buildMotorSize();
    void buildHorsePower();
    Car getCar();
}
