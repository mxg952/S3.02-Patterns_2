package itacademy.level1.builder;

public interface PizzaBuilder {
    void buildSize(String size);
    void buildDough(String dough);
    void buildToppings();
    Pizza buildPizza();
}

