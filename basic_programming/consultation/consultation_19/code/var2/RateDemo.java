package code.var2;


import code.var1.CurrencyRate;

import java.time.LocalDate;

public class RateDemo {
    public static void main(String[] args) {
        CurrencyRateHistory history = new CurrencyRateHistory();


        history.addRate("USD", LocalDate.of(2024,3,25), 35.3);
        history.addRate("EUR", LocalDate.of(2024,3,25), 39.5);
        history.addRate("USD", LocalDate.of(2024,3,26), 35.5);

        history.printHistory();
    }
}
