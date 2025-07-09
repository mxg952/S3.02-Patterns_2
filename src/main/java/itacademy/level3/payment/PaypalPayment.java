package itacademy.level3.payment;

public class PaypalPayment implements PaymentMethod {

    private String email;

    public PaypalPayment(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagat " + amount + "€ via PayPal amb e-mail" + email);

    }
}
