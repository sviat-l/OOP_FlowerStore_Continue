package com.example.payment;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter @NoArgsConstructor @AllArgsConstructor
public class CreditPayment  implements Payment{
    private String name = "Name0";
    private String description = "default CreditPayment description";

    @Override
    public String pay(double price){
        return "Payment by Credit Card is successful";
    }
}
