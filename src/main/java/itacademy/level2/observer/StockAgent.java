package itacademy.level2.observer;

import java.util.ArrayList;
import java.util.List;

public class StockAgent implements StockObservable {
    private List<StockObserver> observers = new ArrayList<>();
    private String stockState;

    @Override
    public void addObserver(StockObserver o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(StockObserver o) {
        observers.remove(o);
    }

    @Override
    public void setEstatBorsa(String stockState) {
        this.stockState = stockState;
        notifyObserver();
    }

    @Override
    public void notifyObserver() {
        for (StockObserver observer : observers) {
            observer.update("La borsa ara està: " + stockState);
        }
    }
}
