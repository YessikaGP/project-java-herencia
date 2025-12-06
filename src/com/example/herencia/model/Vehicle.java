package com.example.herencia.model;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected Engine engine;

    public Vehicle(String brand, String model, Engine engine) {
        this.brand = brand;
        this.model = model;
        this.engine = engine;
    }

    public abstract void start();
    public abstract void stop();

    // Método que puede ser sobreescrito para dar más detalles
    public String describe() {
        return String.format("%s %s - Motor: %s", brand, model, engine.getDescription());
    }

    // ejemplo de comportamiento común que usa composición
    public void showEngineInfo() {
        System.out.println("-> " + engine.getDescription());
    }
}
