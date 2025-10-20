package itacademy.level1.builder;

public class Pizza {
    private String size;
    private String dough;
    private String toppings;

    public Pizza() {
    }

    public Pizza(String size, String dough, String toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public void setToppings(String toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", dough=" + dough + ", toppings=" + toppings + "]";
    }
}
