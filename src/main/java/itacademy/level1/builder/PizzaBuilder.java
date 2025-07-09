package itacademy.level1.builder;

public interface PizzaBuilder {
    void setSize(String size);

    void setDough(String dough);

    void addTopping(String topping);

    Pizza build();
}

