package example05;

public class Order {
    private Payment payment;

    public Order(Payment payment) {
        this.payment = payment;
    }

    public void process(double amount) {
        payment.pay(amount);
    }

    public void cancel(double amount) {
        payment.cancel(amount);
    }
}