package itacademy.level1.builder;

import java.util.ArrayList;
import java.util.List;

public class VeggiePizzaBuilder implements PizzaBuilder {
    private Pizza pizza;

    public VeggiePizzaBuilder() {
        this.pizza = new Pizza();
    }

    @Override
    public void buildSize(String size) {
        pizza.setSize(size);
    }

    @Override
    public void buildDough(String dough) {
        pizza.setDough(dough);
    }

    @Override
    public void buildToppings() {
        pizza.setToppings("Tomàquet, Formatge, Rúcula, Pebrots");
    }

    @Override
    public Pizza buildPizza() {
        return this.pizza;
    }
}
