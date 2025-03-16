package OnlinePaymentGateway.Factory;

import OnlinePaymentGateway.Adapter.PayPalAdapter;
import OnlinePaymentGateway.PaymentTypes.CryptoPayment;
import OnlinePaymentGateway.PaymentTypes.KaspiPayment;
import OnlinePaymentGateway.PaymentTypes.PayPalpayment;
import OnlinePaymentGateway.PaymentTypes.PaymentType;

public interface PaymentFactory {
    public abstract PaymentType createPayment(String type, String identifier, double balance);
}