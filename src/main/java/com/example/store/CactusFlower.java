package com.example.store;

import lombok.Getter;

public class CactusFlower extends Flower {

    public CactusFlower(String description, int sepalLength, double price) {
        super(description, sepalLength, price, "green");
    }

    @Override
    public double price() {
        return price;
    }
}
