package com.example.Controllers;

import com.example.payment.CreditPayment;
import com.example.payment.PayPalPayment;
import com.example.payment.Payment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {

    @GetMapping
    public List<? extends Payment> getPayment(){
        return List.of(new PayPalPayment(), new CreditPayment());
    }
}
