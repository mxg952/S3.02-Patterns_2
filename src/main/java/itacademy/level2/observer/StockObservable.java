package itacademy.level2.observer;

public interface StockObservable {

    void addObserver(StockObserver o);
    void deleteObserver(StockObserver o);

    void setEstatBorsa(String nouEstat);

    void notifyObserver();
}
