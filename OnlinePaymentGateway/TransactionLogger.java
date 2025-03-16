package OnlinePaymentGateway;

public class TransactionLogger {
    public static void log(String message) {
        System.out.println("[Transaction] " + java.time.LocalDateTime.now() + " | " + message);
    }
}