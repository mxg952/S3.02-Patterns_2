package itacademy.level3.gateway;

import itacademy.level3.payment.PaymentMethod;

public class PaymentGateway {
    public void processPayment(double amount, PaymentMethod method) {
        method.pay(amount);
    }
}

