package org.example.arge;

public class HybridCar extends CarSkeleton{
    private double avgKmPerLiter;
    private int cylinders;
    private int batterySize;

    public HybridCar(double avgKmPerLiter, int cylinders, int batterySize) {
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public HybridCar(String name, String description, double avgKmPerLiter, int cylinders, int batterySize) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("HybridCar engine is starting");
    }

    @Override
    public void drive() {
        System.out.println("HybridCar is driving");
        runEngine();
    }

}