package org.example.creational_design_patterns.factory_method.animal;

public class Cat implements Animal{
    @Override
    public String voice() {
        return "Meow";
    }
}
