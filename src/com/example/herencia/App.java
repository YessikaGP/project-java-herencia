package com.example.herencia;

import com.example.herencia.model.*;

public class App {
    public static void main(String[] args) {
        Engine e1 = new Engine(150, "Gasoline");
        Engine e2 = new Engine(80, "Electric");

        Wheel wCar = new Wheel(16);
        Wheel wMoto = new Wheel(18);

        Vehicle car = new com.example.herencia.model.Car("Toyota", "Corolla", e1, 4, wCar);
        Vehicle moto = new com.example.herencia.model.Motorcycle("Honda", "CBR500R", e2, false, wMoto);

        // Polimorfismo: los dos son Vehicle
        Vehicle[] garage = { car, moto };

        System.out.println("=== Descripción de vehículos en garage ===");
        for (Vehicle v : garage) {
            // Llamada polimórfica a describe()
            System.out.println(v.describe());
            v.start();
            v.showEngineInfo();
            v.stop();
            System.out.println();
        }

        // Ejemplo de llamada directamente al método de la clase base
        System.out.println("Resumen final:");
        for (Vehicle v : garage) {
            System.out.println(v.describe());

        }
    }
}