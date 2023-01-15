package com.example.decorators;

import com.example.store.Item;
import lombok.Getter;

@Getter
public class RibbonDecorator extends AbstractDecorator {
    private final Item item;

    public RibbonDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return "RibbonDecorator + " + item.getDescription();
    }

    @Override
    public double getPrice() {
        return 40 + item.price();
    }
}
