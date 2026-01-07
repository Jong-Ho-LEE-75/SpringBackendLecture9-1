package oop;

public class BankDriver {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("김철수");
        p1.setAge(25);
        p1.setCashAmount(100000);

        BankAccount a1 = new BankAccount();
        a1.setBalance(500000);
        a1.setOwner(p1);

        // 테스트 케이스
        System.out.println(a1.deposit(30000));
        System.out.println(a1.withdraw(170000));
        System.out.println(a1.deposit(620000));
        System.out.println(a1.withdraw(500000));
    }
}