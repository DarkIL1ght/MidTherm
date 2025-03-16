package OnlinePaymentGateway.Factory;

import OnlinePaymentGateway.PaymentTypes.CryptoPayment;
import OnlinePaymentGateway.PaymentTypes.KaspiPayment;
import OnlinePaymentGateway.PaymentTypes.PayPalpayment;
import OnlinePaymentGateway.PaymentTypes.PaymentType;

public class ConcretePaymentFactory implements PaymentFactory{
    public PaymentType createPayment(String type, String identifier, double balance){
        switch (type.toLowerCase()) {
            case "creditcard":
                return new KaspiPayment(identifier, "12/25", "123", balance);
            case "paypal":
                return new PayPalpayment(identifier, balance);
            case "crypto":
                return new CryptoPayment(identifier, balance);
            default:
                System.out.println("Unknown payment method: " + type);
                return null;
        }
    }
}
