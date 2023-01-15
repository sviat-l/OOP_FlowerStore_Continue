package com.example.delivery;

import com.example.store.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;


@Getter @NoArgsConstructor @AllArgsConstructor
public class DHLDelivery implements Delivery{
    @Getter
    private String description = "default DHLDelivery description";
    @Getter
    private String id = "0";

    @Override
    public String deliver(List<Item> items){
        return "Delivery by DHLDelivery is successful";
    }
}