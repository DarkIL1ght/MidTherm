package OnlinePaymentGateway.Adapter;

import OnlinePaymentGateway.Adapter.PayPalValidate;
import OnlinePaymentGateway.PaymentTypes.PaymentType;

public class PayPalAdapter implements PaymentType {
    private PayPalValidate validate;
    private String id;
    private double balance;

    public PayPalAdapter(String id, double balance) {
        this.id = id;
        this.balance = balance;
        this.validate = new PayPalValidate();
    }
    public PayPalAdapter() {
    }

    @Override
    public void Payment(double amount) {
        if (balance < amount) {
            System.out.println("Not enough in PayPal account");
        }
        else {
            balance-=amount;
            System.out.println("Processing paypal card payment of $: "+amount);
        }
    }

    public PayPalValidate getValidate() {
        return validate;
    }

    public void setValidate(PayPalValidate validate) {
        this.validate = validate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}