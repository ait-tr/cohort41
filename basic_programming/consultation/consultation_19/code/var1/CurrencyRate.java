package code.var1;

import java.time.LocalDate;

public class CurrencyRate {
    private LocalDate date;
    private String currencyName;
    private double rate;

    public CurrencyRate(LocalDate date, String currencyName, double rate) {
        this.date = date;
        this.currencyName = currencyName;
        this.rate = rate;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCurrencyName() {
        return currencyName;
    }

    public double getRate() {
        return rate;
    }

    @Override
    public String toString() {
        return "CurrencyRate{" +
                "date=" + date +
                ", currencyName='" + currencyName + '\'' +
                ", rate=" + rate +
                '}';
    }
}
