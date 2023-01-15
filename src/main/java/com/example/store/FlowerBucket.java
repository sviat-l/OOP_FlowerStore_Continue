package com.example.store;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class FlowerBucket extends Item{
    private final List<Flower> bucket = new ArrayList<>();

    private double price;

    public FlowerBucket(String description) {
        super(description);
    }

    public void addFlower(Flower newFlower) {
        this.bucket.add(newFlower);
    }

    @Override
    public double price() {
        price = 0.0;
        for (Flower flower : this.bucket) {
            price += flower.getPrice();
        }
        return price;
    }

    public List<Flower> allFlowers() {
        return new ArrayList<>(bucket);
    }

    public boolean searchFlower(Flower flower){
        for (Flower current: bucket){
            if (current.equals(flower)){
                return true;
            }
        }
        return false;
    }

}
