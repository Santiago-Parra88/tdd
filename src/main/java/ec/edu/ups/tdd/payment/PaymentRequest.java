package ec.edu.ups.tdd.payment;

public class PaymentRequest {
    private double amount;

    public PaymentRequest(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }
}
