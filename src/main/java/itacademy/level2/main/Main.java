package itacademy.level2.main;

import itacademy.level2.observer.StockAgency;
import itacademy.level2.observer.StockAgent;

public class Main {
    public static void main(String[] args) {

        StockAgent agent = new StockAgent();

        StockAgency agency = new StockAgency("S.A brokers");
        StockAgency agency2 = new StockAgency("S.O stockers");

        agent.addObserver(agency);
        agent.addObserver(agency2);

        agent.setEstatBorsa("pujant");
        agent.setEstatBorsa("baixant");

    }
}
