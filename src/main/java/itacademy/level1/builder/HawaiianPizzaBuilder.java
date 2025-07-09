package itacademy.level1.builder;

import java.util.ArrayList;
import java.util.List;

public class HawaiianPizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public void setDough(String dough) {
        this.dough = dough;
    }

    @Override
    public void addTopping(String topping) {
        toppings.add(topping);
    }

    @Override
    public Pizza build() {
        if (!toppings.contains("ham")) toppings.add("ham");
        if (!toppings.contains("pineapple")) toppings.add("pineapple");
        return new Pizza(size, dough, toppings);
    }
}
