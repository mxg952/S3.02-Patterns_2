package itacademy.level1.builder;

import java.util.List;

public class Pizza {
    private String size;
    private String dough;
    private List<String> toppings;

    public Pizza(String size, String dough, List<String> toppings) {
        this.size = size;
        this.dough = dough;
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        return "Pizza [size=" + size + ", dough=" + dough + ", toppings=" + toppings + "]";
    }
}
