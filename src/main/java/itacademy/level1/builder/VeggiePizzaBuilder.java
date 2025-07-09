package itacademy.level1.builder;

import java.util.ArrayList;
import java.util.List;

public class VeggiePizzaBuilder implements PizzaBuilder {
    private String size;
    private String dough;
    private List<String> toppings = new ArrayList<>();

    @Override
    public void setSize(String size) { this.size = size; }

    @Override
    public void setDough(String dough) { this.dough = dough; }

    @Override
    public void addTopping(String topping) { toppings.add(topping); }

    @Override
    public Pizza build() {
        if (!toppings.contains("peppers")) toppings.add("peppers");
        if (!toppings.contains("onion")) toppings.add("onion");
        if (!toppings.contains("mushrooms")) toppings.add("mushrooms");
        return new Pizza(size, dough, toppings);
    }
}
