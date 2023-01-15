package com.example.decorators;


import com.example.store.Item;
import lombok.Getter;

@Getter
public class PaperDecorator extends AbstractDecorator {

    private final Item item;

    public PaperDecorator(Item item) {
        this.item = item;
    }

    @Override
    public String getDescription() {
        return "paperDecorator + " + item.getDescription();
    }

    @Override
    public double getPrice() {
        return 13 + item.price();
    }
}