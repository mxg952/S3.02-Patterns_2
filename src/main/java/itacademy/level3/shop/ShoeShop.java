package itacademy.level3.shop;

import itacademy.level3.gateway.PaymentGateway;
import itacademy.level3.payment.PaymentCallback;
import itacademy.level3.payment.PaymentMethod;

public class ShoeShop {

    private PaymentGateway gateway = new PaymentGateway();

    public void sellShoes(double price, PaymentMethod method) {
        System.out.println("\nVenta per " + price + "€");

    PaymentCallback callback = new PaymentCallback() {

        @Override
        public void onSuccess(double amount) {
            System.out.println("Pagament de " + amount + "€ completat amb èxit!");

        }

        @Override
        public void onError(String message) {
            System.out.println("❌ Error en el pagament: " + message);
        }
    };

    gateway.processPayment(price,method,callback);
   }

}
