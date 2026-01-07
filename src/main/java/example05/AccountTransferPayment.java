package example05;

public class AccountTransferPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("계좌이체로 " + amount + "원 결제 완료.");
    }

    @Override
    public void cancel(double amount) {
        System.out.println("계좌이체 결제 취소: " + amount);
    }
}