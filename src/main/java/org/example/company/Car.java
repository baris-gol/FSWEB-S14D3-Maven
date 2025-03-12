package org.example.company;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", cylinders=" + cylinders +
                ", name='" + name + '\'' +
                ", wheels=" + wheels +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Car car = (Car) obj;
        return cylinders == car.cylinders && name.equals(car.name);
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting");
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName() + " is accelerating");
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName() + " is braking");
        return "the car is braking";
    }

    public boolean isEngine() {
        return engine;
    }

    public int getWheels() {
        return wheels;
    }
}