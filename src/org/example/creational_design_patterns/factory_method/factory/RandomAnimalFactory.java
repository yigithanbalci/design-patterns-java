package org.example.creational_design_patterns.factory_method.factory;

import org.example.creational_design_patterns.factory_method.animal.Animal;
import org.example.creational_design_patterns.factory_method.animal.Cat;
import org.example.creational_design_patterns.factory_method.animal.Dog;
import org.example.creational_design_patterns.factory_method.animal.Fish;

public class RandomAnimalFactory implements AnimalFactory{
    @Override
    public Animal createAnimal() {
        int rand = (int) ((Math.random() * (3 - 1)) + 1);
        Animal animal;
        switch (rand){
            case 1:
                animal = new Cat();
                break;
            case 2:
                animal = new Dog();
                break;
            case 3:
                animal = new Fish();
                break;
            default:
                throw new IllegalArgumentException("Random must be between 1 and 3");
        }
        return animal;
    }
}
