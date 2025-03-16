package OnlinePaymentGateway.PaymentTypes;

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
        if (balance < amount) {
            System.out.println("Not enough in Crypto account");
        }
        else {
            balance-=amount;
            System.out.println("Processing crypto payment of $: "+amount);
        }
    }
}
