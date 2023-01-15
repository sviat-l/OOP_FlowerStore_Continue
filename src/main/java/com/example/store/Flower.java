package com.example.store;

import lombok.*;

//import javax.persistence.*;


@Setter @Getter
//@Table @Entity
public class Flower extends Item{
    private int sepalLength;

    public double price;
    private String color;

//    @Id@GeneratedValue
//    private int id;
//    public Flower() {
//        super("NoArg Flower");
//    }


    public Flower(String description, int sepalLength, double price, String color){
        super(description);
        this.sepalLength = sepalLength;
        this.price = price;
        this.color = color;
    }

    @Override
    public double price() {
        return price;
    }
}
