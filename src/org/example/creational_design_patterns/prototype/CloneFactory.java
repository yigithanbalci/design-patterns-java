package org.example.creational_design_patterns.prototype;

public class CloneFactory {

    public Animal getClone(Animal animal){
        return animal.makeCopy();
    }
}
