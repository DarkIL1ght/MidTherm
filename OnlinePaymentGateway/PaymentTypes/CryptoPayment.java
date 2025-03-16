package OnlinePaymentGateway.PaymentTypes;

import OnlinePaymentGateway.Exception.InsufficientFundsException;
import OnlinePaymentGateway.TransactionLogger;

public class CryptoPayment implements PaymentType {
    private String Address;
    double balance;

    public CryptoPayment(String walletAddress,double balance) {
        this.Address = walletAddress;
        this.balance = balance;
    }

    public CryptoPayment() {
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
            TransactionLogger.log("Crypto payment succeeded: $" + amount);
        } catch (Exception e) {
            TransactionLogger.log("Crypto payment failed: " + e.getMessage());
            throw e;
        }
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
