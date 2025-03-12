package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(double avgKmPerLitre, int batterySize) {
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public ElectricCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine() {
        System.out.println("ElectricCar engine is starting");
    }

    @Override
    public void drive() {
        System.out.println("ElectricCar is driving");
        runEngine();
    }


}