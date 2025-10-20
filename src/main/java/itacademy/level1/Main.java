package itacademy.level1;

import itacademy.level1.builder.HawaiianPizzaBuilder;
import itacademy.level1.builder.VeggiePizzaBuilder;
import itacademy.level1.builder.Pizza;
import itacademy.level1.builder.PizzaBuilder;
import itacademy.level1.master.MestrePizzer;

public class Main {
    public static void main(String[] args) {

        PizzaBuilder hawaiianBuilder = new HawaiianPizzaBuilder();
        PizzaBuilder vegetarianBuilder = new VeggiePizzaBuilder();
        MestrePizzer pizzer = new MestrePizzer();

        pizzer.setPizzaBuilder(hawaiianBuilder);
        pizzer.buildPizza("Mitjana", "Fina");
        Pizza hawaiian = pizzer.getPizza();
        System.out.println(hawaiian.toString());

        pizzer.setPizzaBuilder(vegetarianBuilder);
        pizzer.buildPizza("Gran", "Fina");
        Pizza vegetarian = pizzer.getPizza();
        System.out.printf(vegetarian.toString());
    }
}
