package models;

public class Balance {
    private final String Currency;
    private final double amount;

    public Balance(String currency, double amount) {
        Currency = currency;
        this.amount = amount;
    }
}
