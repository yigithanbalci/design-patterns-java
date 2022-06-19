package org.example.creational_design_patterns.factory_method.animal;

public class Dog implements Animal{
    @Override
    public String voice() {
        return "Bark";
    }
}
