package designPatterns;

import designPatterns.Client.Client;

public class OrderPizza extends Command {

    @Override
    public void execute(PizzaFactory pizzaFactory, String pizzaType, String pizzaToppings, Client client) {
        pizzaFactory.takeOrder(pizzaType, pizzaToppings, client);    
    }
    
}
