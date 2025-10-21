package itacademy.level3.payment;

public interface PaymentCallback {
    void onSuccess(double amount);
    void onError(String message);
}
