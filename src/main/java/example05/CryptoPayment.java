package example05;

public class CryptoPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("가상화폐로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("가상화폐 결제 취소: " + amount);
    }
}
