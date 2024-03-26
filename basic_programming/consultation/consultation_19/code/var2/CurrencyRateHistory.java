package code.var2;

import code.var1.CurrencyRate;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CurrencyRateHistory {
    private Map<String, Map<LocalDate, Double>> history;

    public CurrencyRateHistory() {
        this.history = new HashMap<>();
    }

    public void addRate(String currencyName, LocalDate date, Double rate) {
        Map<LocalDate, Double> currencyHistory = history.getOrDefault(currencyName,new HashMap<>());
        currencyHistory.put(date, rate);
        history.put(currencyName,currencyHistory);
    }

  public void printHistory(){
        for (Map.Entry<String, Map<LocalDate, Double>> entry : history.entrySet()){

            String currency = entry.getKey();

            Map<LocalDate, Double> dates = entry.getValue();

            for (Map.Entry<LocalDate, Double> dateEntry : dates.entrySet()){
                System.out.println("Currency: " + currency + " . Date: " + dateEntry.getKey() + " , Rate: " + dateEntry.getValue());
            }
        }
  }
}
