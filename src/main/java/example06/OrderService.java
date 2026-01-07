package example06;

public class OrderService {
    public void processPayment(Payment method, double amount) {
        method.pay(amount);
    }
}
