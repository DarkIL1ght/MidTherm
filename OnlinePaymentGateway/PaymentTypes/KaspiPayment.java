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

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
