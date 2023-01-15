package com.example.store;

public class RomashkaFlower extends Flower {
    public RomashkaFlower(String description, int sepalLength, double price) {
        super(description, sepalLength, price, "white");
    }

    @Override
    public double price() {
        return price;
    }
}
