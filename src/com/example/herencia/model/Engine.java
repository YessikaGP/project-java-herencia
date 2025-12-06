package com.example.herencia.model;

public class Engine {
    private int horsepower;
    private String type; // ej. "Gasoline", "Electric"

    public Engine(int horsepower, String type) {
        this.horsepower = horsepower;
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public String getType() {
        return type;
    }

    public String getDescription() {
        return String.format("%d HP (%s)", horsepower, type);
    }
}
