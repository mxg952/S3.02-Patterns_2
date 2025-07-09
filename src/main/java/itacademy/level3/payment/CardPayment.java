package itacademy.level3.payment;

public class CardPayment implements PaymentMethod {

    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagat " + amount + "€ amb targeta de crèdit " + cardNumber);

    }
}
