package com.example.decorators;

import com.example.store.Item;

public class BasketDecorator extends AbstractDecorator {

    private final Item item;

    public BasketDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return "basket decorator + " + item.getDescription();
    }

    @Override
    public double getPrice() {
        return 4 + item.price();
    }
}