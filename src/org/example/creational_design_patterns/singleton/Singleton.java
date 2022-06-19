package org.example.creational_design_patterns.singleton;

public class Singleton {
    //For some Singleton Pattern is a code smell
    // 1) That one instance might be changed everywhere in the project
    // 2) There might be a need for multiple instances, or an extension which is a modified instance
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }

        return instance;
    }
}
