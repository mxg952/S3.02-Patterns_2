package itacademy.level3.main;

import itacademy.level3.payment.BankAccountPayment;
import itacademy.level3.payment.CardPayment;
import itacademy.level3.payment.PaymentMethod;
import itacademy.level3.payment.PaypalPayment;
import itacademy.level3.shop.ShoeShop;

public class Main {

    public static void main(String[] args) {
        ShoeShop store = new ShoeShop();

        PaymentMethod card = new CardPayment("1234-5678-9012-3456");
        PaymentMethod paypal = new PaypalPayment("client@email.com");
        PaymentMethod bank = new BankAccountPayment("ES12 3456 7890 1234 5678 9012");

        store.sellShoes(59.99, card);
        store.sellShoes(79.99, paypal);
        store.sellShoes(39.99, bank);
    }
}
