package code.var1;

import java.util.ArrayList;
import java.util.List;

public class CurrencyRateHistory {
    private List<CurrencyRate> history;

    public CurrencyRateHistory() {
        this.history = new ArrayList<>();
    }

    public void addRate(CurrencyRate rate){
        history.add(rate);
    }

  public void printHistory(){
        for (CurrencyRate rate : history){
            System.out.println(rate);
        }
  }
}
