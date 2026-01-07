package oop;

public class Person {
    private String name;
    private int age;
    private int cashAmount;

    //Getter & Setter 메소드

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        }
    }

    public int getAge() {
        return age;
    }
    public void setCashAmount(int cashAmount) {
        this.cashAmount = cashAmount;
    }

    public int getCashAmount(){
        return cashAmount;
    }
}
