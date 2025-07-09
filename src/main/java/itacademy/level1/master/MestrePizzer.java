package itacademy.level1.master;

import itacademy.level1.builder.Pizza;
import itacademy.level1.builder.PizzaBuilder;

public class MestrePizzer {
    private PizzaBuilder builder;

    public MestrePizzer(PizzaBuilder builder) {
        this.builder = builder;
    }

    public Pizza makeMediumThinHawaiian() {
        builder.setSize("medium");
        builder.setDough("thin");
        builder.addTopping("cheddar");
        builder.addTopping("bacon");

        return builder.build();
    }

    public Pizza makeLargeThickVeggie() {
        builder.setSize("large");
        builder.setDough("thick");
        builder.addTopping("pepperoni veggie");
        builder.addTopping("carrot");

        return builder.build();
    }

}
