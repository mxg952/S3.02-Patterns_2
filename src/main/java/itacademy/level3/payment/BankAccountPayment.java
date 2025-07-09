package itacademy.level3.payment;

public class BankAccountPayment implements PaymentMethod {

    private String iban;

    public BankAccountPayment(String iban) {
        this.iban = iban;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagat " + amount + "€ via compte bancària amb IBAN: " + iban);
    }


}
