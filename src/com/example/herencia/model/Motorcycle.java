package com.example.herencia.model;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private Wheel wheel;

    public Motorcycle(String brand, String model, Engine engine, boolean hasSidecar, Wheel wheel) {
        super(brand, model, engine);
        this.hasSidecar = hasSidecar;
        this.wheel = wheel;
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " -> Encendiendo moto (" + engine.getDescription() + ")...");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " -> Apagando moto.");
    }

    @Override
    public String describe() {
        return String.format("Motorcycle: %s %s, sidecar=%b, rueda %s, %s",
                brand, model, hasSidecar, wheel.toString(), engine.getDescription());
    }
}
