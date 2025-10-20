package itacademy.level1.master;

import itacademy.level1.builder.Pizza;
import itacademy.level1.builder.PizzaBuilder;

public class MestrePizzer {
    private PizzaBuilder pizzaBuilder;

    public void setPizzaBuilder(PizzaBuilder pb) {
        this.pizzaBuilder = pb;
    }

    public void buildPizza(String size, String dough) {
        pizzaBuilder.buildSize(size);
        pizzaBuilder.buildDough(dough);
        pizzaBuilder.buildToppings();
    }

    public Pizza getPizza() {
        return pizzaBuilder.buildPizza();
    }

}
