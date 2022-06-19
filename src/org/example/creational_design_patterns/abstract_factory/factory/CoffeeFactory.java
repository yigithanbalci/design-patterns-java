package org.example.creational_design_patterns.abstract_factory.factory;

import org.example.creational_design_patterns.abstract_factory.product.coffee_bean.CoffeeBean;
import org.example.creational_design_patterns.abstract_factory.product.milk.Milk;

public abstract class CoffeeFactory {
    public abstract CoffeeBean createCoffeeBean();
    public abstract Milk createMilk();
}
