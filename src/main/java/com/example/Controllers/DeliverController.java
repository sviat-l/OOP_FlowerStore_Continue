package com.example.Controllers;

import com.example.delivery.DHLDelivery;
import com.example.delivery.Delivery;
import com.example.delivery.PostDelivery;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/deliveries")
public class DeliverController {

    @GetMapping
    public List<? extends Delivery> getDelivery(){
        return List.of(new PostDelivery(), new DHLDelivery());
    }
}
