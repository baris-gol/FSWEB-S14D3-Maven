package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting");
        return "Mitsubishi engine is starting";
    }

    @Override
    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating");
        return "Mitsubishi is accelerating";
    }

    @Override
    public String brake() {
        System.out.println(getClass().getSimpleName() + " is braking");
        return "Mitsubishi is braking";
    }
}