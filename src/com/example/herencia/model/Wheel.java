package com.example.herencia.model;

public class Wheel {
    private int sizeInInches;

    public Wheel(int sizeInInches) {
        this.sizeInInches = sizeInInches;
    }

    public int getSizeInInches() {
        return sizeInInches;
    }

    public String toString() {
        return sizeInInches + "\"";
    }
}
