package OnlinePaymentGateway;

import OnlinePaymentGateway.Exception.PaymentException;
import OnlinePaymentGateway.Factory.ConcretePaymentFactory;
import OnlinePaymentGateway.Factory.PaymentFactory;
import OnlinePaymentGateway.PaymentTypes.PaymentType;

public class Demo {
    public static void main(String[] args) {
        PaymentFactory Factory = new ConcretePaymentFactory();
        PaymentType kaspiPayment = Factory.createPayment("creditcard", "1234-5678-9012-3456", 3000.0);
        PaymentType paypalPayment = Factory.createPayment("paypal", "Darhan_ID@", 9000);
        try{
            kaspiPayment.Payment(500.0);
            paypalPayment.Payment(200.0);
        } catch(
                PaymentException e)
        {
            System.out.println("Error: " + e.getMessage());
        }
    }

}
