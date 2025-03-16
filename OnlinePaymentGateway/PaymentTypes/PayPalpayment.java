package OnlinePaymentGateway.PaymentTypes;

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
        if (balance < amount) {
            System.out.println("Not enough in PayPal account");
        }
        else {
            balance-=amount;
            System.out.println("Processing paypal card payment of sum: "+amount);
        }
    }
}
