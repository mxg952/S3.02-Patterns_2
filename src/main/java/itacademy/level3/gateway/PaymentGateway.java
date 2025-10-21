package itacademy.level3.gateway;

import itacademy.level3.payment.PaymentCallback;
import itacademy.level3.payment.PaymentMethod;

public class PaymentGateway {
    public void processPayment(double amount, PaymentMethod method, PaymentCallback callback) {
        try {
            method.pay(amount);
            callback.onSuccess(amount);
        } catch (Exception e) {
            callback.onError("Error al procesar el pago: " + e.getMessage());
        }
    }
}

