package com.example.delivery;

import com.example.store.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Getter @NoArgsConstructor @AllArgsConstructor
public class PostDelivery implements Delivery{
    private String description = "default PostDelivery description";
    private String id="0";
    @Override
    public String deliver(List<Item> items){
        return "Delivery by Post is successful";
    }
}
