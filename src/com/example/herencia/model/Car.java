package com.example.herencia.model;

public class Car extends Vehicle {
    private int doors;
    private Wheel wheel;

    public Car(String brand, String model, Engine engine, int doors, Wheel wheel) {
        super(brand, model, engine);
        this.doors = doors;
        this.wheel = wheel;
    }

    @Override
    public void start() {
        System.out.println(brand + " " + model + " -> Encendiendo carro (" + engine.getDescription() + ")...");
    }

    @Override
    public void stop() {
        System.out.println(brand + " " + model + " -> Apagando carro.");
    }

    @Override
    public String describe() {
        return String.format("Car: %s %s, %d puertas, rueda %s, %s",
                brand, model, doors, wheel.toString(), engine.getDescription());
    }
}
