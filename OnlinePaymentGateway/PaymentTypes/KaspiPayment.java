package OnlinePaymentGateway.PaymentTypes;

import OnlinePaymentGateway.Exception.InsufficientFundsException;
import OnlinePaymentGateway.TransactionLogger;

public class KaspiPayment implements PaymentType{
    private String cardNumber;
    private String expiryDate;
    private String cvv;
    private double balance;

    public KaspiPayment(String cardNumber, String expiryDate, String cvv, double balance) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
        this.balance = balance;
    }

    public KaspiPayment() {
    }

    @Override
    public void Payment(double amount) {
        try {
            if (balance < amount) {
                throw new InsufficientFundsException();
            }
            else {
                balance-=amount;
            }
            TransactionLogger.log("Kaspi card payment succeeded: $" + amount);
        } catch (Exception e) {
            TransactionLogger.log("Kaspi card payment failed: " + e.getMessage());
            throw e;
        }
    }
}
