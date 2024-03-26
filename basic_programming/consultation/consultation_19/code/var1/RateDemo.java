package code.var1;

import java.time.LocalDate;

public class RateDemo {
    public static void main(String[] args) {
        CurrencyRateHistory history = new CurrencyRateHistory();

        history.addRate(new CurrencyRate(LocalDate.of(2024,3,25), "USD", 35.3));
        history.addRate(new CurrencyRate(LocalDate.of(2024,3,25), "EUR", 39.5));

        history.printHistory();
    }
}
