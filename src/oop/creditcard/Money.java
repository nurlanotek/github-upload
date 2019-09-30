package oop.creditcard;

public class Money {
    private long dollars;
    private long cents;
    private double amount;

    public Money(double amount) {
        this.amount = amount;
        this.dollars = (int) amount;
        this.cents = (int)((amount - this.dollars) * 100);
    }

    public Money(Money newMoney) {
        super(newMoney.getAmount());
    }

    public long getDollars() {
        return dollars;
    }

    public long getCents() {
        return cents;
    }

    public double getAmount() {
        return amount;
    }


}
