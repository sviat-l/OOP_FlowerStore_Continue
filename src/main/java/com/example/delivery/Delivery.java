package com.example.delivery;

import com.example.store.Item;
import lombok.Getter;

import java.util.List;

public interface Delivery {
    public String deliver(List<Item> items);
    public String getId();
    public String getDescription();

}
