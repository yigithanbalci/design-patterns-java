package org.example.creational_design_patterns.abstract_factory.factory;

import org.example.creational_design_patterns.abstract_factory.product.coffee_bean.ArabicaBean;
import org.example.creational_design_patterns.abstract_factory.product.coffee_bean.CoffeeBean;
import org.example.creational_design_patterns.abstract_factory.product.milk.Milk;
import org.example.creational_design_patterns.abstract_factory.product.milk.OatMilk;

public class AromaticCoffeeFactory extends CoffeeFactory{
    @Override
    public CoffeeBean createCoffeeBean() {
        return new ArabicaBean();
    }

    @Override
    public Milk createMilk() {
        return new OatMilk();
    }
}
