package OnlinePaymentGateway.PaymentTypes;

import OnlinePaymentGateway.Exception.InsufficientFundsException;
import OnlinePaymentGateway.TransactionLogger;

public class PayPalpayment implements PaymentType{
    private String id;
    private double balance;

    public PayPalpayment(String id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public PayPalpayment() {
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
            TransactionLogger.log("PayPal payment succeeded: $" + amount);
        } catch (Exception e) {
            TransactionLogger.log("PayPal payment failed: " + e.getMessage());
            throw e;
        }
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
