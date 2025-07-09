package itacademy.level1;

import itacademy.level1.builder.HawaiianPizzaBuilder;
import itacademy.level1.builder.VeggiePizzaBuilder;
import itacademy.level1.builder.Pizza;
import itacademy.level1.builder.PizzaBuilder;
import itacademy.level1.master.MestrePizzer;

public class Main {
    public static void main(String[] args) {
        // Hawaiana
        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        MestrePizzer mestreHawaiian = new MestrePizzer(hawaiianBuilder);

        Pizza hawaiian = mestreHawaiian.makeMediumThinHawaiian();
        System.out.println(hawaiian);

        // Vegetariana
        PizzaBuilder veggieBuilder = new VeggiePizzaBuilder();
        MestrePizzer mestreVeggie = new MestrePizzer(veggieBuilder);

        Pizza veggie = mestreVeggie.makeLargeThickVeggie();
        System.out.println(veggie);
    }
}
