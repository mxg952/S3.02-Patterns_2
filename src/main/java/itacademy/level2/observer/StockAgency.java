package itacademy.level2.observer;

public class StockAgency implements StockObserver {

    private String name;

    public StockAgency(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(this.name + " rep notificació: " + message);

    }
}
