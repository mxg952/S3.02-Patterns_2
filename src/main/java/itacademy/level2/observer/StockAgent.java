package itacademy.level2.observer;

import java.util.ArrayList;
import java.util.List;

public class StockAgent {
    private List<StockObserver> observers = new ArrayList<>();
    private String stockState;

    public void addObserver(StockObserver observer) {
        observers.add(observer);
    }

    public void setEstatBorsa(String nouEstat) {
        this.stockState = nouEstat;
        notifyObservers();
    }

    private void notifyObservers() {
        for (StockObserver observer : observers) {
            observer.update("La borsa ara està: " + stockState);
        }
    }

}
