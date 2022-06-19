package org.example.creational_design_patterns.abstract_factory.product.milk;

public class OatMilk implements Milk{
    @Override
    public void prepareMilk() {
        System.out.println("Oat milk");
    }
}
