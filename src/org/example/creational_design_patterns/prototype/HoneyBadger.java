package org.example.creational_design_patterns.prototype;

public class HoneyBadger implements Animal{

    @Override
    public Animal makeCopy() {
        HoneyBadger honeyBadger;

        try {
            honeyBadger = (HoneyBadger) super.clone();
            //do some logic for fields for deep copy. beware shallow vs deep copy.
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return honeyBadger;
    }
}
