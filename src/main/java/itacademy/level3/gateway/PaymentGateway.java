package itacademy.level3.gateway;

import itacademy.level3.payment.PaymentMethod;

public class PaymentGateway {
    public void processPayment(double amount, PaymentMethod method) {
        method.pay(amount);
    }
    // La passarel·la només sap que ha d'executar pay() method.pay(amount);
    // Després retorna el control (no sap res més del procés)
}

