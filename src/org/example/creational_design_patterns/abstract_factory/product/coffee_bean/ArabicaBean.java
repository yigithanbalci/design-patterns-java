package org.example.creational_design_patterns.abstract_factory.product.coffee_bean;

public class ArabicaBean implements CoffeeBean{
    @Override
    public void prepareCoffeeBean() {
        System.out.println("Arabica Bean");
    }
}
