package com.example.Service;

import com.example.delivery.Delivery;
import com.example.payment.Payment;
import com.example.store.Item;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Order {
    @Getter
    private final List<Item> itemList = new ArrayList<>();
    @Getter
    private final String id = UUID.randomUUID().toString();
    private Payment payment;
    private Delivery delivery;
    @Getter
    private boolean isProcessed;

    public void addItem(Item item){
        itemList.add(item);
    }

    public void removeItem(Item item){
        itemList.remove(item);
    }

    public void setPaymentStrategy(Payment payment) {
        this.payment = payment;
    }

    public void setDeliveryStrategy(Delivery delivery) {
        this.delivery = delivery;
    }

    public double calculateTotalPrice() {
        double price = 0;
        for (Item item : itemList) {
            price += item.price();
        }
        return price;
    }

    public List<String> processOrder(){
        double orderPrice = calculateTotalPrice();
        String paymentResult = payment.pay(orderPrice);
        String deliveryResult = delivery.deliver(itemList);
        isProcessed = true;
        return List.of(paymentResult, deliveryResult);
    }
}
