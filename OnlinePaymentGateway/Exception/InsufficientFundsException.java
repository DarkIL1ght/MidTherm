package OnlinePaymentGateway.Exception;

public class InsufficientFundsException extends PaymentException {
    public InsufficientFundsException() {
        super("Insufficient funds");
    }
}