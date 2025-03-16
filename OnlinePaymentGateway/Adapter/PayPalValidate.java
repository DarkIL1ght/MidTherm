package OnlinePaymentGateway.Adapter;

public class PayPalValidate {
    public boolean validateCard(String id) {
        System.out.printf("Validating card: Id",id);
        return true;
    }
}
