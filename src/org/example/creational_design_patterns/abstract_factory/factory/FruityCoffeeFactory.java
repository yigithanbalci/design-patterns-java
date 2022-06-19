package org.example.creational_design_patterns.abstract_factory.factory;

import org.example.creational_design_patterns.abstract_factory.product.coffee_bean.CoffeeBean;
import org.example.creational_design_patterns.abstract_factory.product.coffee_bean.LibericaBean;
import org.example.creational_design_patterns.abstract_factory.product.milk.Milk;
import org.example.creational_design_patterns.abstract_factory.product.milk.SoyMilk;

public class FruityCoffeeFactory extends CoffeeFactory {
    @Override
    public CoffeeBean createCoffeeBean() {
        return new LibericaBean();
    }

    @Override
    public Milk createMilk() {
        return new SoyMilk();
    }
}
