package OnlinePaymentGateway.PaymentTypes;

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

    @Override
    public void Payment(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds on credit card");
        }
        else {balance -= amount;
            System.out.println("Processing credit card payment of sum: "+amount);
        }
    }
}
