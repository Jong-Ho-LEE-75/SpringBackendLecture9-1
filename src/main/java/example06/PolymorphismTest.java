package example06;

public class PolymorphismTest {
    public static void main(String[] args) {

        OrderService service = new OrderService();

        Payment[] payments = {
                new CreditCardPayment(),
                new AccountTransferPayment()
        };

        double[] paymentAmounts = { 30000, 70000 };

        for (int i = 0; i < payments.length; i++) {
            service.processPayment(payments[i], paymentAmounts[i]);
        }
    }
}