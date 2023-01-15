package com.example.Controllers;

import com.example.Service.Order;
import com.example.store.Flower;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
    private final List<Order> allOrders = new ArrayList<>();


    public OrderController(){
        Flower flower1 = new Flower("flower1",  10, 100, "red");
        Flower flower2 = new Flower("flower2",9, 10, "blue");
        Flower flower3 = new Flower("flower3",8, 40, "white");

        Order order1 = new Order();
        Order order2 = new Order();

        order1.addItem(flower1);
        order1.addItem(flower2);
        order2.addItem(flower3);

        allOrders.add(order1);
        allOrders.add(order2);
    }

    @GetMapping
    public List<Order> getOrders(){
        return allOrders;
    }

}
