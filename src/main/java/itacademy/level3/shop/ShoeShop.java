package itacademy.level3.shop;

import itacademy.level3.gateway.PaymentGateway;
import itacademy.level3.payment.PaymentMethod;

public class ShoeShop {

    private PaymentGateway gateway = new PaymentGateway();

    public void sellShoes(double price, PaymentMethod method) {
        System.out.println("\nVenta per " + price + "€");
        gateway.processPayment(price, method);
        System.out.println("Pagament processat. Gràcies!");
    }
}
